package io.zipcoder.polymorphism;

import java.util.ArrayList;

import java.util.Scanner;

public class MainApplication {

    public static void main(String[] args) {

        //create an array of Pet objects
        ArrayList<Pet> pets = new ArrayList<Pet>();

        //gets user input for number of pets
        Scanner numOfPets = new Scanner(System.in);
        System.out.print("How many pets do you have? ");
        int petNum = numOfPets.nextInt();

        //length of loop is based on user's input for number of pets, lines 15-17
        for (int i = 0; i < petNum; i++) {

            //gets user input for type of pet
            Scanner typeOfPet = new Scanner(System.in);
            System.out.print("What pet do you have? ");
            String petType = typeOfPet.next(); //is the Pet a dog, cat or bird

            //gets user input for name of pet
            Scanner nameOfPet = new Scanner(System.in);
            System.out.print("What is the name of your pet? "); // pet name
            String petName = nameOfPet.nextLine();

            //checks user input is equal to "dog"
            if (petType.equalsIgnoreCase("dog")){
                System.out.println("Dog created");
                Dog dog = new Dog(petName);
                pets.add(dog);

            }

            //checks user input is equal to "cat"
            if (petType.equalsIgnoreCase("cat")) {
                System.out.println("Cat created");
                Cat cat = new Cat(petName);
                pets.add(cat);
            }

            //checks user input is equal to "dog"
            if (petType.equalsIgnoreCase("bird")) {
                System.out.println("Bird created");
                Bird bird = new Bird(petName);
                pets.add(bird);
            }
        } //end of loop

        //print out array
        System.out.println(pets.size() + " Pet(s): " + pets);

        //loops through pet objects in pets array for each pet in the list to speak
        for(Pet pet : pets){
            System.out.print(pet.name + " says: ");
            pet.speak();
        }//end of loop
    }
}

