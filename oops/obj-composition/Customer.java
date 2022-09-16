

public class Customer {

  //state
  private String name;
  private Address homeAddress;
  private Address workAddress;

  //creationg

  public Customer(String name, Address homeAddress) {
    this.name = name;
    this.homeAddress = homeAddress;
  }

  //operations
  public Address getHomeAddress() {
    return homeAddress;
  }

  public void setHomeAddress(Address homeAddress) {
    this.homeAddress = homeAddress;
  }

  public Address getWorkAddress() {
    return workAddress;
  }

  public void setWorkAddress(Address workAddress) {
    this.workAddress = workAddress;
  }

  public String print() {
    return String.format("name - [%s] home address - [%s] work address - [%s]",name, homeAddress, workAddress);
  }

  public static void main(String[] args) {
    Address homeAddress = new Address("1","Patna","844101");
    Customer customer = new Customer("Vishal",homeAddress);

    Address workAddress = new Address("1","Delhi","844101");
    customer.setWorkAddress(workAddress);
    
    System.out.println(customer.print());

  }
}