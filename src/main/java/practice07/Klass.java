package practice07;

public class Klass {
    private int number;
    public Klass(){}
    public Klass(int number){
        this.number=number;
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
