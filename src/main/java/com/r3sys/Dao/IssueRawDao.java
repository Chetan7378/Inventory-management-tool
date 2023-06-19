package com.r3sys.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.r3sys.Model.IssueRaw;
import com.r3sys.Model.RawMaterial;
@Component
public class IssueRawDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	@Transactional
	public int insert(IssueRaw issueRaw){
		Integer i=(Integer) this.hibernateTemplate.save(issueRaw);
		return i;
	}
	public List<IssueRaw> getAllIssue() {
		List<IssueRaw> issue = this.hibernateTemplate.loadAll(IssueRaw.class);
		return issue;
		}
	@Transactional
	public void deleteIssue(int id ){
		IssueRaw issueRaw=this.hibernateTemplate.get(IssueRaw.class, id);
		this.hibernateTemplate.delete(issueRaw);
		
	}
	public IssueRaw getIssue(int id){
		IssueRaw issueRaw=this.hibernateTemplate.get(IssueRaw.class, id);
		return issueRaw;
	}
	

}
