package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    //Done TODO - Create tests for `void add(Cat cat)`
    //Done TODO - Create tests for `void remove(Integer id)`
    //Done TODO - Create tests for `void remove(Cat cat)`
    //Done TODO - Create tests for `Cat getCatById(Integer id)`
    //Done TODO - Create tests for `Integer getNumberOfCats()`


    @Test
    public void getNumberOfCats() {
        //clear animal
        CatHouse.clear();

        // add animals
        CatHouse.add(new Cat("Millo", new Date(2001,2,1), 1));
        CatHouse.add(new Cat("Joofne", new Date(2005,3,2), 2));
        CatHouse.add(new Cat("Soofne", new Date(2024,3,3), 3));

        //Getting the number of animals
        int numberOfCats = CatHouse.getNumberOfCats();

        ;
        Assert.assertEquals(3, numberOfCats);
    }


    @Test
    public void getCatByIdTest() {
        Integer id = 123;
        Cat cat = new Cat(null, null, id);
        CatHouse.add(cat);
        Cat retrievedCat = CatHouse.getCatById(id);
        Assert.assertEquals(cat, retrievedCat);
    }

    @Test
    public void removeCatTest() {
        // Define an ID for the cat so we can know
        int id = 0;

        // Construct the cat
        Cat cat = new Cat(null, null, id);

        //add the cat
        CatHouse.remove(id);

        //Retrieve cat by Id
        Cat expectedRemovedCat = CatHouse.getCatById(id);


        Assert.assertNull(expectedRemovedCat);
    }




    @Test
    public void addCatTest() {
        // Define an ID for the cat so we can know
        int id = 0;

        // Construct the cat
        Cat cat = new Cat(null, null, id);

        //add the cat
        CatHouse.add(cat);

        //Retrieve cat by Id
        Cat expectedAddCat = CatHouse.getCatById(id);


        Assert.assertEquals(expectedAddCat, cat);
    }
}
