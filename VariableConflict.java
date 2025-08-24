public class VariableConflict {
    String  Name;
    int age;

    VariableConflict(String name, int age){
       this.Name = name;
       this.age = age;
    }

    void display(){
        System.out.println("Name of Student "+ Name+" Age: "+ age);
    }
}

 class Main{
    public static void main(String[] args){
        VariableConflict s1 = new VariableConflict("Nitesh", 24);
        s1.display();
    }
}

