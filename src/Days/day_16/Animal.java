package Days.day_16;

public abstract class Animal {
    // Abstract class

        // Abstract method (does not have a body)
        public abstract void animalSound();
        // Regular Method
    public void fly(){
        System.out.println(" able to fly after fix my my wing! ");
    }
        // Regular method
        public void sleep() {
            System.out.println("Zzz");
        }
    }

    // Subclass (inherit from Animal)
    class Pig extends Animal {
        public void animalSound() {
            // The body of animalSound() is provided here
            System.out.println("The pig says: wee wee");
        }
    }
    class Hen extends Animal{
    public void animalSound(){
        // The body of animalSound() is provided here
        System.out.println(" The chicken says: Kakk Kakk ");
        System.out.println(" chicken= kikikakakkkiio" );

    }
    }

    class Main {
        public static void main(String[] args) {
            Pig myPig = new Pig(); // Create a Pig object
            Hen myhen = new Hen();// hen object

            myPig.sleep();
            myhen.animalSound();
            myhen.sleep();
            myPig.animalSound();
        }
    }
