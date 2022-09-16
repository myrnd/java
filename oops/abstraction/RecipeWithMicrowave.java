public class RecipeWithMicrowave extends AbstractRecipe {
  void getReady() {
    System.out.println("Get the raw materials");
    System.out.println("Get the utensils");
    System.out.println("Switch on the microwave");
  }

  void doTheDish() {
    System.out.println("get stuff ready");
    System.out.println("Put it in the microwave");
  }

  void cleanup() {
    System.out.println("Switch off the microwave");
    System.out.println("Cleanup the utensils");
  }

  public static void main(String[] args) {
    RecipeWithMicrowave recipe = new RecipeWithMicrowave();
    recipe.execute();
  }
}