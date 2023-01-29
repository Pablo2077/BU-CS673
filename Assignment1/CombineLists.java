package BUcs673.HW1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombineLists {
    public static void main(String[] args) {
        List<Character> list1 = Arrays.asList('a','b','c');
        List<Character> list2 = Arrays.asList('1','2','3');
        List<Character> combineList = combine(list1,list2);
        for(int i=0;i<combineList.size();i++){
            System.out.print(combineList.get(i));
        }
    }
    public static List<Character> combine(List<Character> list1, List<Character> list2){
        List<Character> res = new ArrayList<>();
        int index1 = 0, index2 = 0;
        while (index1<list1.size()&&index2<list2.size()) {
            res.add(list1.get(index1++));
            res.add(list2.get(index2++));
        }
        while(index1<list1.size()){
            res.add(list1.get(index1++));
        }
        while(index2<list2.size()){
            res.add(list2.get(index2++));
        }
        return res;
    }
}
