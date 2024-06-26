package by.it.group351001.ohremchuk_d.lesson01;

import java.math.BigInteger;
import java.util.ArrayList;

/*
 * Вам необходимо выполнить способ вычисления чисел Фибоначчи со вспомогательным массивом
 * без ограничений на размер результата (BigInteger)
 */

public class FiboB {

    private long startTime = System.currentTimeMillis();

    public static void main(String[] args) {
        //вычисление чисел простым быстрым методом
        FiboB fibo = new FiboB();
        int n = 55555;
        System.out.printf("fastB(%d)=%d \n\t time=%d \n\n", n, fibo.fastB(n), fibo.time());
    }

    private long time() {
        return System.currentTimeMillis() - startTime;
    }

    BigInteger fastB(Integer n) {
        //здесь нужно реализовать вариант с временем O(n) и памятью O(n)

        BigInteger[] MyArray;
        MyArray = new BigInteger[n + 1];
        Integer i;

        MyArray[0] = BigInteger.ZERO;
        MyArray[1] = BigInteger.ONE;

        for (i = 2; i <= n; i++) {
            MyArray[i] = MyArray[i - 1].add(MyArray[i - 2]);
        }

        return MyArray[n];
    }


}

