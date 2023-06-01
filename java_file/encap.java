import root.mypackage.*;
//read and write both
class b{
    public static void main(String[] args){
        tv v=new tv();
        v.setname("jisu bal");
        v.setnumber(100);
        System.out.println("name "+v.getname());
        System.out.println("number "+v.getnumber());  
        System.out.println("read only "+v.read());      
    }
}