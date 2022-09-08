package com.ashish.repositories;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ashish.models.Person;

import java.util.List;
@Repository
public class PersonRepository 
{
	@Autowired
	private SessionFactory factory;
	private Session ses;
	private Transaction t;
	
	public PersonRepository(SessionFactory factory) 
	{
		this.factory=factory;
		ses = factory.openSession();
		t = ses.getTransaction();
	}

	public Person getPerson(int pid) 
	{
		Person p = ses.get(Person.class, pid);
		return p;
	}

	public void addPerson(Person p) 
	{
		t = ses.beginTransaction();
		ses.save(p);
		t.commit();
	}

	public void removePerson(int pid) 
	{
		t = ses.beginTransaction();
		Query query = ses.createQuery("delete from Person where pid=:personid");
		query.setParameter("personid", pid);
		query.executeUpdate();
		t.commit();
	}

	public Person searchPerson(int pid) 
	{
		Person p = ses.get(Person.class, pid);
		return p;
	}

	public List<Person> getPersonList() 
	{
		Query<Person> query = ses.createQuery("from Person");
		List<Person> list = query.getResultList();
		return list;
	}

	public void updatePerson(Person person)
	{
		t = ses.beginTransaction();
		Person p = ses.get(Person.class,person.getPid());
		p.setPid(person.getPid());
		p.setName(person.getName());
		p.setCity(person.getCity());
		t.commit();
	}
	
}
