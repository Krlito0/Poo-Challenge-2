public class Car extends Vehicle{
    private int kilometers;

    public Car(String brand, int kilometers) {
        super(brand);
        this.kilometers=kilometers;
    }

    int getKilometers(){
        return this.kilometers;
    }

    void setKilometers(){
        this.kilometers = kilometers;
    }

    @Override
    public String doStuff(){
        System.out.println("I'm a car more precisely a " +this.getBrand()+ " and I vroum vroum, since "+String.valueOf(this.getKilometers())+" Km.");
        return "I'm a car more precisely a " +this.getBrand()+ " and I vroum vroum, since "+String.valueOf(this.getKilometers())+" Km.";
    }
}