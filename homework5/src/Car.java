public class Car {
    String Mark;
    int Price;
    int Speed;

    Car(){
        Mark = "Audi";
        Price = 9999;
        Speed = 170;
    }

    Car(int Price, int Speed){
        Mark = "BMW";
        this.Price = Price;
        this.Speed = Speed;
    }

    Car(Car Klon){
        Mark = Klon.Mark;
        Price = Klon.Price;
        Speed = Klon.Speed;
    }

    void printinfo(){
        System.out.println("Mark: " + this.Mark);
        System.out.println("Price: " + this.Price + " €");
        System.out.println("Speed: " + this.Speed + " km/h");
    }

    void checkSpeed(){
        if(this.Speed > 100){
            System.out.println("The speed of this car is above 100 km/h");
        }
        if (this.Speed < 100){
            System.out.println("The speed of this car is less than 100 km/h");
        }
        if(this.Speed == 100){
            System.out.println("The speed of this car is 100 km/h");
        }
    }
}
