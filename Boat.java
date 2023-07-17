public class Boat extends Vehicle{
    private int speed;

    public Boat(String brand, int speed){
        super(brand);
        this.speed=speed;
    }

    int getSpeed(){
        return this.speed;
    }

    void setSpeed(){
        this.speed=speed;
    }

    @Override
    public String doStuff(){
        System.out.println("I'm boat more precisely "+this.getBrand()+" and I glou glou, with a speed of "+String.valueOf(this.getSpeed())+ " Knots.");
        return "I'm boat more precisely "+this.getBrand()+" and I glou glou, with a speed of "+String.valueOf(this.getSpeed())+ " Knots.";
    }
}