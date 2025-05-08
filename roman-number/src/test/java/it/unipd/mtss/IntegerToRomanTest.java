package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import com.github.fracpete.romannumerals4j.RomanNumeralFormat; //for Cross-checking
import org.junit.Test;

public class IntegerToRomanTest 
{
    @Test
    public void testConvert_numberIntoBoundaries()
    {
        //Arrange
        String ris, ris_cross;
        RomanNumeralFormat converter = new RomanNumeralFormat();
        //Act
        ris = IntegerToRoman.convert(28);
        ris_cross = converter.format(28);

        //Assert
        assertEquals("XXVIII",ris);
        assertEquals(ris_cross, ris);
    }

    @Test
    public void testConvert_numberOverBoundaries()
    {
        //Arrange
        String ris;
        //Act
        ris = IntegerToRoman.convert(1150);
        //Assert
        assertEquals("Over limit number!",ris);
    }

    @Test
    public void testConvert_numberUnderBoundaries()
    {
        //Arrange
        String ris;
        //Act
        ris = IntegerToRoman.convert(-10);
        //Assert
        assertEquals("Under limit number!",ris);
    }

    @Test
    public void testConvert_numberZero()
    {
        //Arrange
        String ris;
        //Act
        ris = IntegerToRoman.convert(0);
        //Assert
        assertEquals("Under limit number!",ris);
    }

    @Test
    public void testConvert_returnedCharacter()
    {
        //Arrange
        String[] ris = new String[7];
        //Act
        ris[0] = IntegerToRoman.convert(1);
        ris[1] = IntegerToRoman.convert(1000);
        ris[2] = IntegerToRoman.convert(100);
        ris[3] = IntegerToRoman.convert(500);
        ris[4] = IntegerToRoman.convert(10);
        ris[5] = IntegerToRoman.convert(50);
        ris[6] = IntegerToRoman.convert(5);
        //Assert
        assertEquals("I",ris[0]);
        assertEquals("M",ris[1]);
        assertEquals("C",ris[2]);
        assertEquals("D",ris[3]);
        assertEquals("X",ris[4]);
        assertEquals("L",ris[5]);
        assertEquals("V",ris[6]);
    }

    @Test 
    public void testConvert_numberUnder3()
    {
        //Arrange
        String[] ris = new String[3]; 
        String[] ris_cross = new String[3];
        RomanNumeralFormat converter = new RomanNumeralFormat();

        //Act
        ris[0] = IntegerToRoman.convert(1);
        ris_cross[0] = converter.format(1);
        ris[1] = IntegerToRoman.convert(2);
        ris_cross[1] = converter.format(2);
        ris[2] = IntegerToRoman.convert(3);
        ris_cross[2] = converter.format(3);

        //Assert
        assertEquals("I",ris[0]);
        assertEquals(ris_cross[0], ris[0]);
        assertEquals("II",ris[1]);
        assertEquals(ris_cross[1], ris[1]);
        assertEquals("III",ris[2]);
        assertEquals(ris_cross[2], ris[2]);
    }

    @Test 
    public void testConvert_numberUnder10()
    {
        //Arrange
        String[] ris = new String[3]; 
        String[] ris_cross = new String[3];
        RomanNumeralFormat converter = new RomanNumeralFormat();
        
        //Act
        ris[0] = IntegerToRoman.convert(4);
        ris_cross[0] = converter.format(4);
        ris[1] = IntegerToRoman.convert(7);
        ris_cross[1] = converter.format(7);
        ris[2] = IntegerToRoman.convert(9);
        ris_cross[2] = converter.format(9);

        //Assert
        assertEquals("IV",ris[0]);
        assertEquals(ris_cross[0], ris[0]);
        assertEquals("VII",ris[1]);
        assertEquals(ris_cross[1], ris[1]);
        assertEquals("IX",ris[2]);
        assertEquals(ris_cross[2], ris[2]);
    }

    @Test 
    public void testConvert_numberUnder20()
    {
        //Arrange
        String[] ris = new String[3]; 
        String[] ris_cross = new String[3];
        RomanNumeralFormat converter = new RomanNumeralFormat();
        
        //Act
        ris[0] = IntegerToRoman.convert(13);
        ris_cross[0] = converter.format(13);
        ris[1] = IntegerToRoman.convert(17);
        ris_cross[1] = converter.format(17);
        ris[2] = IntegerToRoman.convert(20);
        ris_cross[2] = converter.format(20);

        //Assert
        assertEquals("XIII",ris[0]);
        assertEquals(ris_cross[0], ris[0]);
        assertEquals("XVII",ris[1]);
        assertEquals(ris_cross[1], ris[1]);
        assertEquals("XX",ris[2]);
        assertEquals(ris_cross[2], ris[2]);
    }

    @Test 
    public void testConvert_numberUnder50()
    {
        //Arrange
        String[] ris = new String[3]; 
        String[] ris_cross = new String[3];
        RomanNumeralFormat converter = new RomanNumeralFormat();
        
        //Act
        ris[0] = IntegerToRoman.convert(27);
        ris_cross[0] = converter.format(27);
        ris[1] = IntegerToRoman.convert(34);
        ris_cross[1] = converter.format(34);
        ris[2] = IntegerToRoman.convert(48);
        ris_cross[2] = converter.format(48);

        //Assert
        assertEquals("XXVII",ris[0]);
        assertEquals(ris_cross[0], ris[0]);
        assertEquals("XXXIV",ris[1]);
        assertEquals(ris_cross[1], ris[1]);
        assertEquals("XLVIII",ris[2]);
        assertEquals(ris_cross[2], ris[2]);
    }

    @Test 
    public void testConvert_numberUnder100()
    {
        //Arrange
        String[] ris = new String[3]; 
        String[] ris_cross = new String[3];
        RomanNumeralFormat converter = new RomanNumeralFormat();
        
        //Act
        ris[0] = IntegerToRoman.convert(69);
        ris_cross[0] = converter.format(69);
        ris[1] = IntegerToRoman.convert(84);
        ris_cross[1] = converter.format(84);
        ris[2] = IntegerToRoman.convert(95);
        ris_cross[2] = converter.format(95);

        //Assert
        assertEquals("LXIX",ris[0]);
        assertEquals(ris_cross[0], ris[0]);
        assertEquals("LXXXIV",ris[1]);
        assertEquals(ris_cross[1], ris[1]);
        assertEquals("XCV",ris[2]);
        assertEquals(ris_cross[2], ris[2]);
    }

    @Test 
    public void testConvert_numberUnder1000()
    {
        //Arrange
        String[] ris = new String[3]; 
        String[] ris_cross = new String[3];
        RomanNumeralFormat converter = new RomanNumeralFormat();
        
        //Act
        ris[0] = IntegerToRoman.convert(248);
        ris_cross[0] = converter.format(248);
        ris[1] = IntegerToRoman.convert(573);
        ris_cross[1] = converter.format(573);
        ris[2] = IntegerToRoman.convert(926);
        ris_cross[2] = converter.format(926);

        //Assert
        assertEquals("CCXLVIII",ris[0]);
        assertEquals(ris_cross[0], ris[0]);
        assertEquals("DLXXIII",ris[1]);
        assertEquals(ris_cross[1], ris[1]);
        assertEquals("CMXXVI",ris[2]);
        assertEquals(ris_cross[2], ris[2]);
    }

    



}