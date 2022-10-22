package ua.shpp.stackoverflow;


import java.util.HashMap;
import java.util.Map;

public class OutOfMemoryModel {

    public static void main(String args[]) throws  Exception{
        Map<Long, Long> map = new HashMap<>();
        for (long i =0l; i< Long.MAX_VALUE; i++){
            map.put(i, i);
        }
    }
}
