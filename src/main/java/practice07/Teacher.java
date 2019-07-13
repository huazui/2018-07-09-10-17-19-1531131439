package practice07;

public class Teacher extends Person {
    private String name;
    private int age;
    Klass klass;
    public Teacher(){}
    public Teacher(String name,int age){
        this.name=name;
        this.age=age;
    }
    public Teacher(String name,int age,Klass kClass){
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


    public void setKlass(Klass kClass) {
        this.klass = kClass;
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
    public String introduce(){
        String a=super.introduce()+" I am a Teacher.";
        String b="";
        if(this.getKlass()==null)
            b=(" I teach No Class.");
        else b=" I teach Class "+getKlass().getNumber()+".";
        return a+b;
    }
    public String introduceWith(Student student){
        if(student.getKlass().getNumber()==this.getKlass().getNumber()){
            return"My name is "+this.getName()+". I am "+this.getAge()+" years old. I am a Teacher. I teach "+student.getName()+".";
        }
        else return"My name is "+this.getName()+". I am "+this.getAge()+" years old. I am a Teacher. I don't teach "+student.getName()+".";
    }

}
