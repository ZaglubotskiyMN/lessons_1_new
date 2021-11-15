package my.lambdas;

import java.util.ArrayList;
import java.util.List;

public class IntegerCollectionTranform {
    public List<Integer> transform(List<Integer> data,IntegerTransform transform) {
        List<Integer> result = new ArrayList<>();
        for (int x : data) {
            result.add(transform.doTransform(x));
        }
        return result;


    /*public List<Integer> squares(List<Integer> data){
        List<Integer> result = new ArrayList<>();
        for (int x: data){
            result.add(x*x);
            }
        return  result;
    }*/
    }
}
