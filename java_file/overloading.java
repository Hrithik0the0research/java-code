public class overloading {
    public int m;
    public void sum1(int a,int b){
        m=a+b;
        System.out.println(m);
    }
    public void sum1(int a,int b,int c){
        m=a*b+c;
        System.out.println(m);
    }
    public static void main(String[] args){
        overloading obj=new overloading();
        obj.sum1(1,2);
        obj.sum1(3,2,1);
    }
}
