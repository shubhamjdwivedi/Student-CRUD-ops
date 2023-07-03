package com.FirstProject;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchingData {

	public static void main(String[] args) throws IOException {
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml");
		   
    	SessionFactory sf = con.buildSessionFactory();
   
    	Session session = sf.openSession();
    	
    	//get student : 102
    	
    	Student student = (Student)session.load(Student.class, 103);
		System.out.println(student.getName());
		
		 StudentAddress add =(StudentAddress) session.get(StudentAddress.class, 2);
		 System.out.println(add.getStreet());
		}
 //get -  if data is not there, returns null;
	      //use if you are not sure that the database is there or not
	      // always hit the database
//load - if data is not there, throws exception (main funcn me throws decalre karenge)	
	    // if you are sure that data is in data base
		// returns object which is in cache, untill you specifically need get anything from the database
	
}
