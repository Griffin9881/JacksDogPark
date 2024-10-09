public class Main {
    
public static void main(String[] args){
    DogPark bob = new DogPark(444);
    bob.addDog();
    bob.addDog();
    bob.addDog();
    System.out.println(bob.getNumberOfDogs());
    bob.removeDog();
    System.out.println(bob.getNumberOfDogs());
    bob.closeDogPark();
    System.out.println(bob.getNumberOfDogs());
}

}