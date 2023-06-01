import java.io.*;
class fileread{
    public static void main(String[] args){
        try{
            FileReader fl=new FileReader("file22.txt");
            int i;
            while((i=fl.read())!=-1){
                System.out.println((char)i);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}