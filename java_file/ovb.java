import java.util.Scanner;
public class ovb{
    static int v;
    public static int factorial(int p){
        v=p;
        if(v==1){
            return 1;
        }
        else{
            return v*factorial(p-1);
        }
    }
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your value \n");
        int p=sc.nextInt();
        sc.close();
        System.out.println("factorial is "+factorial(p));
    }
}