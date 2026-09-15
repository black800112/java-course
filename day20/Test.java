class Parent {
    void print() {
        System.out.print("Parent ");
    }
}

class Child extends Parent {
    @Override
    void print() {
        System.out.print("Child ");
    }

    void display() {
        print();
        super.print();
    }
}

public class Test {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}
