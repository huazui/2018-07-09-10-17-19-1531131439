package practice10;

import java.util.LinkedList;

public class Teacher extends Person{
    private String name;
    private int age;
    private int id;
    LinkedList<Klass> classes;
    Klass klass;
    public Teacher(){}
    public Teacher(int id,String name,int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }
    public Teacher(int id, String name, int age, LinkedList<Klass> classes){
        this.id=id;
        this.name=name;
        this.age=age;
        this.classes=classes;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public void setClasses(LinkedList<Klass> classes) {
        this.classes = classes;
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }

    @Override
    public int getId() {
        return id;
    }

    public  boolean equals(Object other){
        Person you=(Person)other;
        return this.id==you.getId();
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Klass getKlass() {
        return klass;
    }
    public String introduce() {
        String a = super.introduce() + " I am a Teacher.";
        String b = "";
        if (this.getClasses() == null) {
            b = (" I teach No Class.");
        } else {
            b = " I teach Class";

            for (int i = 0; i < classes.size(); i++) {
                if (i < classes.size() - 1)
                    b = b + " "+getClasses().get(i).getNumber() + ",";
                else b = b + " "+getClasses().get(i).getNumber()+".";
            }
        }
        return a + b;
    }
    public boolean isTeaching(Student student) {
        for (int i = 0; i < classes.size(); i++) {
            if (getClasses().get(i).getNumber() == student.getKlass().getNumber()) {
                return true;
            }

        }
        return false;
    }
    public String introduceWith(Student student){
        if(this.isTeaching((student))){
            return"My name is "+this.getName()+". I am "+this.getAge()+" years old. I am a Teacher. I teach "+student.getName()+".";
        }
        else  return"My name is "+this.getName()+". I am "+this.getAge()+" years old. I am a Teacher. I don't teach "+student.getName()+".";
    }
}
