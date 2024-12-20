public class Person {//blueprint-define a Person
// attributes
private String name;
private int age;
private String email;

// Constructor (not Method)
public Person(String name, int age, String email){
this.name = name;
this.age = age;
this.email = email;
}

// Getter (instance Method)
public String getName() {
    return this.name;
}

public int getAge(){
    return this.age;
}

public String getEmail(){
    return this.email;
}

// setter (amend something)
// void - > return type (return nothing)
public void setAge(int age){
    this.age = age;
}






public static void main(String[] args) {

    Person p1 = new Person("vincent", 18, "vincent@gmail.com");
    System.out.println(p1.getName()); // vincent
    System.out.println(p1.getAge()); // 18
    System.out.println(p1.getEmail()); // vincenet@gmail.com
    
    Person p2 = new Person("lucas", 17, "lucas@gmail.com");
    System.out.println(p2.getName()); // lucas
    System.out.println(p2.getName());//17
    System.out.println(p2.getEmail()); //lucas@gmail.com

    Person p3 = p2;
    System.out.println(p3.getAge()); //17
    System.out.println(p3.getName());// lucas

    p2.setAge(30);
    System.out.println(p2.getAge());
    System.out.println(p3.getAge());
    
    Person[] persons = new Person[] {p1,p2,new Person("dicky", 19, "dicky@gamil.com")};
    
    // vincent@gmail.com
    for (Person p: persons){
    
    System.out.println(p.getName() + "," + p.getAge() + "." + p.getEmail());
    
    }
}
}
    
  

    
    

