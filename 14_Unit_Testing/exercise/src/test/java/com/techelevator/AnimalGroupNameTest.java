package com.techelevator;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;


public class AnimalGroupNameTest {
    final double DOUBLE_FUDGE_FACTOR = 0.001d;

    AnimalGroupName animalGroupName = new AnimalGroupName();

    @Test
    public void AnimalGroupName() {
        assertEquals("Input: animalGroupName(\"giraffe\")", "Tower", animalGroupName.AnimalGroupName("giraffe"));
        assertEquals("Input: animalGroupName(\"GiRaFfE\")", "Tower", animalGroupName.AnimalGroupName("GiRaFfE"));
        assertEquals("Input: animalGroupName(\"\")", "unknown", animalGroupName.AnimalGroupName(""));
        assertEquals("Input: animalGroupName(\"Crow\")", "Murder", animalGroupName.AnimalGroupName("Crow"));
        assertEquals("Input: animalGroupName(\"walrus\")", "unknown", animalGroupName.AnimalGroupName("walrus"));
    }

}
