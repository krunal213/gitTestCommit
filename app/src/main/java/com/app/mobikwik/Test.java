package com.app.mobikwik;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {


        ArrayList<List<Integer>> list = new ArrayList<>();
        ArrayList<Integer> one = new ArrayList<>();
        one.add(1);
        one.add(3);
        list.add(one);


        ArrayList<Integer> two = new ArrayList<>();
        two.add(2);
        two.add(6);
        list.add(two);


        ArrayList<Integer> three = new ArrayList<>();
        three.add(8);
        three.add(10);
        list.add(three);


        ArrayList<Integer> four = new ArrayList<>();
        four.add(15);
        four.add(18);
        list.add(four);


        System.out.println(Test.test(list));


    }

    static List<List<Integer>> test(List<List<Integer>> intervals){
        int overlap_value_first_item = 0;
        for(int i=0;i<intervals.size();i++){
            List<Integer> iList = intervals.get(i);
            Integer item  = iList.get(0);
            if(overlap_value_first_item>item){
                int zeroIndexItem = iList.get(0);
                intervals.remove(i);
                ArrayList<Integer> newList = new ArrayList();
                newList.add(zeroIndexItem);
                newList.add(item);
                intervals.add(i,newList);
            }
        }
        return intervals;
    }
}
