class Person{
    String proFfession;

    // Constructor Person
    Person(String proFfession){
        this.proFfession = proFfession;
    }
    // work method 
    void work(){
        System.out.println("Nitesh is "+proFfession);
    }
}

// class student
class Student extends Person{
    String proFfession;

    // Constructor 
    Student(String proFfession){
        super(proFfession);
        this.proFfession = proFfession;
    }
    @Override
    void work(){
       System.out.println("Nitesh is "+proFfession);
    }
}

// class teacher
class Teacher extends Person{
    String proFfession;

    Teacher(String proFfession){
        super(proFfession);
        this.proFfession = proFfession;
    }
    @Override
    void work(){
       System.out.println("Nitesh is "+proFfession);
    }
}

class Main{
    public static void main(String[] args){
        Person p = new Person("Engineer");
        Student su = new Student("Student");
        Teacher te = new Teacher("Teacher");
         p.work();
        su.work();
        te.work();
    }
}