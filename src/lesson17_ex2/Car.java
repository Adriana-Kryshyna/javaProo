package lesson17_ex2;


//дописати логіку

public class Car {
    int speed;
    int price;
    String model;
    String color;

    Car(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    public String toString() {
        return this.model + " " + this.color + " " + this.speed + " " + this.price;
    }
    //***************************************дописана логіка**************
    public int compareTo(Object o){
        int mu= this.price-((Car)o).price;
        if(mu==0){
            return this.speed-((Car)o).speed;
        } else {
            return mu;}
    }
}

