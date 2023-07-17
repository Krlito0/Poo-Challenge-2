public class Hangar{
    public static void main(String[] args){
        Vehicle fefe = new Car("Ferrari",2500);
        fefe.doStuff();
        Vehicle titanic = new Boat("Titanic", 40000);
        titanic.doStuff();
        Vehicle sybille = new Motorcycle("S1000RR", 305);
        sybille.doStuff();
    }
}