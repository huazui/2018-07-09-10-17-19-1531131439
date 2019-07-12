package practice05;

public class Person {
    public Person(){}
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    private String name;
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    public String introduce(){
        return ("My name is "+this.getName()+". I am "+this.getAge()+" years old.");
    }
}
