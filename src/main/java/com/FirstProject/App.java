package com.FirstProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    //creating student table
    	
    	Student BBD = new Student();
    	
    	
    	BBD.setSid(1);
    	BBD.setName("Aakash Arora");
    	BBD.setAddress("Lucknow");
    	BBD.setMobileno(829971283);
    	BBD.setFatherName("JK Arora");
    	
    	    	
    //create student address table	
    	
    	StudentAddress add = new StudentAddress();
    	
    	add.setStreet("Kalyani Nagar");
    	add.setCity("Pune");
    	add.setAddedDate(new Date());
    	add.setOpen(true);
    	
                //putting image in the address table
    	        FileInputStream fis = new FileInputStream("src/main/java/DP.jpg");
    	        byte[] data = new byte[fis.available()];
    	        fis.read(data);
    	
    	add.setImage(data);
    	
    	
    	
    	Configuration con = new Configuration().configure("hibernate.cfg.xml");
   
    	SessionFactory sf = con.buildSessionFactory();
   
    	Session session = sf.openSession();
    	
    	Transaction tx= session.beginTransaction();
    	
    	session.save(BBD);
    	session.save(add);
    	 
    	tx.commit();
    	System.out.println("Done...");
    }
}
