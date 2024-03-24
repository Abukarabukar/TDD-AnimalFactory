package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    //Done TODO - Create tests for `void add(Dog dog)`
    //Done TODO - Create tests for `void remove(Integer id)`
    //Done TODO - Create tests for `void remove(Dog dog)`
    //Done TODO - Create tests for `Dog getDogById(Integer id)`
    //Done TODO - Create tests for `Integer getNumberOfDogs()`



    @Test
    public void getNumberOfDogs() {
        //clear animal
        DogHouse.clear();

        // add animals
        DogHouse.add(new Dog("Woofne", new Date(98,5,4), 1));
        DogHouse.add(new Dog("Joofne", new Date(96,7,9), 2));
        DogHouse.add(new Dog("Soofne", new Date(97,1,5), 3));

        //Getting the number of animals
        int numberOfDogs = DogHouse.getNumberOfDogs();

      ;
        Assert.assertEquals(3, numberOfDogs);
    }






    //review

    @Test
    public void getDogByIdTest() {
        Integer id = 123;
        Dog dog = new Dog(null, null, id);
        DogHouse.add(dog);
        Dog actual = DogHouse.getDogById(id);
        Assert.assertEquals(dog, actual);
    }







    @Test
    public void removeDogTest() {
        // Define an ID for the dog so we can know
        int id = 0;

        // Construct the dog
        Dog dog = new Dog(null, null, id);

        //add the dog
        DogHouse.remove(id);

        //Retrieve dog by Id
        Dog expectedRemovedDog = DogHouse.getDogById(id);


        Assert.assertNull(expectedRemovedDog);
    }













    @Test
    public void addDogTest() {
        // Define an ID for the dog so we can know
        int id = 0;

        // Construct the dog
        Dog dog = new Dog(null, null, id);

        //add the dog
        DogHouse.add(dog);

        //Retrieve dog by Id
        Dog expectedAddDot = DogHouse.getDogById(id);


        Assert.assertEquals(expectedAddDot, dog);
    }
















    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        AnimalFactory animalFactory = new AnimalFactory();
        Dog animal = animalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
}
