
public class Animal {
  public static void main(String[] args) {
    AnimalAbstract[] animals = {new Dog(), new Cat()};

    for(AnimalAbstract animal: animals) {
      animal.bark();
    }
  }
}