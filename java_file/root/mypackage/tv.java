package root.mypackage;
public class tv{
private int number=10;
private String name="habra high";
private String read_val="value";
public void setnumber(int x){
    number=x;
}
public int getnumber(){
    return number;
}
public void setname(String name){
    this.name=name;
}
public String getname(){
    return name;
}
//read-only 
public String read(){
    return read_val;
}
}