class Animal {
public Animal() {
    System.out.println("A new animal has been created!");
}   
public void sleep() {
    System.out.println("An animal sleeps...");
}
public void eats() {
    System.out.println("An animal eats...");
}
}

class Bird  extends Animal {

public Bird() {
    System.out.println("A new bird has been created!");
}
public void sleep() {
    System.out.println("A bird sleeps...");
}
public void eats() {
    System.out.println("A bird eats...");
}

}

public class E1 {

public static void main(String[] args) {
    Animal animal = new Animal();
    Bird bird = new Bird();
    bird.sleep();
    bird.eats();
    animal.sleep();
    animal.eats();
}
}