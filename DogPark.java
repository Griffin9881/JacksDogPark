import java.util.ArrayList;

public class DogPark{
    private ArrayList<Dog> numberOfDogs;
    private int maxDogs;

    public DogPark(int maxDogs) {
        this.maxDogs = maxDogs;
        this.numberOfDogs.clear();
    }

    public DogPark(){
        this.maxDogs = 3000;
        this.numberOfDogs.clear();
    }

    public int getMaxDogs(){
        return maxDogs;
    }

    public int getNumberOfDogs(){
        return numberOfDogs.size();
    }

    public void addDog(Dog dog){
        if (numberOfDogs.size()<maxDogs){
            numberOfDogs.add(dog);
        }else{
            System.out.println("sorry your park is full");
        }
    }
    
    public void removeDog(Dog dog){
        if (numberOfDogs.size()>0){
                numberOfDogs.remove(dog);
        }else{
                System.out.println("cannot remove dog");
        }
    }

    public void closeDogPark(){
        while(numberOfDogs.size()>0){
            removeDog();
        }
    }

}