import java.util.Scanner;
public class Session3Assignment3
{
    public static void main(String [] args) 
    {

       Scanner sc = new Scanner(System.in);      
       int num;
     
       System.out.print("Enter an integer number: ");
       num = sc.nextInt();
        
        //Generates a random number
        double randomNumber = Math.random();
        int randomInt = (int)(num * randomNumber);
 
        //Displays the random number
        System.out.println("The random number generated is : "+ randomInt);
 
    }
}