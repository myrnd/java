public class Address {
  private String line1;
  private String city;
  private String zipCode;

  //creation

  public Address(String line1, String city, String zipCode) {
    this.line1 = line1;
    this.city = city;
    this.zipCode = zipCode;
  }

  public String toString() {
    return line1 + " " + city + " " + zipCode;
  }
}