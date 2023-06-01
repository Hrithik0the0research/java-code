import java.io.*;
class filewrite{
    public static void main(String[] args){
        try{
        FileWriter fl=new FileWriter("file22.txt");
        fl.write("welcome...");
        fl.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}