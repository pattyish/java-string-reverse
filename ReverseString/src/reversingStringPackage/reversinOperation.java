
package reversingStringPackage;
import java.util.*;
public class reversinOperation {
   public String firstName;
   public String lastName;
   public String fullName;
   public String reversedName = "";
   public reversinOperation(){
     Scanner inputValue = new Scanner(System.in);
     System.out.println("enter first name");
     this.firstName = inputValue.next();
     System.out.println("enter first name");
     this.lastName = inputValue.next();
   } 
   public String combineName(){
       fullName = this.firstName + " " + this.lastName;
       return fullName;
   }
   public int getFullNameLength(){
       return this.combineName().length();
   }
   public String reverseWithFor(){
       int i; 
       String reverseNameWithFor = "";
       int stringLenght = this.getFullNameLength() - 1;
       for( i = stringLenght; i >=0; i-- ){
           reverseNameWithFor = reverseNameWithFor + this.combineName().charAt(i);
       }
       return reverseNameWithFor;
   }
   
   public String reverseWithWhile(){
       String reverseNameWithWhile = "";
       int i = this.getFullNameLength() - 1;
       while(i >= 0){
          reverseNameWithWhile = reverseNameWithWhile + this.combineName().charAt(i); 
          i = i - 1;
       }
       return reverseNameWithWhile;
   }
   public String reverseWithDoWhile(){
      String reverseNameWithDoWhile = "";
      int i = this.getFullNameLength() - 1;
      do{
        reverseNameWithDoWhile = reverseNameWithDoWhile + this.combineName().charAt(i); 
          i = i - 1;  
      }while(i >= 0);
      return reverseNameWithDoWhile;
   }
   public void diplayReversedNames(){
      System.out.println("my full name is :" + this.combineName());
      System.out.println("string reversed with for loop :" + this.reverseWithFor());
      System.out.println("-------------------------");
      System.out.println("string reversed with while loop :" + this.reverseWithWhile());
      System.out.println("-------------------------");
      System.out.println("string reversed with do while loop :" + this.reverseWithDoWhile());
   } 
   
}
