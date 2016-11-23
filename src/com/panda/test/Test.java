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
* @date 2016��11��17������1:11:13
* @parameter
* @version
*/
public class Test {
	@org.junit.Test
	public void testHello() {
		Session session = HibernateSessionFactory.getSession();
		Transaction transaction = session.beginTransaction();
		Student student = new Student();
		student.setDescription("����");
		student.setName("����");
		Set<Student> students = new HashSet<>();
		students.add(student);
		Classes classes = new Classes();
		classes.setName("1��");
		classes.setDescription("�а���һ��");
		classes.setStudent(students);
		session.save(classes);
		transaction.commit();
	}
}
