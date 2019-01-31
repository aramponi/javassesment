package com.infine.kata;

import org.junit.Test;

import static org.junit.Assert.*;

public class CompressorTest {

    @Test
    public void should_compress_a_given_string(){
        assertEquals("3A2B5A3B9C5A", Compressor.compress("AAABBAAAAABBBCCCCCCCCCAAAAA"));
        assertEquals("3A2B5A3B9C55", Compressor.compress("AAABBAAAAABBBCCCCCCCCC55555"));
        assertEquals("1A1B1C1D1E1F1G1H1I1J1K1L", Compressor.compress("ABCDEFGHIJKL"));
        assertEquals("", Compressor.compress(""));

    }

    @Test(expected=IllegalArgumentException.class)
    public void should_throw_an_exception_when_null_parameter() {
        Compressor.compress(null);
    }

}