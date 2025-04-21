interface Flyable {
    void fly();
}

class Bird implements Flyable {
    public void fly() {
        System.out.println("Bird is flying.");
    }
}

class Airplane implements Flyable {
    public void fly() {
        System.out.println("Airplane is flying.");
    }
}

class Kite implements Flyable {
    public void fly() {
        System.out.println("Kite is flying.");
    }
}
