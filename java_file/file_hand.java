import java.io.*;
public class file_hand {
    public static void main(String[] args) throws Exception{
        File f1=new File("file11.txt");
        FileWriter f2=new FileWriter("file11.txt");
        f2.write("hi its a good thing");
        f2.close();
    }
}
