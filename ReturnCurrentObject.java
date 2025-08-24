public class ReturnCurrentObject {
    String Name;
    int Age;
    
    ReturnCurrentObject setName(String Name){
        this.Name = Name;
        return this;
    }

    ReturnCurrentObject setAge(int Age){
        this.Age = Age;
        return this;
    }

    void show(){
        System.out.println(Name + " is " + Age + " years old.");
    }
}

class Main{
    public static void main(String[] args){
        new ReturnCurrentObject().setName("Nitesh").setAge(24).show();
    }
}
