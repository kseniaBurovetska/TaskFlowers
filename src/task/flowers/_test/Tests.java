package task.flowers._test;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import task.flowers.db.DBHandler;
import task.flowers.model.*;

import java.util.ArrayList;

public class Tests {

    static DBHandler dbHandler;
    static Bouquet bouquet;

    @BeforeClass
    public static void before(){
        dbHandler = null;
        bouquet = new Bouquet();

    }

    /*@Test(expected = NullPointerException.class)
    public void testBouquetNullPointer(){
        Bouquet.dbAccessories = null;
        Bouquet.dbFlowers = null;
        Bouquet bouquet = new Bouquet();
    }

    @Test(expected = NullPointerException.class)
    public void testBouquetNullFlowers(){
        Bouquet.dbFlowers = null;
        Bouquet bouquet = new Bouquet();
    }

    @Test(expected = NullPointerException.class)
    public void testBouquetNullAccessories(){
        Bouquet.dbAccessories = null;
        Bouquet bouquet = new Bouquet();
    }

    @Test
    public void testBouquet(){
        Bouquet bouquet = new Bouquet();
    }*/

    @Test
    public void costTestTrue(){
        int expectedCost = 350;
        Assert.assertTrue(expectedCost == bouquet.countCost());
    }

    @Test
    public void costTestFalse(){
        int expectedCost = 60;
        Assert.assertFalse(expectedCost == bouquet.countCost());
    }
}
