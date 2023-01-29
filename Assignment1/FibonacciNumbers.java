package BUcs673.HW1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FibonacciNumbers {
    public static void main(String[] args) {
        List<BigInteger> fibonacciList = generateList();
        for (int i=0;i<fibonacciList.size();i++){
            System.out.println(fibonacciList.get(i));
        }
    }
    public static List<BigInteger> generateList(){
        List<BigInteger> res = new ArrayList<>();
        res.add(BigInteger.valueOf(1));
        res.add(BigInteger.valueOf(1));
        for(int i=2;i<100;i++){
            res.add(res.get(i-1).add(res.get(i-2)));
        }
        return res;
    }
}
