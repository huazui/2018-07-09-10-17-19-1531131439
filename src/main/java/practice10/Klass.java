package practice10;

public class Klass {
    private Student leader;
    private int number;
    public Klass(){}
    public Klass(int number){
        this.number=number;
    }
    public void assignLeader(Student leader){
        if(leader.getKlass().getNumber()==this.getNumber()) {
            this.leader = leader;
        }
        else {
            System.out.print("It is not one of us.");
            System.out.print("\n");
        }
    }
    public void appendMember(Student student){
        student.setKlass(this);
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
