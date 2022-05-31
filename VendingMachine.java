package Assignment5;

/**
 * this is model class of vending machine
 * this class calculate quantity and credit
 * @ author RIDHAM PATEL,000831171
 */
public class VendingMachine {
    /**
     * quantity varible for chocolate
     */
    private int quantity1=20;
    /**
     * quantity variable for soft drink
     */
    private int quantity2=20;
    /**
     * credit varivle with default value 10
     */
    private int credit=10;

    /**
     * setter method to calculate and set quantity for
     * chocolate item
     * @param quantity
     */
    public void setQuantity1(int quantity) {
        this.quantity1-=quantity;
        this.credit -= 2*quantity;
    }

    /**
     * setter method to calculate and set quantity for
     * soft drink
     * @param quantity
     */
    public void setQuantity2(int quantity) {
        this.quantity2-=quantity;
        this.credit -= 2*quantity;
    }

    /**
     * money method tocalculate credit
     * @param cred
     */
    public void money(int cred){
        credit+=cred;
    }

    /**
     * to return chocolate value
     * @return
     */
    public int getQuantity1() {
        return quantity1;
    }

    /**
     * to return soft drink value
     * @return
     */
    public int getQuantity2() {
        return quantity2;
    }

    /**
     * to return credit balance
     * @return
     */
    public int getCredit() {
        return credit;
    }

}
