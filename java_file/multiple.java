class animal {
animal(){
    System.out.println("animal");
}    
}
class dog extends animal{
    void bark(){
        System.out.println("bark");
    }
}
class cat extends animal{
    void meew(){
        System.out.println("meew");
    }
}
class anm{
    public static void main(String[] args){
        cat ct=new cat();
        ct.meew();
        
    }
}
