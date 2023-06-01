public class instance {
    int so;
    instance(){
        System.out.println("here"+" "+so);
    }
    //instance initializer block
    {so=100;}
    public static void main(String[] args){
        new instance();//annonymous object creation method
    }
}
