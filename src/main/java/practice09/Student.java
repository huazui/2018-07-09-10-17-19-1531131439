package practice09;

public class Student extends Person {
    private String name;
    private int age;
    private int id;
    Klass klass;

    public Student() {
    }
    public Student(int id, String name, int age, Klass kClass) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.klass = kClass;
    }

    public boolean equals(Object other) {
        if(this==null||other==null){
            return false;
        }
        Person you = (Person) other;
        return this.id == you.getId();
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
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


    public int getAge() {
        return age;
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        String a = super.introduce();
        String b;
        if (this.klass.getLeader() == this) {
            b = (" I am a Student. I am Leader of Class " + this.getKlass().getNumber() + ".");
        } else {
            b = " I am a Student. I am at Class " + this.getKlass().getNumber() + ".";
        }
        return a + b;
    }
}