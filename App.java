// dH 10/3/24
// zooVersion01.java
// revised 10/24/24

package dennis.zoo.com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Welcome to my Zoo Program!");

        // Create the animal name lists.
        // Call Utilities to get the animal name lists
        String filePath = "animalNames.txt";  // Update with the correct file path
        AnimalNameListsWrapper animalLists = Utilities.createAnimalNameLists(filePath);

        // Access the hyena names list
        ArrayList<String> listOfHyenaNames = animalLists.getHyenaNameList();
        ArrayList<String> listOfLionNames = animalLists.getLionNameList();
        ArrayList<String> listOfTigerNames = animalLists.getTigerNameList();
        ArrayList<String> listOfBearNames = animalLists.getBearNameList();

        // Use a for-each loop to output each hyena name
//        System.out.println("Hyena Names:");
//        for (String hyenaName : listOfHyenaNames) {
//            System.out.println(hyenaName);
//        }
//
//        // Similarly, you can do this for the other animal lists
//        ArrayList<String> listOfLionNames = animalLists.getLionNameList();
//        System.out.println("\nLion Names:");
//        for (String lionName : listOfLionNames) {
//            System.out.println(lionName);
//        }
//
//        ArrayList<String> listOfTigerNames = animalLists.getTigerNameList();
//        System.out.println("\nTiger Names:");
//        for (String tigerName : listOfTigerNames) {
//            System.out.println(tigerName);
//        }
//
//        ArrayList<String> listOfBearNames = animalLists.getBearNameList();
//        System.out.println("\nBear Names:");
//        for (String bearName : listOfBearNames) {
//            System.out.println(bearName);
//        }

        BufferedReader reader = null;

        String aniSex;
        String aniSpecies;

        try {
            // Create a BufferedReader to read the file
            reader = new BufferedReader(new FileReader("arrivingAnimals.txt"));
            String line;

            // Read each line of the file until reaching the end
            while ((line = reader.readLine()) != null) {
                // Print each line to the console
//                System.out.println(line);
                // Parse this line of text.
                String[] arrayOfStrPartsOnComma = line.split(", ");
                // output the array elements
                // this is a for : each loop - very handy when examining array elements.
                int elementNum = 0;
//                for (String thePart : arrayOfStrPartsOnComma) {
//                    System.out.println("Element " + elementNum + " of arrayOfStrPartsOnComma is: " + thePart);
//                    elementNum++;
//                }
                String aniColor;
                String aniWeight;
                String aniOrigin01;
                String aniOrigin02;
                String aniAge;

                aniColor = arrayOfStrPartsOnComma[2];
                aniWeight = arrayOfStrPartsOnComma[3];
                aniOrigin01 = arrayOfStrPartsOnComma[4];
                aniOrigin02 = arrayOfStrPartsOnComma[5];


//                System.out.println();
                String[] arrayOfStrPartsOnSpace = arrayOfStrPartsOnComma[0].split(" ");
                elementNum = 0;
//                for (String thePart : arrayOfStrPartsOnSpace) {
//                    System.out.println("Element " + elementNum + " of arrayOfStrPartsOnSpace is: " + thePart);
//                    elementNum++;
//                }
                // Get animal's sex and species and age
                aniAge = arrayOfStrPartsOnSpace[0];
                // make this an int.
                int intAniAge = Integer.parseInt(aniAge);
                aniSex = arrayOfStrPartsOnSpace[3];
                aniSpecies = arrayOfStrPartsOnSpace[4];
//                System.out.println("\n The animal's sex is " + aniSex);
//                System.out.println("\n The species is " + aniSpecies);
//                System.out.println("\n The color is " + aniColor);
//                System.out.println("\n The weight is " + aniWeight);
//                System.out.println("\n Origin01 is " + aniOrigin01);
//                System.out.println("\n Origin02 is " + aniOrigin02);

                System.out.println();

                String[] arrayOfStrPartsOnSpace02 = arrayOfStrPartsOnComma[1].split(" ");
                elementNum = 0;
//                for (String thePart : arrayOfStrPartsOnSpace02) {
//                    System.out.println("Element " + elementNum + " of arrayOfStrPartsOnSpace02 is: " + thePart);
//                    elementNum++;
//                }
                System.out.println();

                String ageInYears = arrayOfStrPartsOnSpace[0];
                String animalBirthSeason = arrayOfStrPartsOnSpace02[2];
//                System.out.println("The age in years of the animal is: " + ageInYears);
//                System.out.println("The season of birth of the animal is: " + animalBirthSeason);

                // Create the right animal object for this arriving animal.
//                if (aniSpecies.equals("hyena")) {
//                    System.out.println("\n The animal is a hyena!");
                // Create a hyena object and attach to the hyena ArrayList;
//                    Hyena hyena = new Hyena(aniSex, intAniAge, 99, "to be named",
//                            "animalID", "animalBirthDate", aniColor,
//                            aniOrigin01 + aniOrigin02);
//                    System.out.println(" The new hyena's color is :" + hyena.getAnimalColor());
//                }


                // this is a unit test - we are testing the Animal constructor we just created


                // Prove it!
//                System.out.println("\n this is the new animal!\n");
//                System.out.println("\n ID is: " + myNewAnimal.getAnimalID() + " and... name is: " + myNewAnimal.getAnimalName() + "\n");
//
//                System.out.println("animal birthdate is: " + Utilities.calcAnimalBirthDate(Integer.parseInt(ageInYears), animalBirthSeason));
//                System.out.println(myNewAnimal.getAnimalBirthDate());
                String aniName = null;
                switch (aniSpecies) {
                    case "hyena" -> aniName = listOfHyenaNames.get(Hyena.numOfHyenas);
                    case "lion" -> aniName = listOfLionNames.get(Lion.numOfLions);
                    case "tiger" -> aniName = listOfTigerNames.get(Tiger.numOfTigers);
                    case "bear" -> aniName = listOfBearNames.get(Bear.numOfBears);
                }

                ArrayList<Animal> hyenas = new ArrayList<>();


                Animal animal = new Animal();
                switch (aniSpecies) {
                    case "hyena" ->
                            animal = new Hyena(aniSex, Integer.parseInt(aniAge), aniWeight, aniName, Utilities.calcAnimalID(aniSpecies), Utilities.calcAnimalBirthDate(Integer.parseInt(aniAge), animalBirthSeason), aniColor, aniOrigin01 + ", " + aniOrigin02)
                    hyenas.add(animal);
                    case "tiger" ->
                            animal = new Tiger(aniSex, Integer.parseInt(aniAge), aniWeight, aniName, Utilities.calcAnimalID(aniSpecies), Utilities.calcAnimalBirthDate(Integer.parseInt(aniAge), animalBirthSeason), aniColor, aniOrigin01 + ", " + aniOrigin02);
                    case "bear" ->
                            animal = new Bear(aniSex, Integer.parseInt(aniAge), aniWeight, aniName, Utilities.calcAnimalID(aniSpecies), Utilities.calcAnimalBirthDate(Integer.parseInt(aniAge), animalBirthSeason), aniColor, aniOrigin01 + ", " + aniOrigin02);
                    case "lion" ->
                            animal = new Lion(aniSex, Integer.parseInt(aniAge), aniWeight, aniName, Utilities.calcAnimalID(aniSpecies), Utilities.calcAnimalBirthDate(Integer.parseInt(aniAge), animalBirthSeason), aniColor, aniOrigin01 + ", " + aniOrigin02);
                }


                System.out.println(animal.getAnimalName());


            }

        } catch (IOException e) {
            // Handle exceptions, such as file not found or I/O errors
            e.printStackTrace();
        } finally {
            // Close the BufferedReader in the finally block to ensure it gets closed
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }

    }
}