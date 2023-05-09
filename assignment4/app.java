package assignment4;

import java.util.function.Function;

public class app {

    public static void main(String[] args) {
        Integer sum = reduceL(0, acc -> e -> acc + e, 1, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(sum );
        Integer max = reduceL(0, acc -> e -> acc > e?acc:e, 1, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(max );

        reduceR(0,acc->e->e+acc,1,4,5,6);


    }

    public static <U,T> U reduceR(U seed,Function<T,Function<U,U>> accFunction,T... data){
        if(data==null || data.length==0){
            return seed;
        }
        U result = seed;
        for (int i = data.length - 1; i >= 0; i--) {
            result=accFunction.apply(data[i]).apply(result);
        }
        return result;
    }

    public static <U, T> U reduceL(U seed, Function<U, Function<T, U>> accFunction, T... data) {

        if (data == null || data.length == 0) {
            return seed;
        }
        U accResult = seed;

        for (int i = 0; i < data.length; i++) {
            accResult = accFunction.apply(accResult).apply(data[i]);
        }

        return accResult;
    }

}
