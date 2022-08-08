package com.romannumeral;

import org.junit.Test;

import static com.romannumeral.RomanNumeralGenerator.*;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class RomanNumeralGeneratorShould {
    @Test
    public void
    generate_roman_numerals_for_a_given_decimal() {
        assertThat(romanFor(1), is("I"));
        assertThat(romanFor(2), is("II"));
        assertThat(romanFor(3), is("III"));
        assertThat(romanFor(4), is("IV"));
        assertThat(romanFor(5), is("V"));
        assertThat(romanFor(6), is("VI"));
        assertThat(romanFor(7), is("VII"));
        assertThat(romanFor(8), is("VIII"));
        assertThat(romanFor(9), is("IX"));
        assertThat(romanFor(10), is("X"));
        assertThat(romanFor(11), is("XI"));
        assertThat(romanFor(12), is("XII"));
        assertThat(romanFor(13), is("XIII"));
        assertThat(romanFor(14), is("XIV"));
        assertThat(romanFor(15), is("XV"));
        assertThat(romanFor(16), is("XVI"));
        assertThat(romanFor(17), is("XVII"));
        assertThat(romanFor(18), is("XVIII"));
        assertThat(romanFor(19), is("XIX"));
        assertThat(romanFor(20), is("XX"));
        assertThat(romanFor(31), is("XXXI"));
        assertThat(romanFor(165), is("CLXV"));
        assertThat(romanFor(3987), is("MMMCMLXXXVII"));
        assertThat(romanFor(6523), is("MMMMMMDXXIII"));
    }
}