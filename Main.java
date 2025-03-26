abstract class Car{
    abstract void fuelType();
    void color(){
        System.out.println("Black");
    }
}

class Tata extends Car{
    void fuelType(){
        System.out.println("Diesel");
    }
}

class Main{
    public static void main(String[] args) {
        Tata t = new Tata();
        t.fuelType();
        t.color();
    }
}