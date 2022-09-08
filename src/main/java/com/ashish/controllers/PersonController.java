package com.ashish.controllers;

import java.util.List;

import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ashish.models.Person;
import com.ashish.services.PersonService;

@Controller
public class PersonController 
{
	@Autowired
	private PersonService service;
	
	@RequestMapping("/")
	public String getHome()
	{
		return "home";
	}
	
	@RequestMapping("insert")
	public String getPersonView()
	{
		return "add-person";
	}
	
	@RequestMapping("/add")
	public String addPersonRecord(Person person)
	{
		service.addRecord(person);
		return "save-success";
	}
	
	@RequestMapping("/search")
	public String getSearchView()
	{
		return "search";
	}
	
	@RequestMapping("/search-record")
	public String searchPersonRecord(int pid,Model model)
	{
		Person p = service.searchRecord(pid);
		if(p==null)
		{
			model.addAttribute("msg","Person with "+pid+" does not exist.");
			return "search";
		}
		model.addAttribute("person",p);
		return "show-person";
	}
	
	@RequestMapping("/list")
	public String showList(Model model)
	{
		List<Person> list = service.getList();
		model.addAttribute("plist",list);
		return "list";
	}
	
	@RequestMapping("/remove")
	public String getRemoveView()
	{
		return "remove";
	}
	
	@RequestMapping("/remove-record")
	public String removePersonConfirm(int pid,Model model)
	{
		Person p = service.searchRecord(pid);
		if(p==null)
		{
			model.addAttribute("msg","Person with "+pid+" does not exist.");
			return "remove";
		}
		model.addAttribute("person", p);
		return "confirm-delete";
	}
	
	@RequestMapping("/removed")
	public String removePersonRecord(int pid)
	{
		service.removeRecord(pid);
		return "remove-success";
	}
	
	@RequestMapping("/edit")
	public String getUpdateView()
	{
		return "edit";
	}
	
	@RequestMapping("/update")
	public String getPatientRecord(int pid,Model model)
	{
		Person p = service.searchRecord(pid);
		if(p==null)
		{
			model.addAttribute("msg","Person with "+pid+" does not exist.");
			return "edit";
		}
		model.addAttribute("person",p);
		return "update";
	}
	@RequestMapping("/update-record")
	public String updatePersonRecord(Person person)
	{
		service.updateRecord(person);
		return "updated";
	}
}
