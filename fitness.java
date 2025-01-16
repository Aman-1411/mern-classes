import java.util.Scanner;
public class fitness {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
     int steps=sc.nextInt();
        if (steps<=2000) {
               System.out.println("not health");            
        }
        else if (2001<=5000) {
            System.out.println("healthy");
        }
        else if (5001<=10000) {
            System.out.println("healthy fit");
        }
        else if (steps>=10000) {
            System.out.println("great job");
        }

        else{
            System.out.println("you are lazy");
            
        }
        sc.close();
    }
}