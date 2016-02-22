package OtherAlgorithms;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by admin on 2016-02-22.
 */
public class Intersection {
    //O(array.length + array2.length)
    Integer[] array = {2,3,4,5,6,7,8,9,10};
    Integer[] array2 = {2,5,6,8,9,11,222,13,55,99};
    HashMap<Integer, Boolean> map;

    public Intersection() {
        map = new HashMap<Integer,Boolean>();
    }

    public ArrayList<Integer> getIntersection() {

        ArrayList<Integer> intersectionList = new ArrayList<Integer>();
        for(int i = 0; i < array.length; i++) {
            map.put(array[i], true);
        }
        for(int i = 0; i < array2.length; i++) {
            try {
                if(map.get(array2[i])) {
                    intersectionList.add(array2[i]);
                }
            } catch(NullPointerException e) {
                //Do nothing
            }
        }
        return intersectionList;
    }

    public static void main(String[] args) {
        //A test with non-disjoint sets
        Intersection algo = new Intersection();
        System.out.println(algo.getIntersection().toString());
    }
}
