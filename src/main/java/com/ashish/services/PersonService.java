package com.ashish.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashish.repositories.PersonRepository;
import com.ashish.models.Person;

import java.util.List;
@Service
public class PersonService
{
	@Autowired
	private PersonRepository repo;

	public Person getRecord(int pid) 
	{
		 return repo.getPerson(pid);
	}

	public void addRecord(Person p) 
	{
		repo.addPerson(p);
	}

	public void removeRecord(int pid) 
	{
		repo.removePerson(pid);
	}

	public Person searchRecord(int pid) 
	{
		Person p= repo.searchPerson(pid);
		return p;
	}

	public List<Person> getList() 
	{
		return repo.getPersonList();
	}

	public void updateRecord(Person person) 
	{
		repo.updatePerson(person);
		
	}

}
