public class Object_Class_Methods_example {
    
    public static void main(String[] args) {

        Laptop obj = new Laptop();
        Laptop obj1 = new Laptop();
        System.out.println(obj.toString());
        System.out.println(obj.equals(obj1));
        System.out.println(obj.hashCode());
        System.out.println(obj1.hashCode());


        
    }
}

class Laptop {
    String model = "HP";
    double price = 120000;

    @Override
    public String toString() {
        return "Laptop [model=" + model + ", price=" + price + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        long temp;
        temp = Double.doubleToLongBits(price);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
            return false;
        return true;
    }
    
}
