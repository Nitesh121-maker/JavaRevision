class Animal {
    // 1. public -> Accessible from anywhere
    public String name = "Lion";

    // 2. private -> Accessible only inside the same class 
    private int age =  5;

    // 3. protected -> Accessible inside the package and subclasses
    protected String sound = "Roar";

    // 4. Default -> Accessible only inside 
    String type = "Wild Animal: ";

    public void showAge(){
        System.out.println("Private Age: "+age);
    }
}

class Dogs extends Animal{
    void displayDog(){
        System.out.println("Name: " + name);
        
        // Access the protected 
        System.out.println("Sound: " + sound);

        // Access the default
        System.out.println("Type: " + type);
    }
}

class Main{
   public static void main(String[] args){
      Animal a =  new Animal();
      Dogs d   =  new Dogs();
      
      System.out.println("Accessing from main class");

      System.out.println("Name: "+a.name);

      a.showAge();

      System.out.println("Protected Sound: "+ a.sound);

      System.out.println("Default Type: "+a.type);

      System.out.println("\n=== Accessing from Subclass ===");
      d.displayDog();
   }
}