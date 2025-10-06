import java.util.Scanner;
import java.util.Random;
public class GuessMyNumber{
    public static void main (String[] args){
        
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.print("I'm thinking of a number between 1 and 100, take a guess");
        int thinkof = in.nextInt();
        
        if(thinkof<number){
          
            System.out.println("higher");
        }
        else if(thinkof>number){
            System.out.println("lower");
        }
        else{
            System.out.println("you guess it right");
        


    }
    thinkof=in.nextInt();
       if(thinkof<number){
          
            System.out.println("higher");
        }
        else if(thinkof>number){
            System.out.println("lower");
        }
        else{
            System.out.println("you guess it right");
        


    }
thinkof=in.nextInt();
    if(thinkof==number){
            System.out.println("you guess it right");
        }
        else{
            System.out.println("you guess it wrong");
        


    }
    
}
}