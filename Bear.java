package dennis.zoo.com;

public class Bear extends dennis.zoo.com.Animal {
    // Create a static int that keep track of the number of hyenas created.
    static int numOfBears = 0;

    // Create a constructor that will have all the fields I want.
    public Bear(String sex, int age, String weight, String animalName,
                 String animalID, String animalBirthDate, String animalColor,
                 String animalOrigin){
        super(sex, age, weight, animalName, animalID, animalBirthDate, animalColor, animalOrigin);
        numOfBears++;
    }



}
