package com.kodilla.abstracts.homework;
public class Person {
    private String firstName;
    private int age;
    private Job job;

    public Person (String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }
    public static void main(String[] args) {
        DentalAssistant dentalAssistant = new DentalAssistant();
        Person firstPerson = new Person("Jane", 33, dentalAssistant);
        System.out.println(firstPerson.firstName + ", " + firstPerson.age + ", " + firstPerson.job.getClass().getSimpleName() + "\n" + "Responsibilities: " + firstPerson.job.getResponsibilities());

        DentalHygienist dentalHygienist = new DentalHygienist();
        Person secondPerson = new Person("Maggie", 30, dentalHygienist);
        System.out.println("\n" + secondPerson.firstName + ", " + secondPerson.age + ", " + secondPerson.job.getClass().getSimpleName() + "\n" + "Responsibilities: " + secondPerson.job.getResponsibilities());

        DentalTechnician dentalTechnician = new DentalTechnician();
        Person thirdPerson = new Person("Owen", 36, dentalTechnician);
        System.out.println("\n" + thirdPerson.firstName + ", " + thirdPerson.age + ", " + thirdPerson.job.getClass().getSimpleName() + "\n" + "Responsibilities: " + thirdPerson.job.getResponsibilities());
    }
}

