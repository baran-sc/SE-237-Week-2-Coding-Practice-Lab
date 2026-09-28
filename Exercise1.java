class Product {
    private String name;

    Product(String name) {
        this.name = name;
    }

    String name() {
        return name;
    }

    void rename(String newName) {
        name = newName;
    }
}

public class Exercise1 {
    public static void main(String[] args) {
        Product a = new Product("CHAIR-A");
        Product b = a;

        b.rename("CHAIR-B");

        System.out.println("a: " + a.name());
        System.out.println("b: " + b.name());

        System.out.println("--- Gözlem (Yeni Nesne) ---");


        Product c = new Product("CHAIR-A");
        Product d = new Product("CHAIR-A");
        d.rename("CHAIR-B");

        System.out.println("c: " + c.name());
        System.out.println("d: " + d.name());
    }
}