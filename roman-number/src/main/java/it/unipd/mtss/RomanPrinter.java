////////////////////////////////////////////////////////////////////
// Filippo Venzo 2113705
// Alessandro Rebecchi 2111029
////////////////////////////////////////////////////////////////////
package it.unipd.mtss; 
import java.util.HashMap;  

public class RomanPrinter{ 
    public static String print(int num){ 
        return printAsciiArtSetup(IntegerToRoman.convert(num));
    } 
 
    private static String printAsciiArtSetup(String romanNumber) { 
        if(romanNumber == "Under limit number!"){
            System.out.println(romanNumber);
            return romanNumber;
        }
        else if(romanNumber == "Over limit number!"){
            System.out.println(romanNumber);
            return romanNumber;
        }
            
        HashMap<String, String[]> letters = new HashMap<String, String[]>(); 
        letters.put("I", new String[] {" _____ ", "|_____|", "  | |  ", "  | |  ", " _| |_ ", "|_____|"});
        letters.put("V", new String[] {"__      __", "\\ \\    / /",
                                            " \\ \\  / / ", "  \\ \\/ /  ", "   \\  /   ","    \\/    "});
        letters.put("X", new String[] {"__   __", "\\ \\ / /", " \\ V / ", "  > <  ", " / . \\ ", "/_/ \\_\\"});
        letters.put("L", new String[] {"___     ", "| |     ", "| |     ", "| |     ", "| |____ ", "|______|"});
        letters.put("C", new String[] {"  _____ ", " / ____|", "| |     ", "| |     ", "| |____ "," \\_____|"});
        letters.put("D", new String[] {" _____  ", "|  __  \\", "| |  | |", "| |  | |", "| |__| |", "|_____/ "});
        letters.put("M", new String[] {" __   __", "|  \\/  |", "| \\  / |", "| |\\/| |", "| |  | |", "|_|  |_|"});

        return printAsciiArt(romanNumber, letters);
    } 

    private static String printAsciiArt(String romanNumber, HashMap<String, String[]> letters){
        int RNLength = romanNumber.length(); 
        String ris ="";

        for(int i = 0; i < 6; i++){ 
            for(int j = 0; j < RNLength; j++){ 
                String tmp = letters.get(String.valueOf(romanNumber.charAt(j)))[i];                 
                System.out.print(tmp); 
                System.out.print("  "); 
                ris += tmp + "  ";
            } 
            System.out.print("\n");
            ris += "\n";
        } 
        return ris;
    }
  
 }