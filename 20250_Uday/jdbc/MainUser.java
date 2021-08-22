package com.sonata.jobtracker;

import java.sql.SQLException;

import java.util.Date;

import javax.swing.text.DateFormatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import com.sonata.jobtracker.model.Task;
import com.sonata.jobtracker.model.User;
import com.sonata.jobtracker.dao.JobTrackerDao;
import com.sonata.jobtracker.dao.JobTrackerDaoUser;
import com.sonata.jobtracker.dao.impl.JobTrackerDaoImplUser;
public class MainUser {
	public static void main(String[] args) throws ParseException
	{
		JobTrackerDaoUser jt = new JobTrackerDaoImplUser();
		User user =new User(null, null, null, null, null, null, null, null, null, null);
		user.setUserId(10);
		user.setUserName("uday");
		user.setEmail("udayvirat100@gmail.com");
		user.setFirstName("uday");
		user.setLastName("kiran");
		user.setContactNumber(8919369246L);
		user.setRole("Manager");
		user.setIsAlive(true);
		String d1="28/04/2000";
		SimpleDateFormat d=new SimpleDateFormat("yyyy-MM-dd");
		long millis=System.currentTimeMillis();
		java.sql.Date s=new java.sql.Date(millis);
		user.setDob(s);
		user.setCreatedOn(s);
		try {
			System.out.println(jt.addUser(user));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
