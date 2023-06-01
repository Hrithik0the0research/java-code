class a{
    public void help(){
        System.out.println("help");
    }

}

class b extends a{
    //int str1=90;
   public void help(){
        super.help();
        System.out.println("dont help");
        
    }
}
class c{
    public static void main(String[] args){
        b b1=new b();
        b1.help();
    }
}