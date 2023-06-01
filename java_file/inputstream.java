import java.io.*;
class inps1{
    public static void main(String[] args){
        try{
        FileInputStream fs=new FileInputStream("file.txt");
        int i=0;
        while((i=fs.read())!=-1){
            System.out.print((char)i);
        }
    }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("running");
        }
       
    }
}