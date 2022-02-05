package main.algorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class RomanConversion {
    public HashMap createMap(){
        HashMap<String, Integer> romanMap = new HashMap<>();
        romanMap.put("I" , 1);
        romanMap.put("IV",4);
        romanMap.put("V" ,5);
        romanMap.put("IX",9);
        romanMap.put("X" ,10);
        romanMap.put("XL",40);
        romanMap.put("L" ,50);
        romanMap.put("XC",90);
        romanMap.put("C" ,100);
        romanMap.put("CD",400);
        romanMap.put("D" ,500);
        romanMap.put("CM",900);
        romanMap.put("M" ,1000);

        return romanMap;
    }


    public int convert(String letter) {

        int result=0;
        HashMap<String, Integer> map = new HashMap<>();
        map = createMap();
        String str;
        char[] array = letter.toCharArray();
        Stack<Character> stack = new Stack<>();

        for(char c: array){
            if(stack.isEmpty()){
                result += map.get(String.valueOf(c));
                stack.push(c);
            }else{
                char lastElement= stack.peek();
                if(map.containsKey(lastElement+""+c)) {
                    result -= map.get(String.valueOf(lastElement));
                    result += map.get(String.valueOf(lastElement) + String.valueOf(c));
                    stack.push(c);
                }else{
                    result += map.get(String.valueOf(c));
                    stack.push(c);
                }
            }

        }
        return result;
    }
}
