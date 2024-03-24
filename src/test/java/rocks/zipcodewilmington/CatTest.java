package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    //Done// TODO - Create tests for `void setName(String name)`
   //Done // TODO - Create tests for `speak`
    //Done // TODO - Create tests for `setBirthDate(Date birthDate)`
    //Done TODO - Create tests for `void eat(Food food)`
    //Done TODO - Create tests for `Integer getId()`
    //Done TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    //Done TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`



    @Test
    public void mammalInheritanceTest(){
        //Create Cat object
        Cat cat = new Cat("MeowJack",new Date(1997,5,4), 5415);

        Assert.assertTrue(cat instanceof Mammal);
    }



@Test
    public void animalInheritanceTest(){
    //Create Cat object
    Cat cat = new Cat("MeowJack",new Date(1997,5,4), 5415);

    Assert.assertTrue(cat instanceof Mammal);
}

    @Test
    public void getIdTest(){
//       // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        Integer expected = 0;
        Integer actual = cat.getId();

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
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // Create a new instance of Food
        Food food = new Food();

        // Call the eat method on the cat with the food
        cat.eat(food);

        //Getting the result

       int actual = cat.getNumberOfMealsEaten();

       // expecting the cat eat one time.
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }








    @Test
    public void setBirthdateTest(){
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        // this give ne birth date
         Date actual = new Date();

         // call the method with new birth date
       cat.setBirthDate(actual);

       //getting the result
        Date expected = cat.getBirthDate();


        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(expected, actual);
    }






    @Test
    public void speakTest(){
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String expected = "meow!";
        String actual = cat.speak();





        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(expected, actual);
    }





    @Test
    public void setNameTest(){
//       // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        cat.setName("cat");
        String actual = cat.getName();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals("cat", actual);
    }

    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

}
