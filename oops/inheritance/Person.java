public class Person {
  private String name;
  private String email;
  private String phoneNumber;

  // Person() {
  //   System.out.println("Person Constructor Called");
  // }

  Person(String name) {
    System.out.println("Person Constructor Called");
    this.name = name;
  }


  public String getName() {
    return this.name;
  }
  
  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
  
  public String getPhoneNumber() {
    return this.phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  } 

  public String toString() {
    return String.format("Name: %s, Email: %s, Phone Number: %s",name,email,phoneNumber);
  } 

}