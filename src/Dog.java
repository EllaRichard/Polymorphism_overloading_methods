public class Dog extends Animal {

    private String name;
    public void move (){
        System.out.println("Move!");
    }
    //overides the make sound from our parent class - Animal
    public void makeSound(){
        System.out.println("woof! woof!");
    }
    public void makeSound (String soundType){
        System.out.println(soundType);
    }
}
