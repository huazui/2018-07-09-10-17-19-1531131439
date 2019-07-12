package practice03;

public class Worker {
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
        return ("I am a Worker. I have a job.");
    }
}

