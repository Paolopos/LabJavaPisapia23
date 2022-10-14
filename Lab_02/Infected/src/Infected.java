public class Infected {

    private final String disease;
    private int numberOfInfected;

    public Infected(String disease) {
        this.disease = disease;
    }

    public Infected(String disease, int numberOfInfected) {
        this.disease= disease;
        this.numberOfInfected = numberOfInfected;
    }

    public int getNumberOfInfected() {
       return this.numberOfInfected;
    }

    public String getDisease() {
        return disease;
    }

    public void addInfected(int numberOfInfected) {
        this.numberOfInfected=this.numberOfInfected+numberOfInfected;
    }

    public void updateInfectedByRt(double Rt) {
     /* non so calcolarmi l'indice RT
    }
}