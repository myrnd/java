import java.math.BigDecimal;

public class SimpleIntCal {
  BigDecimal principal;
  BigDecimal interest;

  SimpleIntCal(String principal, String interest) {
    this.principal = new BigDecimal(principal);
    this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
  }

  public BigDecimal calculateTotalVal(int years) {
    BigDecimal noOfYears = new BigDecimal(years);
    BigDecimal totalVAl = principal.add(
      principal.multiply(interest)
        .multiply(noOfYears));
    return totalVAl;
  }

  public static void main(String[] args) {
    SimpleIntCal interestCal = new SimpleIntCal("4500.00", "7.5");

    System.out.println(interestCal.calculateTotalVal(5));
  }
}