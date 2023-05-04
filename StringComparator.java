/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Comparator;

public class StringComparator implements Comparator<String> {
    
    @Override
    public int compare(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return Integer.compare(s1.length(), s2.length());
        } else {
            return s2.compareTo(s1);
        }
    }
}
