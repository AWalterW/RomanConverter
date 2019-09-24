package no.kristiania;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanConverterTest {

    @Test
    void shouldCalculateMultiplesOfTen() {
        assertEquals("XXXVII", RomanConverter.toRoman(37));
    }
    @Test
    void shouldCalculateSimpleDigits() {
        assertEquals("MMMDCCCLXXXVIII", RomanConverter.toRoman(3888));
    }
    @Test
    void shouldCalculateFourLikeDigits() {
        assertEquals("CDXLIV", RomanConverter.toRoman(444));
    }
    @Test
    void shouldCalculateNineLikeDigits() {
        assertEquals("CMXCIX", RomanConverter.toRoman(999));
    }

}
