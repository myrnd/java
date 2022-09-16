public class Dog extends Animal {

  public void bark() {
    System.out.println("bow bow" + super.id);
  }

  public static void main(String[] args) {
    Dog dog = new Dog();
    // Animal dog = new Animal();    error: Animal is abstract; cannot be instantiated
    dog.bark();
  }
}