package check;

public class Check {
    
    private String firstname = "Namba";
    private String lastname = "Seiya";
    
    private void printName() {
    System.out.println("printNameメソッド→" + this.firstname + this.lastname);
}
    public static void main(String[] args) {
        Check chk = new Check();
        chk.printName();
        Pet pet = new Pet("java吉","hoge");
        pet.introduce();
        RobotPet Rp = new RobotPet("","ルーク");
        Rp.introduce();
        }
}
    
    
    
