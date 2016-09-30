/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ctci_1_1_uniquechar;

import java.util.HashSet;

/**
 *
 * @author klsandbox
 */
public class CTCI_1_1_UniqueChar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        args = new String [] {"abcd"};
        if (allCharsAreUniqueNoExtraDataStructures(args[0]))
        {
            System.out.println("All Unique");
        } else {
            System.out.println("Not All Unique");
        }
    }
    
    private static boolean allCharsAreUniqueNoExtraDataStructures(String s) {
        for (int ii = 0; ii < s.length(); ii++) {
            for (int jj = ii + 1; jj < s.length(); jj++) {
                if (s.charAt(ii) == s.charAt(jj))
                {
                    return false;
                }
            }
        }
        
        return true;
    }

    private static boolean allCharsAreUnique(String s) {
        HashSet<Character> set = new HashSet<>();
        for(Character c : s.toCharArray())
        {
            if(set.contains(c))
            {
                return false;
            }
            
            set.add(c);
        }
        
        return true;
    }
    
}
