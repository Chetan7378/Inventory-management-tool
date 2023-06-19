package com.r3sys.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import com.r3sys.Dao.ProcessMaterialDao;
import com.r3sys.Model.ProcessMaterial;



@Controller
public class ProcessMaterialController {
	@RequestMapping("/proadd")
	public String addpromaterial(@ModelAttribute  ProcessMaterial processMaterial, HttpServletRequest request)
	{
		ApplicationContext context =new ClassPathXmlApplicationContext("config.xml");
		ProcessMaterialDao processMaterialDao = (ProcessMaterialDao) context.getBean("processMaterialDao", ProcessMaterialDao.class);
		
		int i = processMaterialDao.insert(processMaterial);
		if(i>0)
		{
			return "dashboard";
		}
		else
		{
			return "";
		}
	}
	@RequestMapping("/Viewprocess")
	public String viewpropage(Model m)
	{
		ApplicationContext context =new ClassPathXmlApplicationContext("config.xml");
		ProcessMaterialDao processMaterialDao = (ProcessMaterialDao) context.getBean("processMaterialDao");
		List<ProcessMaterial> processMaterial = processMaterialDao.getAllProcess();
		m.addAttribute("processMaterial", processMaterial);
		return "viewpro";
	}
	
	@RequestMapping(path="/deletepro/{id}", method=RequestMethod.GET)
	public RedirectView deleteProcess(@PathVariable("id") int id, HttpServletRequest request)
	{
		ApplicationContext context =new ClassPathXmlApplicationContext("config.xml");
		ProcessMaterialDao processMaterialDao = (ProcessMaterialDao) context.getBean("processMaterialDao");
		processMaterialDao.deleteProcess(id);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/Viewprocess");
		return redirectView;
}
	@RequestMapping(value="/updatepro",method=RequestMethod.GET)
	public String updatepage(@RequestParam int pid,Model m)
	{
		m.addAttribute("pid", pid);
		return "updatepro";
	}

	@RequestMapping("/insertPq")
	public RedirectView updatepro(HttpServletRequest request)
	{
		ApplicationContext c=new ClassPathXmlApplicationContext("config.xml");
		ProcessMaterialDao processMaterialDao=(ProcessMaterialDao) c.getBean("processMaterialDao");
		 
		
		int new_quantity=Integer.parseInt(request.getParameter("quantity"));
		int pid=Integer.parseInt(request.getParameter("pid"));
		ProcessMaterial upprocess=processMaterialDao.getRaw(pid);
		upprocess.setQuantity(upprocess.getQuantity()+new_quantity);
		
		processMaterialDao.update(upprocess);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/Viewprocess");
		return redirectView;
	}
}
