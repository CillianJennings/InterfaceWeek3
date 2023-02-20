package ie.atu.productv6;

public class Dog extends Animal{

    private String vaccination;
    private String shedding;
    private String neutered;

    public Dog() {
        super();
        vaccination = "";
        shedding = "";
        neutered = "";
        count++;
    }

    public String getVaccination() {
        return vaccination;
    }

    public void setVaccination(String vaccination) {
        this.vaccination = vaccination;
    }

    public String getShedding() {
        return shedding;
    }

    public void setShedding(String shedding) {
        this.shedding = shedding;
    }

    public String getNeutered() {
        return neutered;
    }

    public void setNeutered(String neutered) {
        this.neutered = neutered;
    }

    @Override
    public String toString() {
        return super.toString() + "Vaccination: " + vaccination + '\n' +
                "Shedding: " + shedding + '\n' +
                "Neutered: " + neutered + '\n';
    }
}
