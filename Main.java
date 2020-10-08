import java.util.Scanner;
/**
 *Shows user number in ascending order
 * @author Tolga Nurtekin
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create a Scanner
    Scanner input = new Scanner(System.in);
  
    //create an array to store users numbers
    int [] integers = new int[2];
    //ask user for two numbers
    System.out.println("Please enter the 2 values for the array");
    //create a variable to move one of the values over
     int temp = 0;
     int temp2 = 0;
    
    //put integers into array into for loop
    for(int i = 0; i < 2; i++){
     integers[i] = input.nextInt();
    }
    if(integers[0] > integers[1]){
       temp = integers[0];
       temp2 = integers[1];
       System.out.println("Your numbers in ascending order are " + temp2 + "," + temp);
       }else if(integers[0] < integers[1]){
       temp = integers[1];
       temp2 = integers[0];
       System.out.println("Your numbers in ascending order are " + temp2 + "," + temp);
    
    }
  }
}

  
    

  

