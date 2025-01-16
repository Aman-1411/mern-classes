/*class print {
    public static void main(String args[]){
        for(int i=0; i<5; i++){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
        System.out.println();
        }  
    }
}*/
import java.util.*;
class print1 {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("entr the hour(0 to 24): ");
        int hour=s.nextInt();
        if(hour>=0 && hour<12){
            System.out.println("good morning");
        }else if(hour>=12 && hour<18){
            System.out.println("good afternoon");
        }else if(hour>=18 && hour<24){
            System.out.println("good evening");
        }else{
            System.out.println("time out of range");
        }
    }
}
//wap a program to constr                                                                                                                                                                                                                                      