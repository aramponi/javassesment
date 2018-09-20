package com.infine.kata;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.assertEquals;

public class Ex01Test {
    private Ex01 ex01 = new Ex01();
    @Test
    public void should_print_the_number_of_stations_by_line_id_asc() {
        Map<String, Long> map = ex01.countStationsGroupByLineId();
        assertEquals(25, map.get("1").longValue());
        assertEquals(6, map.get("11").longValue());
        assertEquals(3, map.get("14").longValue());
        assertEquals(30, map.get("8").longValue());
        assertEquals(3, map.get("3bis").longValue());
    }
}
