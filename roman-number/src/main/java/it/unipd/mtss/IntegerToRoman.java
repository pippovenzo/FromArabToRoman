////////////////////////////////////////////////////////////////////
// Filippo Venzo 2113705
// Alessandro Rebecchi 2111029
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number){ 
        if(number <= 0){
            return "Under limit number!";
        }
        else if(number > 1000){
            return "Over limit number!";
        }

        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};  
        String[] romanLetters = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};  
        StringBuilder roman = new StringBuilder();  
        for(int i=0;i<values.length;i++)   
        {  
            while(number >= values[i]){  
                number = number - values[i];  
                roman.append(romanLetters[i]);  
            }  
        }    
        return roman.toString();
    }
}