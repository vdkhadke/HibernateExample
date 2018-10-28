package com.viplav.learn;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;


public class TestPerson {

    public static void main(String[] args) {
        Session session = SessionFactoryUtil.getSessionFactory().getCurrentSession();

        session.beginTransaction();
        createPerson(session);
        queryPerson(session);
        session.getTransaction().commit();

        session.close();
        System.exit(0);
        return;
    }

    private static void queryPerson(Session session) {
        Query query = session.createQuery("from Person");                 
        List <Person>list = query.list();
        java.util.Iterator<Person> iter = list.iterator();
        while (iter.hasNext()) {

            Person person = iter.next();
            System.out.println("Person: \"" + person.getName() +"\", " + person.getSurname() +"\", " +person.getAddress());

        }

        System.out.println("Coming out of it?");
    }

    public static void createPerson(Session session) {
        Person person = new Person();

        person.setName("Barrack");
        person.setSurname("Obama");       
        person.setAddress("D.C.");       

        session.save(person);
    }
}
