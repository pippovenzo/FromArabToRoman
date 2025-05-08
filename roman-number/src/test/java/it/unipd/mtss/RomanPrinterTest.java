
package it.unipd.mtss;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.junit.Test;

public class RomanPrinterTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testNumberUnderLimit(){
        try (MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {
            
            utilities.when(()->IntegerToRoman.convert(-2)).thenReturn("Under limit number!");
        
            assertEquals("Under limit number!", RomanPrinter.print(-2));
        }
    }

    @Test 
    public void testNumberOverLimit(){
        try (MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {
            
            utilities.when(()->IntegerToRoman.convert(1001)).thenReturn("Over limit number!");
        
            assertEquals("Over limit number!", RomanPrinter.print(1001));
        }
    }

    @Test
    public void testNumberUnder3(){
        try (MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {
            
            utilities.when(()->IntegerToRoman.convert(3)).thenReturn("III");


            String result = 
                        " _____    _____    _____   \n" + 
                        "|_____|  |_____|  |_____|  \n" + 
                        "  | |      | |      | |    \n" + 
                        "  | |      | |      | |    \n" +
                        " _| |_    _| |_    _| |_   \n" +  
                        "|_____|  |_____|  |_____|  \n";

            assertEquals(result, RomanPrinter.print(3));
        }
    }


    @Test
    public void testNumberUnder6(){
        try (MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {
            
            utilities.when(()->IntegerToRoman.convert(5)).thenReturn("V");


            String result = "__      __  \n" +  
                            "\\ \\    / /  \n" + 
                            " \\ \\  / /   \n" + 
                            "  \\ \\/ /    \n" +
                            "   \\  /     \n" +
                            "    \\/      \n";

            assertEquals(result, RomanPrinter.print(5));
        }
    }

    @Test
    public void testNumberUnder10(){
        try (MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {
            
            utilities.when(()->IntegerToRoman.convert(7)).thenReturn("VII");


            String result = "__      __   _____    _____   \n" +
                     "\\ \\    / /  |_____|  |_____|  \n" + 
                     " \\ \\  / /     | |      | |    \n" +
                     "  \\ \\/ /      | |      | |    \n" +
                     "   \\  /      _| |_    _| |_   \n" + 
                     "    \\/      |_____|  |_____|  \n";

            assertEquals(result, RomanPrinter.print(7));
        }
    }

    @Test
    public void testNumberUnder20(){
        try (MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {
            
            utilities.when(()->IntegerToRoman.convert(16)).thenReturn("XVI");


            String result = "__   __  __      __   _____   \n"  +
                     "\\ \\ / /  \\ \\    / /  |_____|  \n" +  
                     " \\ V /    \\ \\  / /     | |    \n" + 
                     "  > <      \\ \\/ /      | |    \n" + 
                     " / . \\      \\  /      _| |_   \n" +
                     "/_/ \\_\\      \\/      |_____|  \n";

            assertEquals(result, RomanPrinter.print(16));
        }
    }

    @Test
    public void testNumberUnder50(){
        try (MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {
            
            utilities.when(()->IntegerToRoman.convert(42)).thenReturn("XLII");


            String result = "__   __  ___        _____    _____   \n" + 
                     "\\ \\ / /  | |       |_____|  |_____|  \n" + 
                     " \\ V /   | |         | |      | |    \n" +
                     "  > <    | |         | |      | |    \n" +
                     " / . \\   | |____    _| |_    _| |_   \n" +  
                     "/_/ \\_\\  |______|  |_____|  |_____|  \n";

            assertEquals(result, RomanPrinter.print(42));
        }
    }

    @Test
    public void testNumberUnder100(){
        try (MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {
            
            utilities.when(()->IntegerToRoman.convert(67)).thenReturn("LXVII");


            String result = 
                        "___       __   __  __      __   _____    _____   \n" +  
                        "| |       \\ \\ / /  \\ \\    / /  |_____|  |_____|  \n" + 
                        "| |        \\ V /    \\ \\  / /     | |      | |    \n" +
                        "| |         > <      \\ \\/ /      | |      | |    \n" + 
                        "| |____    / . \\      \\  /      _| |_    _| |_   \n" +   
                        "|______|  /_/ \\_\\      \\/      |_____|  |_____|  \n";

            assertEquals(result, RomanPrinter.print(67));
        }
    }


    @Test
    public void testNumberUnder500(){
        try (MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {
            
            utilities.when(()->IntegerToRoman.convert(426)).thenReturn("CDXXVI");


            String result = 
                        "  _____    _____    __   __  __   __  __      __   _____   \n" +
                        " / ____|  |  __  \\  \\ \\ / /  \\ \\ / /  \\ \\    / /  |_____|  \n" + 
                        "| |       | |  | |   \\ V /    \\ V /    \\ \\  / /     | |    \n" +
                        "| |       | |  | |    > <      > <      \\ \\/ /      | |    \n" + 
                        "| |____   | |__| |   / . \\    / . \\      \\  /      _| |_   \n" +   
                        " \\_____|  |_____/   /_/ \\_\\  /_/ \\_\\      \\/      |_____|  \n";

            assertEquals(result, RomanPrinter.print(426));
        }
    }

    @Test
    public void testNumberUnder1000(){
        try (MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {
            
            utilities.when(()->IntegerToRoman.convert(990)).thenReturn("CMXC");


            String result = 
                        "  _____    __   __  __   __    _____   \n" +
                        " / ____|  |  \\/  |  \\ \\ / /   / ____|  \n" + 
                        "| |       | \\  / |   \\ V /   | |       \n" +
                        "| |       | |\\/| |    > <    | |       \n" + 
                        "| |____   | |  | |   / . \\   | |____   \n" +   
                        " \\_____|  |_|  |_|  /_/ \\_\\   \\_____|  \n";

            assertEquals(result, RomanPrinter.print(990));
        }
    }

}