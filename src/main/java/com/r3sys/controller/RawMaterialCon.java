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

import com.r3sys.Dao.RawMaterialDao;
import com.r3sys.Model.RawMaterial;

@Controller
public class RawMaterialCon {
	@RequestMapping("/AddRaw")
	public String addrawmaterial(@ModelAttribute  RawMaterial rawMaterial, HttpServletRequest request)
	{
		ApplicationContext context =new ClassPathXmlApplicationContext("config.xml");
		RawMaterialDao rawMaterialDao = (RawMaterialDao) context.getBean("rawMaterialDao", RawMaterialDao.class);
		
		int i = rawMaterialDao.insert(rawMaterial);
		if(i>0)
		{
			return "dashboard";
		}
		else
		{
			return "";
		}
	
	}
	@RequestMapping("/viewRaw")
	public String viewrawpage(Model m)
	{
		ApplicationContext context =new ClassPathXmlApplicationContext("config.xml");
		RawMaterialDao rawMaterialDao = (RawMaterialDao) context.getBean("rawMaterialDao");
		List<RawMaterial> rawMaterial = rawMaterialDao.getAllRaw();
		m.addAttribute("rawMaterial", rawMaterial);
		return "viewRawm";
		}
	@RequestMapping(path="/delete/{id}", method=RequestMethod.GET)
	public RedirectView deleteRaw(@PathVariable("id") int id, HttpServletRequest request)
	{
		ApplicationContext context =new ClassPathXmlApplicationContext("config.xml");
		RawMaterialDao rawMaterialDao = (RawMaterialDao) context.getBean("rawMaterialDao");
		rawMaterialDao.deleteRaw(id);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/viewRaw");
		return redirectView;
	
}
	@RequestMapping(value="/issueR",method=RequestMethod.GET)
	public String issuepage(@RequestParam int id,Model m)
	{
		m.addAttribute("id", id);
		return "updateR";
	}
	@RequestMapping(value="/updateR",method=RequestMethod.GET)
	public String updatepage(@RequestParam int id,Model m)
	{
		m.addAttribute("id", id);
		return "updateR";
	}
	@RequestMapping("/insertQ")
	public RedirectView updateRaw(HttpServletRequest request)
	{
		ApplicationContext c=new ClassPathXmlApplicationContext("config.xml");
		 RawMaterialDao rawMaterialDao=(RawMaterialDao) c.getBean("rawMaterialDao");
		 
		
		int new_quantity=Integer.parseInt(request.getParameter("quantity"));
		int id=Integer.parseInt(request.getParameter("id"));
		RawMaterial uprawMaterial=rawMaterialDao.getRaw(id);
		uprawMaterial.setQuantity(uprawMaterial.getQuantity()+new_quantity);
		
		rawMaterialDao.update(uprawMaterial);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/viewRaw");
		return redirectView;
	}

	

}
