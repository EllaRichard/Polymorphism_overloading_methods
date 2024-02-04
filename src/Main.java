public class Main {
    public static void main(String[] args) {

        Vet myVet = new Vet();

        Cat myCat = new Cat();
        Dog myDog = new Dog();

        myVet.giveShot(myCat);
        myVet.giveShot(myDog);






        myDog.makeSound();
        myDog.makeSound("woof!");
        myDog.makeSound(78);
        myDog.makeSound(44, 23.8);


        myDog.move();
        myDog.makeSound();
        myDog.makeSound("Another woof woof!");
    }
}