package my.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class IntegerCollectionTranformWithStandartFunctuonInterface {

    // Не обязательно писать свои собственные интерфейсы
    // Можно использовать готовые
    public List<Integer> transform(List<Integer> data, Function<Integer,Integer> transform) {
        List<Integer> result = new ArrayList<>();
        for (int x : data) {
            result.add(transform.apply(x));
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
