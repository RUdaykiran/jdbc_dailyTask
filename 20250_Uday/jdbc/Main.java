package com.sonata.jobtracker;

import java.sql.SQLException;
import com.sonata.jobtracker.model.Task;
import com.sonata.jobtracker.dao.JobTrackerDao;
import com.sonata.jobtracker.dao.impl.JobTrackerDaoImpl;


public class Main {

	public static void main(String[] args){
		JobTrackerDao jt = new JobTrackerDaoImpl();
		Task task=new Task(0, 0, null, null, null, null, null, null, null, null, null);
		task.setTaskId(22);
		task.setOwnerId(7);
		task.setName("uday");
		task.setStatus("new");
		try {
			System.out.println(jt.updateTaskNotes(22,"Hi"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
