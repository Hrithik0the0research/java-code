interface school{
    default void msg(){
        System.out.println("school is good");
    }
    void show();
}
interface college extends school{
    default void university(){System.out.println("uni is bad");}
}
class a implements college{
    public void show(){System.out.println("study");}

}
class test{
    public static void main(String[] args){
        college sc=new a();
        sc.msg();
        sc.show();
        sc.university();
    }
}