interface ab{
    void dis(); //doesnot has the method signature or body part
}
abstract class gg implements ab{
   public void dis(){//non-abstract method
        System.out.println("hello there");
    }
}
class do1 extends gg{//extends the parent class 
    public void dis(){
        System.out.println("do do");
    }
}
class test{
    public static void main(String[] args){//for not allocating object in heap again
        do1 g1=new do1();
        g1.dis();
    }
}