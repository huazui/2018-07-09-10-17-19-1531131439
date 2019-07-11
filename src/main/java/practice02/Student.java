package practice02;

public class Student entends Person {
    private String name;
    private int age;
    int kClass;
    public Student(String name,int age,int kLass){
        this.name=name;
        this.age=age;
        this.kClass= kLass;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void setkClass(int kClass) {
        this.klass = kClass;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getKlass() {
        return klass;
    }
    public String introduce(){
        return "I am a Student. I am at Class "+this.getKlass()+".");
    }
}
