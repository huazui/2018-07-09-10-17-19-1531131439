package practice08;

public class Person {
    public Person(){}
    public Person(int id,String name,int age){
        this.name=name;
        this.age=age;
    }
    private String name;
    private int age;
    private int id;
    public  boolean equals(Object other){
        Person you=(Person)other;
        return this.id==you.getId();
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
