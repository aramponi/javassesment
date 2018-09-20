package com.infine.kata;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex01 {


    Map<String, Long> countStationsGroupByLineId() {
        Map<String, Long> numberOfStationsByLine = new HashMap<>();
        for (Trafic trafic : Trafic.trafic) {
            if (!numberOfStationsByLine.containsKey(trafic.getLine())) {
                numberOfStationsByLine.put(trafic.getLine(), 1L);
            } else {
                numberOfStationsByLine.put(trafic.getLine(), numberOfStationsByLine.get(trafic.getLine()) + 1);
            }
        }
        return numberOfStationsByLine;
    }
}
