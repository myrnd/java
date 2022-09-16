public class Recipe1 extends AbstractRecipe {

  void getReady() {
    System.out.println("Get the raw materials");
    System.out.println("Get the utensils");
  }

  void doTheDish() {
    System.out.println("do the dish");
  }

  void cleanup() {
    System.out.println("Cleanup the utensils");
  }

  public static void main(String[] args) {
    Recipe1 recipe = new Recipe1();
    recipe.execute();
  }
}