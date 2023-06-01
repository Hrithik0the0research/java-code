class time{
    private  float hour,min,sec;
    String pm="am";
    time(float hour,float min,float sec){
        this.hour=hour;
        this.min=min;
        this.sec=sec;
    }
    public void add(){
        while(sec>=60){
            sec=sec-60;
            min++;
        }
        while(min>=60){
            min=min-60;
            hour++;
        }
        if(hour>12){
            pm="pm";
            hour=hour-12;
        }
        System.out.println("Time is  "+hour+" "+pm+" "+min+" "+sec);
    }
}
class test{
    public static void main(String[] args){
    time tt=new time(13,120,480);
    tt.add();
    }

}