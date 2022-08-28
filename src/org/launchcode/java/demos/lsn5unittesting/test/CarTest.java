package org.launchcode.java.demos.lsn5unittesting.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;
import org.launchcode.java.demos.lsn5unittesting.main.Car;

import static org.junit.Assert.assertEquals;

public class CarTest {

    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
    @Test
    public void emptyTest(){
        assertEquals(10,10,.001);
    }

    //TODO: constructor sets gasTankLevel properly

    Car test_car;
    @Before
    public void createCarObject() {
        test_car = new Car("Toyota","Prius",10,50);
    }

    @Test
    public  void testInitialGasTank(){
        assertEquals(10,test_car.getGasTankSize(),.001);
    }

    //TODO: gasTankLevel is accurate after driving within tank range
    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    //TODO: can't have more gas than tank size, expect an exception

}
