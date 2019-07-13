package practice07;

public class Student extends Person {
    private String name;
    private int age;

    Klass klass;
    public Student(){}
    public Student(String name,int age,Klass kClass){

        this.name=name;
        this.age=age;
        this.klass=kClass;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }



    @Override
    public String getName() {
        return name;
    }
    public Klass getKlass() {
        return klass;
    }


    public int getAge() {
        return age;
    }


    public String introduce(){
        String a=super.introduce();
        String b=(" I am a Student. I am at Class "+this.getKlass().getNumber()+".");
        return a+b;
    }
}
