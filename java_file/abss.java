abstract class car {
    car(){
        System.out.println("constructor invoked");
    }
    abstract void run();
    void speed(){
        System.out.println("speed 100");
    }

}
class p extends car{
    void run(){System.out.println("car run");}
    public static void main(String[] args){
        car c=new p();
        c.run();
        c.speed();
    }
}
