package cse360Assignment01;
/**
 * 
 * @author Jarren McBide
 *
 */
public class AddingMachine {
  private int total;
  private String history;
  /**
   * Local variable declarations.
   */
  public AddingMachine () {
	  /**
	   * Initializes the object.
	   */
    total = 0;  // not needed - included for clarity
    history = "";
  }
  
  public int getTotal () {
	  /**
	   * This method returns the total.
	   * @return 0
	   */
    return total;
  }
  
  public void add (int value) {
	  /**
	   * This method adds the value to the total.
	   * @param total
	   */
	  this.total += value;
	  history += " + "+value;
  }

  public void subtract (int value) {
	  /**
	   * This method subtracts the value from the total.
	   * @param total
	   */
	  this.total -= value;
	  history += " - "+value;
  }

  public String toString () {
	  /**
	   * This method returns the history of transactions.
	   * @return ""
	   */
    return history;
  }

  public void clear() {
	  /**
	   * This method clears the object.
	   */
	  history = "";
	  total = 0;
  }
}