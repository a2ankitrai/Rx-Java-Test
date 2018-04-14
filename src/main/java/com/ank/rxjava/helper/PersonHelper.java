package com.ank.rxjava.helper;

import java.util.ArrayList;
import java.util.List;

import com.ank.rxjava.resource.Person;

public class PersonHelper {

	public static List<Person> createPersonList(){
		
		List<Person> personList = new ArrayList<>();
		
		Person p1 = new Person("Scott",26);
		Person p2 = new Person("Tina",23);
		Person p3 = null;
		Person p4 = new Person("Joey",34);
		
		personList.add(p1);
		personList.add(p2);
		personList.add(p3);
		personList.add(p4);
		
		return personList;
	}
}
