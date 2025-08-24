public class CallConstructor {
    String Brand;
    int speed;

    CallConstructor(String Brand){
        this(Brand,0);
    }

    // Another Constructor
    CallConstructor(String Brand,int speed){
        this.Brand = Brand;
        this.speed = speed;
    }
    // Show Method
    void show(){
        System.out.println(Brand + " runs at "+ speed);
    }
}

class Main{
    public static void main(String[] args){
        CallConstructor s1 = new CallConstructor("Farari", 240);
        s1.show();
    }
}
