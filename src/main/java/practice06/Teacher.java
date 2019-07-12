package practice06;

public class Teacher extends Person {
    private String name;
    private int age;
    int klass=0;
    public Teacher(){}
    public Teacher(String name,int age){
        this.name=name;
        this.age=age;

    }
    public Teacher(String name,int age,int klass){
        this.name=name;
        this.age=age;
        this.klass=klass;

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
        String a=super.introduce()+" I am a Teacher.";
        String b;
        if(this.getKlass()==0)
            b=(" I teach No Class.");
        else b=" I teach Class "+getKlass()+".";
        return a+b;
    }
}

