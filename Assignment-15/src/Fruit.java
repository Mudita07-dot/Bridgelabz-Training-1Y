class Fruit {
    String name;
}

class Apple extends Fruit {}
class Mango extends Fruit {}

class FruitBox<T extends Fruit> {
    java.util.List<T> fruits = new java.util.ArrayList<>();

    void add(T fruit) {
        fruits.add(fruit);
    }

    void display() {
        for (T f : fruits) {
            System.out.println(f.getClass().getSimpleName());
        }
    }
}