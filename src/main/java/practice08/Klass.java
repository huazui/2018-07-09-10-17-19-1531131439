package practice08;

public class Klass {
    private Student leader;
    private int number;
    public Klass(){}
    public Klass(int number){
        this.number=number;
    }
  public void assignLeader(Student leader){
        this.leader=leader;
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
