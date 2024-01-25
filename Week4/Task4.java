// General Class for Bicycle Parts
class BicyclePart {
    // General attributes and methods for a bicycle part
    // This can be extended to include common properties or methods for all parts
}

// Specific Class for Wheel
class Wheel extends BicyclePart {
    private String wheelType; // "front" or "rear"

    public Wheel(String wheelType) {
        this.wheelType = wheelType;
    }

    // Additional methods specific to wheels
    public String getWheelType() {
        return wheelType;
    }
}

// Specific Class for Steering Wheel
class SteeringWheel extends BicyclePart {
    // Attributes and methods specific to the steering wheel
}

// Specific Class for Pedals
class Pedals extends BicyclePart {
    // Attributes and methods specific to the pedals
}

// Specific Class for Chain
class Chain extends BicyclePart {
    // Attributes and methods specific to the chain
}

// Bicycle Class
public class Bicycle {
    private SteeringWheel steeringWheel;
    private Pedals pedals;
    private Chain chain;
    private Wheel frontWheel;
    private Wheel rearWheel;

    public Bicycle() {
        this.steeringWheel = new SteeringWheel();
        this.pedals = new Pedals();
        this.chain = new Chain();
        this.frontWheel = new Wheel("front");
        this.rearWheel = new Wheel("rear");
    }

    // Additional methods for bicycle operations
    public void printBicycleDetails() {
        System.out.println("Bicycle has " + frontWheel.getWheelType() + " wheel and " +
                           rearWheel.getWheelType() + " wheel.");
        // Further details can be printed here
    }

    // Main method for demonstration
    public static void main(String[] args) {
        Bicycle myBike = new Bicycle();
        myBike.printBicycleDetails();
    }
}
