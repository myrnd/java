 class Example {

  int id;

  Example(int id) {
    this.id = id;
  }

  int getId() {
    return id;
  }

  public static void main(String[] args) {
    Example e1 = new Example(5);    
    Example e2;

    e2 = e1;

    System.out.println(e2.getId());

    e2.id = 10;

    System.out.println(e1.getId());
  
  }
}