package Collections;

import java.util.HashMap;
import java.util.Map;

public class RomanNo {
    public int convertRomanToNumeral(String romanNumral){
        Map<Character, Integer> map= new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int result = map.get(romanNumral.charAt(romanNumral.length()-1));
        for(int i=romanNumral.length()-2;i>=0;i--){
            if(map.get(romanNumral.charAt(i))<(map.get(romanNumral.charAt(i+1)))){
                result-=map.get(romanNumral.charAt(i));
            }
            else{
                result+=map.get(romanNumral.charAt(i));

            }


        }
        return result;

    }

    
    public static void main(String[] args) {
    RomanNo romanNo=new RomanNo();
        int result = romanNo.convertRomanToNumeral("XII");
        System.out.println(result);


    }
}
