class invoice {
    public String part,desc;
    public int qt;
    public double price;
    static int a=0;
    invoice(String part, String desc, int qt, double price){
        this.part=part;
        this.desc=desc;
        this.qt=qt;
        this.price=price;
        a++;
    }
    public String getpart(){
        return part;
    }
    public String getdesc(){
        return desc;
    }
    public int getqt(){
        return qt;
    }
    public double getprice(){
        return price;
    }
    public double getinvoice(){
        if(qt<0){
            qt=0;
        }
        if(price<0){
            price=0.00;
        }
        return (double)qt*price;

    }


}
class test{
    public static void main(String[] args){
        invoice inv=new invoice("c++ software","it is a programming language software",100,554.3);
        System.out.println("total quantatiy is "+inv.getinvoice());
    }
}
