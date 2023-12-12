package onetonee3.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetonee3.dao.AadharCardDao;
import onetonee3.dao.PersonDao;
import onetonee3.dto.AadharCard;
import onetonee3.dto.Person;

public class PersonAadharCont {
public static void main(String[] args) {
//	Person person=new Person();
//	person.setId(2);
//	person.setName("poonam");
//	person.setAddress("pune");
//	
//	PersonDao personDao=new PersonDao();
//	personDao.savePerson(person);
//	
	
//	AadharCard aadharCard=new AadharCard();
//	aadharCard.setId(200);
//	aadharCard.setAge(20);
//	aadharCard.setName("POONAMG");
//	
//	AadharCardDao aadharCardDao=new AadharCardDao();
//	aadharCardDao.saveAadharCard(2, aadharCard);
//	
	
	
	
//	FIND
//	PersonDao personDao=new PersonDao();
//	personDao.findPerson(1);
//	AadharCardDao aadharCardDao=new AadharCardDao();
//	 aadharCardDao.findAadharCard(200);
//	
	
	
//	UPDATE
//	Person person=new Person();
//	person.setName("poo");
//	person.setAddress("chennai");
//	
//	PersonDao personDao=new PersonDao();
//	personDao.updatePerson(1, person);
//	
//	Deelete
//	AadharCardDao aadharCardDao=new AadharCardDao();
//	aadharCardDao.deleteAadhar(200);
	PersonDao  personDao=new PersonDao();
	personDao.deletePerson(1);
	
	
	
	
}
}
