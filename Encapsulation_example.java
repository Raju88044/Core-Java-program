import java.lang.*;
import other.*;
public class Encapsulation_example {
    
    public static void main(String[] args) {
        Human person = new Human();
        person.setName("Raju");
        person.setAge(25);

        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}

class Human {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
        System.out.println(this.hashCode());
        System.out.println(this);
    }
    public void setAge(int age) {
        this.age = age;
        System.out.println(this.hashCode());
        System.out.println(this);
    }
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return age;
    }
}

