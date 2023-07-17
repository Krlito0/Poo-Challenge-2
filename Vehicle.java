public abstract class Vehicle{
    private String brand;

public Vehicle(String brand){
    this.brand=brand;
}

String getBrand(){
    return this.brand;
}


void setBrand(){
    this.brand=brand;
}

public abstract String doStuff();
}