package task.flowers._test;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import task.flowers.model.*;

import java.util.ArrayList;

public class Tests {

    static Builder builder;
    static ArrayList<Flower> flowers;
    static ArrayList<Accessory> accessories;
    static Bouquet bouquet;

    @BeforeClass
    public static void before(){
        builder = new Builder();
        flowers = new ArrayList<>();
        accessories = new ArrayList<>();

        flowers.add(new Rose(100, 20, 3));
        accessories.add(new Accessory("Accessory", 10));

        bouquet = builder
                .buildFlowers(flowers)
                .buildAccessories(accessories)
                .build();
    }

    @Test(expected = NullPointerException.class)
    public void testNullFlowers(){
        builder.buildFlowers(null)
                .buildAccessories(accessories)
                .build();
    }

    @Test(expected = NullPointerException.class)
    public void testNullAccessories(){
        builder.buildFlowers(flowers)
                .buildAccessories(null)
                .build();
    }

    @Test
    public void costTestTrue(){
        int expectedCost = 50;
        Assert.assertTrue(expectedCost == bouquet.countCost());
    }

    @Test
    public void costTestFalse(){
        int expectedCost = 60;
        Assert.assertFalse(expectedCost == bouquet.countCost());
    }
}
