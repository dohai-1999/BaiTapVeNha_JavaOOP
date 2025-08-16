package Bai2.Company;

import Bai2.Person.Person;

public class Company {
    public static void main(String[] args) {
        Person person = new Person("Mai", 30, "male", "09999999","HN");
        System.out.println("Name:" + person.getName());
        System.out.println("Age:" + person.getAge());
        System.out.println("Gender:"+person.getGender());

    }
}
