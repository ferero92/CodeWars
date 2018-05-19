package kyu8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TwoToOne {

    public static void main(String[] args) {
        System.out.println("Hello world");
    }
    
    public static String longest (String s1, String s2) {
        List<Character> list = new ArrayList<>();
        
        list = containsList(list, s1);
        list = containsList(list, s2);
        
        Collections.sort(list);
        
        s1 = toString(list);
        
        return s1;
    }
    
    private static List<Character> containsList(List<Character> list, String string) {
    	
    	for (int i = 0; i < string.length(); i++) {
    		if (!list.contains(string.charAt(i)))
    			list.add(string.charAt(i));
    	}
    	
    	return list;
    }
    
    private static String toString(List<Character> list) {
    	String result = new String();
    	
    	for (Character c : list) {
    		result += c;
    	}
    	
    	return result;
    }

}
