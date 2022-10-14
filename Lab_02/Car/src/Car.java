public class Car {
    private double gas;
    private final double consumptionRate;

    public Car(){
        this.gas=0;
        consumptionRate=1.2;
    }


    public double getGas() {
       return gas;
    }

    public void addGas(double gas) {
        this.gas=this.gas+gas;
    }

    public void drive(double km) {
       this.gas=this.gas-consumptionRate*km;
    }
}