package com.panda.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.panda.bean.Classes;
import com.panda.bean.Student;
import com.panda.util.HibernateSessionFactory;

/*
* @author MrC
* @date 2016年11月17日下午1:11:13
* @parameter
* @version
*/
public class Test {
	@org.junit.Test
	public void testHello() {
		Session session = HibernateSessionFactory.getSession();
		Transaction transaction = session.beginTransaction();
		Student student = new Student();
		student.setDescription("男生");
		student.setName("王五");
		Set<Student> students = new HashSet<>();
		students.add(student);
		Classes classes = new Classes();
		classes.setName("1班");
		classes.setDescription("有爱的一班");
		classes.setStudent(students);
		session.save(classes);
		transaction.commit();
	}
}
