package se.iths.martin.inheritance;

public class Student extends Person{
    public int getYhPointsTaken() {
        return yhPointsTaken;
    }

    public void setYhPointsTaken(int yhPointsTaken) {
        this.yhPointsTaken = yhPointsTaken;
    }

    private int yhPointsTaken;

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public String saySomething(){
        return "Student says hi!";
    }
}
