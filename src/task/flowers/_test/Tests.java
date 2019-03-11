package task.flowers._test;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import task.flowers.model.*;
import task.flowers.model.entity.Accessory;
import task.flowers.model.entity.Flower;
import task.flowers.model.entity.Rose;

import java.util.ArrayList;

/**
 * Test class
 */
public class Tests {

    static ArrayList<Flower> flowers;
    static ArrayList<Accessory> accessories;
    static Bouquet bouquet;

    @BeforeClass
    public static void before(){
        flowers = new ArrayList<>();
        accessories = new ArrayList<>();

        flowers.add(new Rose(100, 20, 3));
        accessories.add(new Accessory("Accessory", 10));
    }

    /*@Test(expected = NullPointerException.class)
    public void testNullFlowers(){
        bouquet = new Bouquet(null, accessories);
    }

    @Test(expected = NullPointerException.class)
    public void testNullAccessories(){
        bouquet = new Bouquet(flowers, null);
    }*/

    @Test
    public void costTestTrue(){
        int expectedCost = 350;
        bouquet = new Bouquet();
        Assert.assertTrue(expectedCost == bouquet.countCost());
    }

    @Test
    public void costTestFalse(){
        int expectedCost = 60;
        bouquet = new Bouquet();
        Assert.assertFalse(expectedCost == bouquet.countCost());
    }
}
