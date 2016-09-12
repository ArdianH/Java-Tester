package com.javafortesters10;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Ardian Hosen on 03/09/2016.
 */
public class CollectionTest {

    @Test
    public void simpleArrayExample()
    {
        String[] numbers = {"zero", "one", "two", "three"};

        for (String numberText : numbers) {
            System.out.println(numberText);
        }

        assertEquals("zero", numbers[0]);
        assertEquals("one", numbers[1]);
    }

    @Test
    public void simpleCollectionExample()
    {
        String[] numbers2 = {"zero", "one", "two", "three"};
        List<String> numbersCollection = Arrays.asList(numbers2);

        for (String numberText : numbersCollection) {
            System.out.println(numberText);
        }

        assertEquals("zero", numbersCollection.get(0));
        assertEquals("two", numbersCollection.get(2));
    }

    @Test
    public void simpleDynamicCollection()
    {
        List<String> numbersCollection2 = new ArrayList<String>();
        numbersCollection2.add("zero");
        numbersCollection2.add("one");
        numbersCollection2.add("two");
        numbersCollection2.add("three");

        for (String element : numbersCollection2) {
            System.out.println(element);
        }

        assertEquals("one", numbersCollection2.get(1));
        assertEquals("two", numbersCollection2.get(2));
    }

    @Test
    public void collectionMethod()
    {
        Collection<String> workDays    = new ArrayList<>();
        Collection<String> weekendDays = new ArrayList<String>();
        Collection<String> daysOfWeek  = new ArrayList<String>();

        workDays.add("Monday");
        workDays.add("Tuesday");
        workDays.add("Wednesday");
        workDays.add("Thursday");
        workDays.add("Friday");
        assertEquals("Check size after addition", 5, workDays.size());

        weekendDays.add("Saturday");
        weekendDays.add("Funday");
        weekendDays.remove("Funday");
        weekendDays.add("Sunday");
        assertFalse("Check element not exist after removal", weekendDays.contains("Funday"));

        daysOfWeek.addAll(workDays);
        daysOfWeek.addAll(weekendDays);
        assertTrue("Collection contains all element of another collection", daysOfWeek.containsAll(weekendDays));
    }

}
