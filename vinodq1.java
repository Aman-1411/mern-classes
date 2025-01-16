import java.util.*;

import javafx.scene.effect.Light.Spot;
class subject{
    int sub1;
    int sub2;
    int sub3;
    int sub4;
    int sub5;
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter sb1: " );
        int sub1=sc.nextInt();
        System.out.println("Enter sb2: " );
        int sub2=sc.nextInt();
        System.out.println("Enter sb3: " );
        int sub3=sc.nextInt();
        System.out.println("Enter sb4: " );
        int sub4=sc.nextInt();
        System.out.println("Enter sb5: " );
        int sub5=sc.nextInt();
    }
    
    void max(){
        int max =sub1;
        if(sub2>max);
        max = sub2;
        if(sub3>max);
        max = sub3;
        if(sub4>max);
        max = sub4;
        if(sub5>max);
        max = sub5;
        System.out.println("Maximum no. is: "+ max);
    }
    void min(){
        int max =sub1;
        if(sub2<max);
        max = sub2;
        if(sub3<max);
        max = sub3;
        if(sub4<max);
        max = sub4;
        if(sub5<max);
        max = sub5;
        System.out.println("Minimum no. is: "+ min);
    }
    void average(){
        int avg=(sub1 + sub2 + sub3 + sub4 + sub5)/5;
        System.out.println("Your average is: "+ avg);
    }
}
 class vinodq1{
public static void main(String[] args) {
    subject grade=new subject();
    grade.input();
    grade.max();
    grade.min();
    grade.average();
    
 }
}