public class calculate {
    public int sum(int a, int b){
        return a+b;
    }
    
    public double sum(double a, double b){

        return a+b;

    }

    public int sum(int a, int b, int c){
        return a+b+c;

    }
}
class overloadingdemo{
    public static void main(String[] args) {
        calculate obj = new calculate();
        int sumint = obj.sum(2,3);    
        double sumdouble = obj.sum(2,3,5);        
        int sumint3= obj.sum(2,3,4);
        
        System.out.println("the sum of two integer is: " + sumint);
        System.out.println("the sum of all double is: " + sumdouble);
        System.out.println("the sum of all integer; " + sumint3);
    }
}return
