import java.util.*;
interface abs{
    void prime();
}
abstract class abs1 implements abs{
    abstract void even();
}
class abs2 extends abs1{
    public void prime(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value");
        int i=sc.nextInt();
        int flag=0;
        for(int j=2;j<i/2;j++){
            if(i%j==0){
                flag++;
                break;
            }
        }
        if(flag==0){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }

    }
   public void even(){
        Scanner sc=new Scanner(System.in);
        int j;
        j=sc.nextInt();
        if(j%2==0){
            System.out.println("even");

        }
        else{
            System.out.println("odd");
        }
    }
}
class prm{
    public static void main(String[] args){
        System.out.println("enter val");
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        System.out.println(k);
        //abs2 ab=new abs2();
        //ab.even();
       abs2[] ab=new abs2[5];
       for(int i=0;i<4;i++){
           ab[i]=new abs2();
            ab[i].even();
            ab[i].prime();
        }
    }
}