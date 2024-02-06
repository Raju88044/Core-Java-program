public class Method_Overriding_Example {
    
    public static void main(String[] args) {
        
        Child_Method_Override obj = new Child_Method_Override();
        obj.show();
    }
}

class Parent_Method_Override {

    public void show(){
        System.out.println("in Parent Show");
    }
    public void parent(){
        System.out.println("in parent method");
    }
}

class Child_Method_Override extends Parent_Method_Override {
    //Method Overriding
    public void show(){
        System.out.println("in Child Show");
    }
    public void child(){
        System.out.println("in child method");
    }
}
