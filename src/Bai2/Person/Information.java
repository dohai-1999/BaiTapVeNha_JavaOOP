package Bai2.Person;

public class Information {
    public static void main(String[] args) {
        Person person = new Person("Hai",26,"Nữ","098888773737","HN");
        person.getName();
        person.getAge();
        person.getGender();
        person.getPhone();
        person.getAddress();

        System.out.println("Name:" + person.getName());
        System.out.println("Age:" + person.getAge());
        System.out.println("Gender:"+person.getGender());
        System.out.println("Phone:" + person.getPhone());
        System.out.println("Address:" +  person.getAddress());
    }
}
