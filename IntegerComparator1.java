
import java.util.Comparator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author natemoe
 */
public class IntegerComparator1 implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 % 2 == 0 && o2 % 2 != 0) { 
            return -1;
        } else if (o1 % 2 != 0 && o2 % 2 == 0) { 
            return 1;
        } else { // 
            return o1.compareTo(o2);
        }
    }
}
