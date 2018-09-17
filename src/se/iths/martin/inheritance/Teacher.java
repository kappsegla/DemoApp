package se.iths.martin.inheritance;

public class Teacher extends Person {
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public String saySomething() {
        return " Teacher here.";
    }
}
