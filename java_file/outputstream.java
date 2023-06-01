import java.io.*;
class inps{
    public static void main(String[] args){
        try{
        FileOutputStream fs=new FileOutputStream("file.txt");
        String st="welcome to Habra";
        byte bt[]=st.getBytes();
        fs.write(bt);
        fs.close();

        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}