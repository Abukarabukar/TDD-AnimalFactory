package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void mammalInheritanceTest(){
        //Create Cat object
        Dog dog = new Dog("Woofne",new Date(1957,5,4), 5415);

        Assert.assertTrue(dog instanceof Mammal);
    }



    @Test
    public void animalInheritanceTest(){
        //Create Cat object
        Dog dog = new Dog("Woofne",new Date(1957,5,4), 5415);

        Assert.assertTrue(dog instanceof Mammal);
    }

    @Test
    public void getIdTest(){
//       // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        Integer expected = 0;
        Integer actual = dog.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(expected, actual);
    }














    @Test
    public void eatTest(){
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // Construct a cat object
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // Create a new instance of Food
        Food food = new Food();

        // Call the eat method on the cat with the food
        dog.eat(food);

        //Getting the result

        int actual = dog.getNumberOfMealsEaten();

        // expecting the cat eat one time.
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }








    @Test
    public void setBirthdateTest(){
        // Given (cat data)
        String givenName = "Woofne";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        // this give ne birth date
        Date actual = new Date();

        // call the method with new birth date
        dog.setBirthDate(actual);

        //getting the result
        Date expected = dog.getBirthDate();


        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(expected, actual);
    }






    @Test
    public void speakTest(){
        // Given (cat data)
        String givenName = "Woofne";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String expected = "bark!";
        String actual = dog.speak();





        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(expected, actual);
    }





//    @Test
//    public void setNameTest(){
////       // Given (cat data)
//        String givenName = "Woofne";
//        Date givenBirthDate = new Date();
//        Integer givenId = 0;
//
//        // When (a cat is constructed)
//        Dog dog = new Dog(givenName, givenBirthDate, givenId);
//
//        // When (we retrieve data from the cat)
//        dog.setName("dog");
//        String actual = dog.getName();
//
//        // Then (we expect the given data, to match the retrieved data)
//        Assert.assertEquals("dog", actual);
//    }

    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Woofne";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
}
