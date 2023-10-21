public class RewardValue {
  // making it so that cashValue is only aviable in the RV can only be accessed within the class 
  // final makes it not be able to set again once declared
  private final double cashValue;
  // the static part means the constant belongs to the class not an instance of it, meaning every version(instance) of RV can access this
  public final static double MILES_TO_CASH_RATE = 0.0035d;

  // the cash constructor that just sets cash
  public RewardValue(double cashValue) {
    this.cashValue = cashValue;
  }

  // the miles constructor that sets the cash value to the converted miles value
  public RewardValue(int milesValue) {
    this.cashValue = convertToCash(milesValue);
  }

  // helper funcs
  // the mothod available to the class that will take the miles value and convert it to the cash equivalent
  // since thes are private and static only can be used in the class but can be called with the class name but not associated with instances of the class
  private static double convertToCash(int milesValue) {
    return milesValue * MILES_TO_CASH_RATE;
  }

  // how the cash value can be converted to the miles equivalent
  private static int convertToMiles(double cashValue) {
    return (int) (cashValue / MILES_TO_CASH_RATE);
  }
  
  // can be accessed
  public double getCashValue() {
    return this.cashValue;
  }

  public double getMilesValue() {
    return convertToMiles(this.cashValue);
  }
}
