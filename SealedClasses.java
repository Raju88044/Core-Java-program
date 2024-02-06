public class SealedClasses {
    
    public static void main(String[] args) {
        
    }
}

public sealed class A permits B,C extends Thread implements Clonable {

}

// It only allow sealed,non-sealed and final class/interfaces
final class B extends A{

}

non-selaed class C extends A{

}

class D extends C{

}
