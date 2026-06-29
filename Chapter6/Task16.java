package Chapter6;

// Animal interface
interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

// Gorilla class implementing Animal
class Gorilla implements Animal {

    @Override
    public boolean feed(boolean timeToEat) {
        // put gorilla food into cage
        if (timeToEat) {
            return true;
        }
        return false;
    }

    @Override
    public void groom() {
        // lather, rinse, repeat
        System.out.println("Gorilla is being groomed.");
    }

    @Override
    public void pet() {
        // pet at your own risk
        System.out.println("Petting the gorilla...");
    }
}

public class Task16 {
    public static void main(String[] args) {

        Gorilla gorilla = new Gorilla();

        System.out.println("Fed: " + gorilla.feed(true));
        gorilla.groom();
        gorilla.pet();
    }
}