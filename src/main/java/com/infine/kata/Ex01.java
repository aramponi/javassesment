package com.infine.kata;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Ex01 {

    Map<String, Long> countStationsGroupByLineId() {      
        Map<String, Long> numberOfStationsByLine =
                Arrays.stream(Trafic.trafic).collect(
                        Collectors.groupingBy(
                                Trafic::getLine, Collectors.counting()
                        )
                );
        return numberOfStationsByLine;

    }

}
