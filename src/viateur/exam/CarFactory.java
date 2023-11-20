package viateur.exam;
import java.io.*;
class SeatNumberException extends Exception {
    public SeatNumberException(String message) {
        super(message);
    }
}
interface RadioTv {
    void watchTelevision();
    void playRadio();
}

interface AirConditioner {
    void manageTemperature();
}


class Car {
    String color;
    int numberOfSeats;
    int minimumHeight;
    int maximumHeight;
    public Car(String color, int numberOfSeats, int minimumHeight, int maximumHeight) throws SeatNumberException {
        if (numberOfSeats > 100) {
            throw new SeatNumberException("The number of seats is beyond 100");
        }
            this.color = color;
        this.numberOfSeats = numberOfSeats;
            this.minimumHeight = minimumHeight;
            this.maximumHeight = maximumHeight;
        }
    }
    class Toyota extends Car implements RadioTv {
        public Toyota(String color, int numberOfSeats, int minimumHeight, int maximumHeight) throws SeatNumberException {
            super(color, numberOfSeats, minimumHeight, maximumHeight);
        }

        @Override
        public void watchTelevision() {
            System.out.println("watching television in the toyota");
        }
        @Override
        public void playRadio() {
            System.out.println("radio in toyota");
        }
    }


    class Benz extends Car implements AirConditioner, RadioTv {
        public Benz(String color, int numberOfSeats, int minimumHeight, int maximumHeight) throws SeatNumberException {
            super(color, numberOfSeats, minimumHeight, maximumHeight);
        }

        @Override
        public void watchTelevision() {

            System.out.println("Watching TV in Benz");
        }

        @Override
        public void playRadio() {

            System.out.println("Playing radio in Benz");
        }

        @Override
        public void manageTemperature() {

            System.out.println("temperature is being managed in benz");
        }
    }

    public class CarFactory {
        public static void main(String[] args) {
            try {
                Benz benz = new Benz("white", 110, 200, 500);
                Toyota toyota = new Toyota("blue",23,34,23);


                // Writing to file in carObject.serialization file
                ObjectOutputStream objectOutput = new ObjectOutputStream(new FileOutputStream("carObject.ser"));
                objectOutput.writeObject(benz);
                objectOutput.close();
                //Getting the file from the user
                ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("carObject.ser"));
                Car readBenz = (Car) objectInputStream.readObject();
                objectInputStream.close();
                //printing to the console in the terminal
                System.out.println(toyota);


                System.out.println("Color: " + readBenz.color);
                System.out.println("Number of the seats" + readBenz.numberOfSeats);
                System.out.println("Minimum height: " + readBenz.minimumHeight);
                System.out.println("Maximum height: " + readBenz.maximumHeight);
            } catch (SeatNumberException | IOException | ClassNotFoundException e) {
                e.toString();
            }
        }
    }


