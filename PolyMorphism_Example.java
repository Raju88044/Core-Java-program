public class PolyMorphism_Example {
    
    public static void main(String[] args) {
        System.out.println("Hello");

        Early_Binding_Late_Binding_Example_Parent obj = 
        new Early_Binding_Late_Binding_Example_Parent();
        obj.show();

        //Late Binding or runtime polymprphism
        obj = new Early_Binding_Late_Binding_Example_Child();
        obj.show();
    }
}

class Early_Binding_Late_Binding_Example_Parent {

    public void show() {
        System.out.println("It's a very pleasant morning");
    }
}

class Early_Binding_Late_Binding_Example_Child extends Early_Binding_Late_Binding_Example_Parent {

    public void show() {
        System.out.println("It's a very romantic evening");
    }
}
