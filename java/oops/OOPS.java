public class OOPS {
    public static void main(String args[]){
        Pen p1 = new Pen(); // created a pen object called p1
        p1.setColor("blue");
        System.out.println(p1.getColor());
        p1.setTip(10);
        System.out.println(p1.getTip());

        BankAccount ma = new BankAccount();
        ma.username = "JohnDoe";
        ma.setPassword("12345"); // This is private and cannot be accessed directly
        
    }
}

class BankAccount  {
    public String username;
    private String password;

    public void setPassword(String newPassword){
        password = newPassword;
    }
}


class Pen {
   private String color;
    private int tip;

    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }

    void setColor(String newColor){
        this.color = newColor;
    }

    void setTip(int newTip){
        this.tip = newTip;
    }
}

class Student {
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy, int chem, int math){
        percentage = (phy + chem + math)/3;
     }
}