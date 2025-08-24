// Compile Time Polymorphism (Method Overloading)

public class MethodOverloading {
    int add(int a,int b){
        return a+b;
    }

    double add(double a, double b){
        return a+b;
    }

    int add(int a, int b, int c){
        return a+b+c;
    }
}

class Main{
    public static void main(String[] args){
        MethodOverloading caloc = new MethodOverloading();

        System.out.println(caloc.add(10,20));
        System.out.println(caloc.add(10,30));
        System.out.println(caloc.add(40,50,60));
    }
}