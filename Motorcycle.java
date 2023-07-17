public class Motorcycle extends Boat{

    public Motorcycle(String brand, int speed){
        super(brand, speed);
    }
    @Override
    public String doStuff(){
        System.out.println("I'm a motorcycle more precisely "+this.getBrand()+" and I pouiinnnnnnnn at "+this.getSpeed()+" Km/h.");
        return "I'm a motorcycle more precisely "+this.getBrand()+" and I pouiinnnnnnnn at "+this.getSpeed()+" Km/h.";
    }
}