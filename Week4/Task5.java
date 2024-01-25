// Base Class: Animal
class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Subclass: Fish
class Fish extends Animal {
    public Fish(String name) {
        super(name);
    }
    // Fish-specific methods
}

// Subclasses of Fish
class Salmon extends Fish {
    public Salmon() {
        super("Salmon");
    }
    // Salmon-specific methods
}

class Goldfish extends Fish {
    public Goldfish() {
        super("Goldfish");
    }
    // Goldfish-specific methods
}

// Subclass: Birds
class Birds extends Animal {
    public Birds(String name) {
        super(name);
    }
    // Birds-specific methods
}

// Subclasses of Birds
class Eagle extends Birds {
    public Eagle() {
        super("Eagle");
    }
    // Eagle-specific methods
}

class Sparrow extends Birds {
    public Sparrow() {
        super("Sparrow");
    }
    // Sparrow-specific methods
}

// Subclass: Mammals
class Mammals extends Animal {
    public Mammals(String name) {
        super(name);
    }
    // Mammals-specific methods
}

// Subclasses of Mammals
class Lion extends Mammals {
    public Lion() {
        super("Lion");
    }
    // Lion-specific methods
}

class Elephant extends Mammals {
    public Elephant() {
        super("Elephant");
    }
    // Elephant-specific methods
}

// Main class to demonstrate the hierarchy
public class Main {
    public static void main(String[] args) {
        Salmon salmon = new Salmon();
        Eagle eagle = new Eagle();
        Lion lion = new Lion();

        System.out.println(salmon.getName()); // Outputs "Salmon"
        System.out.println(eagle.getName());  // Outputs "Eagle"
        System.out.println(lion.getName());   // Outputs "Lion"
    }
}
