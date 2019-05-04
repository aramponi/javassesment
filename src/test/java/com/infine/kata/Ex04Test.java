package com.infine.kata;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class Ex04Test {
    @Test
    public void shouldFindAllSubSets() {
        List<Integer> list = Arrays.asList(1,2,3,4);
        Set<String> result = Ex04.printAllSubsets(list);
        assertTrue(result.contains(""));
        assertTrue(result.contains("1,"));
        assertTrue(result.contains("2,"));
        assertTrue(result.contains("1,2,"));
        assertTrue(result.contains("3,"));
        assertTrue(result.contains("1,3,"));
        assertTrue(result.contains("2,3,"));
        assertTrue(result.contains("1,2,3,"));
        assertTrue(result.contains("4,"));
        assertTrue(result.contains("1,4,"));
        assertTrue(result.contains("2,4,"));
        assertTrue(result.contains("1,2,4,"));
        assertTrue(result.contains("3,4,"));
        assertTrue(result.contains("1,3,4,"));
        assertTrue(result.contains("2,3,4,"));
        assertTrue(result.contains("1,2,3,4,"));
    }

}