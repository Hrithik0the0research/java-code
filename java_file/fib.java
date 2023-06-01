import java.util.Scanner;

interface fibbonacci{
    void fibbo();
}
interface print{
    void printv(int a);

}
class dis implements fibbonacci,print{
    int y;
    static int count=0;
    dis(int y){
        this.y=y;
    }
    dis(){
        count++;
        System.out.println(count+"id"+"  ");
    }
    void setValue(int x){
        y=x;
    }
    int getValue(){
        return y;
    }
    
    int a=0,b=1;
    int s;
    public void printv(int a){
        System.out.println(a);
    }
    public void fibbo(){
        try{
            System.out.println(a);
            for(int i=0;i<y;i++){
                s=a+b;
                a=b;
                b=s;
                printv(a);
            }
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        finally{
            System.out.println("code working");
        }

    }
    public static void main(String[] args){
        dis[] d=new dis[3];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++){
            System.out.println("enter value ");
            int j=sc.nextInt();
            d[i]=new dis();
            d[i].setValue(j);
            d[i].fibbo();
        }

    }
}
