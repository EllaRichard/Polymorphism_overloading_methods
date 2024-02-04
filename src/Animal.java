public class Animal {
    private String name;

    //Method overloading: meaning it has the same name but the difference is what we are passing in our methods
    public void makeSound() {
        System.out.println("grrrr");
    }

    public void makeSound(String soundType) {
        System.out.println(soundType);
    }

    public void makeSound(int soundFrequency) {
        System.out.println(soundFrequency);
    }

    public void makeSound(int soundFrequency, double rate) {
        System.out.println(soundFrequency + ", " + rate);
    }
}