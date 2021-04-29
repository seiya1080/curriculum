package check;

import constants.Constants;

public class Check {    
    
     private static String firstname = "Namba";
     private static String lastname = "Seiya";
     private static String printName(String firstname,String lastname) {
         return firstname + lastname;
    }
       
    public static void main(String[] args) {
    System.out.println("printNameメソッド→ " + printName(firstname,lastname));
    Constants con =new Constants();
    Pet pet = new Pet(con.CHECK_CLASS_JAVA,con.CHECK_CLASS_HOGE);
    pet.introduce();
    RobotPet Rp = new RobotPet(con.CHECK_CLASS_R2D2,con.CHECK_CLASS_LUKE);
    Rp.introduce(); 
 }
}   
