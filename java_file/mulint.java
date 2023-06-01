interface clg{
    void show();
}
interface uni{
    void msg();
}
interface scl{
    void go();
}
class b implements uni,clg,scl{
    public void show(){
        System.out.println("clg");
    }
    public void msg(){
        System.out.println("uni");
    }
    public void go(){
        System.out.println("school");
    }
}
class test{
    public static void main(String[] args){
        b b1=new b();
        b1.show();
        b1.msg();
        b1.go();
    }
}