package practice06;

public class Student extends Person {
    private String name;
    private int age;
    int klass;
    public Student(){}
    public Student(String name,int age,int kClass){
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


    public void setKlass(int kClass) {
        this.klass = kClass;
    }

    @Override
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
        String a=super.introduce();
        String b=(" I am a Student. I am at Class "+this.getKlass()+".");
        return a+b;
    }
}
