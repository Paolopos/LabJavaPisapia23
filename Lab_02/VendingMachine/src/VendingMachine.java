public class VendingMachine {
    private int numberOfCans;
    private int numberOfTokens;

    public VendingMachine() {
    }

    public VendingMachine(int initialNumberOfCans) {
        numberOfCans = initialNumberOfCans;
        numberOfTokens = 0;
    }

    public void addCans(int numberOfNewCans) {
       this.numberOfCans = numberOfCans+numberOfNewCans;
    }

    public void takeCan() {
        this.numberOfCans = numberOfCans-1;
    }

    public void takeTokens() {
       this.numberOfTokens = numberOfTokens-1;
    }
    public void addTokens(int tokens){
        this.numberOfTokens = numberOfTokens+tokens;
    }

    public int getNumberOfCans() {
        return numberOfCans;
    }

    public int getNumberOfTokens() {
        return numberOfTokens;
    }
}