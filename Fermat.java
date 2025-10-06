import java.util.Scanner;

public class Fermat {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        int a;
        int b;
        int c;
        int n;
        System.out.print("enter a");
        a=scan.nextInt();
        System.out.print("enter b");
        b=scan.nextInt();
        System.out.print("enter c");
        c=scan.nextInt();
        System.out.print("enter n");
        n=scan.nextInt();
        int afunction=(int)Math.pow(a, n);
        int bfunction=(int)Math.pow(b, n);
        int cfunction=(int)Math.pow(c, n);
        System.out.println(afunction + "+" + bfunction +"=" + cfunction);
        if(n>2 && afunction+bfunction==cfunction){
            System.out.println("Holy smokes, Fermat was wrong!");
        }
        else{
            System.out.println("No, that doesn't work.");
        }
    }
}