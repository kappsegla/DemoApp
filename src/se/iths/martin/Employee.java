package se.iths.martin;

public class Employee {
    private String name;
    private int age;
    private Adress adress;

    //Default constructor
//    public Employee() {
//
//    }

    public Employee(String name, int age, Adress adress)
    {
        this.name = name;
        this.age = age;
        this.adress = adress;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }


}
