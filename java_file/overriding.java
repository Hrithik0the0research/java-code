 class overriding {
     void msg(){
        System.out.println("hi");
    }
}
 class ovd extends overloading{
void msg(){
    
    System.out.println("ho");
}
public static void main(String[] args){
    ovd ov=new ovd();
    ov.msg();
}
}
