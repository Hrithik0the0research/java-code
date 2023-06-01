 class dnp {
    void msg(){
        System.out.println("hello");
    }
    
}
class ap extends dnp{
    void msg(){
        System.out.println("hii");
    }
    public static void main(String args[]){
        dnp d=new ap();
        d.msg();
    }
}

