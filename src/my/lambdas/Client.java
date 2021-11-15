package my.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Client {


    public static void main(String[] args) {
        // Лямбда стиль c применением стандартных функциональных интерфейсов
        List<Integer> data = new ArrayList<>();
        data.add(1);
        data.add(2);
        data.add(3);
        var ict= new IntegerCollectionTranformWithStandartFunctuonInterface();
        //var result = ict.transform(data, x ->  {
        //    return  x*x*x;
        //});
        var result = ict.transform(data,x -> x*x*x);
        Function<Integer,Integer> lambda = x -> x*x*x*x;
        result = ict.transform(data,lambda);
        for (var x : result) {
            System.out.println(x);
        };

    }

    public static void main4(String[] args) {
        // Не нужно изобретать велосипед, трансформировать, фильтровать и сортировать
        // используем стандартные классы
        List<Integer> data = new ArrayList<>();
        data.add(1);
        data.add(2);
        data.add(3);
        data.add(4);
        data.add(5);
        data.stream()
                .map(x-> x*x)
                .filter(x->x > 10)
                .forEach( x-> {
            System.out.println(x);

        });

    }

    public static void main3(String[] args) {
        // Лямбда стиль без классических циклов
        List<Integer> data = new ArrayList<>();
        data.add(1);
        data.add(2);
        data.add(3);
        IntegerCollectionTranform ict = new IntegerCollectionTranform();
        //var result = ict.transform(data, x ->  {
        //    return  x*x*x;
        //});
        var result = ict.transform(data,x -> x*x*x);
        IntegerTransform lambda = x -> x*x*x*x;
        result = ict.transform(data,lambda);
        result.forEach(x-> {
            System.out.println(x);
        });

    }
    public static void main2(String[] args) {
        // Лямбда стиль
        List<Integer> data = new ArrayList<>();
        data.add(1);
        data.add(2);
        data.add(3);
        IntegerCollectionTranform ict = new IntegerCollectionTranform();
        //var result = ict.transform(data, x ->  {
          //    return  x*x*x;
         //});
        var result = ict.transform(data,x -> x*x*x);
        IntegerTransform lambda = x -> x*x*x*x;
        result = ict.transform(data,lambda);
        for (var x : result) {
            System.out.println(x);
        };

    }
}



    /*public static void main(String[] args) {
        // Стиль анонимных классов. Неплохо но тяжелая "конфорка"
        List<Integer> data = new ArrayList<>();
        data.add(1);
        data.add(2);
        data.add(3);
        IntegerCollectionTranform ict = new IntegerCollectionTranform();
        var result = ict.transform(data, new IntegerTransform() {
            @Override
            public Integer doTransform(Integer x) {
                return x * x*x;
            }
        });
        for (var x : result) {
            System.out.println(x);
        };

    }*/

    /*public static void main(String[] args){
        // правильно но не модно
       // System.out.println("Hello, world!");
        List<Integer> data = new ArrayList<>();
        data.add(1);data.add(2);data.add(3);

        IntegerCollectionTranform ict = new IntegerCollectionTranform();
        var result = ict.squares(data);
        for (var x: result){
            System.out.println(x);
        };
    }*/

