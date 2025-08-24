// Runtime Polymorphism (Method Overriding)
class Animal{
    void sound(){
        System.out.println("Animal makes a sound");
    }
}

// class dog extends class animal 
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog barks");
    }
}

// class cat extends Animal
class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("Cats Mew");
    }
}

class Main{
    public static void main(String[] args){
        Animal a = new Animal();
        a.sound();
        a = new Dog();
        a.sound();

        a = new Cat();
        a.sound();
    }
}