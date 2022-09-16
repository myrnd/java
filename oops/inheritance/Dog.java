public class Dog extends Pet {

  public static void main(String[] args) {
    Dog dog = new Dog();

    dog.groom();
    dog.message();

    Pet dog2 = new Dog();   //allowed
    // Dog pet = new Pet();    //not allowed

    System.out.println(dog instanceof Dog); //true
    System.out.println(dog instanceof Pet); //true
    System.out.println(dog instanceof Animal); //true
    System.out.println(dog instanceof Object); //true
    // System.out.println(dog instanceof String); //false
  }
}