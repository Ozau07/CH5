import java.util.Scanner;
public class Quadratic {
    public static void main (String [] args){
        Scanner scan= new Scanner(System.in);
        System.out.println("enter a");
        double a=scan.nextDouble();
        System.out.println("enter b");
        double b=scan.nextDouble();
        System.out.println("enter c");
        double c=scan.nextDouble();
       
        double inside=(Math.pow(b, 2))-(4*a*c);
        double plus=(-b+((Math.pow(inside, 0.5))))/(2*a);
        double minus=(-b-((Math.pow(inside, 0.5))))/(2*a);
        double oplus=(a*((Math.pow(plus, 2))))+(b*plus)+c;
        double ominus=(a*((Math.pow(minus, 2))))+(b*minus)+c;
        if(a == 0 || inside<0){
            System.out.println("invalid input");
        }
         else if(inside>0){
            System.out.println("2 solution");
            System.out.println(plus+","+minus);
        }
        else if(inside==0){
        System.out.println("1 solution"); 
        System.out.println(plus);
    }
       
        else{
            System.out.println("0 solution");
        }
    }
}