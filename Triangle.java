import java.util.Scanner;
public class Triangle {
    
    public static boolean Calculation(double a, double b, double c){
        return (a+b>c) && (a+c>b) && (c+b>a);
        
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a: ");
        double a = scanner.nextInt();
        
        System.out.print("Enter b: ");
        double b = scanner.nextInt();
        
        System.out.print("Enter c: ");
        double c = scanner.nextInt();
        
        if(a<=0 || b<=0 || c<=0){
            System.err.println("your numbers are invalid!");
        }
        else{
            System.out.print(Calculation(a, b, c));
        }
        
        
        
        
          
        
        
        
        
        
                
    
 
    }
}