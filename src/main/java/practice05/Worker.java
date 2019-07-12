package practice05;

public class Worker extends Person {
    public Worker(){}
    public Worker(String name,int age){
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
        String a=super.introduce();
        String b=" I am a Worker. I have a job.";
        return a+b;
    }
}
