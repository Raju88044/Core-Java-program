public class record_new_feature_example {

    public static void main(String[] args) {

        Human p1 = new Human(12,"Raju");
        Human p2 = new Human(15,"Sonam");

        System.out.println(p1 + "  " + p2);

        person p12;
        Person p3 = new Person(23,"Ram");
        Person p4 = new Person(21,"Sita");
        System.out.println(p3 + "  " + p4);
        
    }
}
class Human {
    private final int age;
    private final String name;

    public Human(int age,String name) {
        this.age=age;
        this.name=name;
    }

    public String toString() {
        return name + ":" + age;
    }
}

record Person(int age,String name){

}
