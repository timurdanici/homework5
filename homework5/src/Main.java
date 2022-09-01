public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(8000, 70);
        Car car3 = new Car(car2);
        car1.printinfo();
        car1.checkSpeed();
        System.out.println();
        car2.printinfo();
        car2.checkSpeed();
        System.out.println();
        car3.printinfo();
        car3.checkSpeed();

        MusicAlbum mus1= new MusicAlbum();
        MusicAlbum mus2 = new MusicAlbum(1999, "Operation: Doomsday");
        MusicAlbum mus3 = new MusicAlbum(mus1);
        mus1.printinfo();
        mus1.checkDate();
        System.out.println();
        mus2.printinfo();
        mus2.checkDate();
        System.out.println();
        mus3.printinfo();
        mus3.checkDate();
        System.out.println();
    }
}
