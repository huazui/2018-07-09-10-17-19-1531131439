package practice11;

public class Klass {
    private Student leader;
    private int number;
    private Teacher teacher;
    public Klass(){}
    public Klass(int number){
        this.number=number;
    }
    public void assignLeader(Student leader){
        if(leader.getKlass().getNumber()==this.getNumber()) {
            this.leader = leader;
            System.out.print("I am "+this.getTeacher().getName()+". I know "+leader.getName()+" become Leader of Class "+this.getNumber()+".\n");
        }
        else {
            System.out.print("It is not one of us.");
            System.out.print("\n");
        }
    }


    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void appendMember(Student student){
        student.setKlass(this);
        System.out.print("I am "+this.getTeacher().getName()+". I know "+student.getName()+" has joined Class "+this.getNumber()+".\n");


    }
    public Student getLeader() {
        return leader;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public String getDisplayName(){
        return "Class "+this.getNumber();
    }
    public int getNumber() {
        return number;
    }
}
