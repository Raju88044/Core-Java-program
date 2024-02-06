public class Enum_example3 {
   
    public static void main(String[] args) {
        
        Enum_Example1 obj = new Enum_Example1()
        {
                public void show(){
                    System.out.println("in show");
                }              
        };
        System.out.println(obj);
        //We can't create enum ref variable directly if it's inside interfaces
        //Laptop [] obj2 = Laptop.values();

        Enum_Example2 obj2 = new Enum_Example2();
        obj2.show();
    }
}

class Enum_Example2 implements Enum_Example1 {

    @Override
    public void show() {
        Laptop [] obj2 = Laptop.values();
        for(Laptop lap : obj2) {
            System.out.println(lap.name() +":"+lap.getPrice());
        }
    }
    
}
interface Enum_Example1{

    void show();

    enum Laptop {

        Mac(12300),HP(1200),Lenovo(500),Dell;

        int price;

        private Laptop(int price) {
            this.price=price;
        }
        public int getPrice() {
            return price;
        }
        public void setPrice(int price) {
            this.price = price;
        }
        private Laptop(){
            this.price=1111;
        }
    }

}
