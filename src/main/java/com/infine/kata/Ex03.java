package com.infine.kata;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Ex03 {
    private static final String logs[] = {
            "9/24/2016 The Magnificent Seven 133min 126min Action",
            "9/30/2016 Miss Peregrine's Home for Peculiar Children 127min 100min Fantasy",
            "11/5/2015 Trolls 92min 40min Fantasy",
            "11/5/2015 Doctor Strange 115min 110min Fantasy",
            "11/19/2016 Fantastic Beasts and Where to Find Them 133min 120min Fantasy",
            "11/12/2016 Arrival 116min 20min SciFi"
    };

    private static final Pattern pattern = Pattern.compile("^(\\d+/\\d+/\\d+) (.*) (\\d+)min (\\d+)min (\\S+)$");

    static class LogEntry {
        private final String date;
        private final String title;
        private final int length;
        private final int watched;
        private final String genre;

        LogEntry(String date, String title, int length, int watched, String genre) {
            this.date = date;
            this.title = title;
            this.length = length;
            this.watched = watched;
            this.genre = genre;
        }

        int getLength() {
            return length;
        }

        @Override
        public String toString() {
            return "date=" + date + " title='" + title + "' length=" + length + " min, watched=" + watched + " min, genre='" + genre + "'";
        }

        int getWatched() {
            return watched;
        }

        public String getGenre() {
            return genre;
        }
    }

    private final List<LogEntry> logEntries;

    public Ex03() {
        logEntries = Arrays.stream(logs)
                .map(pattern::matcher)
                .filter(Matcher::matches)
                .map(matcher -> new LogEntry(matcher.group(1), matcher.group(2), Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), matcher.group(5)))
                .collect(Collectors.toList());
    }

    public String lambda1() {
        return logEntries.stream()
                .sorted((a, b) -> a.getLength() - b.getLength())
                .map(logEntry -> logEntry.toString())
                .collect(Collectors.joining("\n"));
    }

    public double lambda2() {
        return logEntries
                .stream()
                .mapToDouble(logEntry -> (double) logEntry.getWatched() / logEntry.getLength())
                .average()
                .getAsDouble();
    }

    public String lambda3() {
        return logEntries
                .stream()
                .filter(logEntry -> logEntry.getWatched() * 2 >= logEntry.getLength())
                .collect(Collectors.groupingBy(LogEntry::getGenre, Collectors.counting()))
                .entrySet()
                .stream()
                .collect(Collectors.maxBy((a, b) -> (int) (a.getValue() - b.getValue())))
                .get()
                .getKey();
    }


    public static void main(String[] args) {
        Ex03 ex03 = new Ex03();
        System.out.println(ex03.lambda1());
        System.out.println(ex03.lambda2());
        System.out.println(ex03.lambda3());
    }
}
