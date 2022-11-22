package parent_child;

public class Execute {
    public static void main(String[] args) {
        Bike bike = new Bike();
        Car car = new Car();

        ///Execute.printArchive(bike);



        Cyclist cyclist = new Cyclist();
        cyclist.info();
        cyclist.run();

    }


    public static void printArchive(Archive archive) {
        archive.info();
        archive.run();
    }
}
