 class multilivel {
 void bark(){
        System.out.println("bark");
    }
    
}
 class dog extends multilivel{
 void dog_food(){
        System.out.println("dog food");
    }
} class baby extends dog{
 void dog_swim(){
        System.out.println("dog swim");
    }
}
class anim{
    public static void main(String[] args){
        baby bb =new baby();
        bb.dog_food();
        bb.bark();
        bb.dog_swim();
    }
}