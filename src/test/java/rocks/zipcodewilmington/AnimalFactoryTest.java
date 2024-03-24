package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.security.PublicKey;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //Done TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //Done TODO - Create Test for `Animal createCat(String name, Date birthDate)`


    @Test
    public void createDogTest(){
        // Given (input parameters)
        String givenName = "Woofne"; // Name of the dog
        Date givenDate = new Date(); // Birth date of the dog

        // When (creating a dog using the AnimalFactory)
        Animal dog =  AnimalFactory.createDog(givenName, givenDate);

        // Then (verify that the created dog has the expected properties)
        Assert.assertEquals(givenName, dog.getName()); // Check if the name of the dog matches the given name
        Assert.assertEquals(givenDate, dog.getBirthDate()); // Check if the birth date of the dog matches the given date
    }


    @Test
    public void createCatTest(){
        // Given (input parameters)
        String givenName = "Meowne"; // Name of the cat
        Date givenDate = new Date(); // Birth date of the cat

        // When (creating a cat using the AnimalFactory)
        Animal cat =  AnimalFactory.createCat(givenName, givenDate);

        // Then (verify that the created dog has the expected properties)
        Assert.assertEquals(givenName, cat.getName()); // Check if the name of the dog matches the given name
        Assert.assertEquals(givenDate, cat.getBirthDate()); // Check if the birth date of the dog matches the given date
    }


}
