abstract class a{
    abstract void dis();
}

public class abs extends a {
    void dis(){
        System.out.print("happen");
    }
    public static void main(String[] args){
        abs a1=new abs();
        a1.dis();
    }
}
