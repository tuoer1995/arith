package com.ly.arith.sort;

import org.springframework.util.Assert;

/**
 *
 *
 * @author tuoer
 * @date 2019/6/24 23:39
 */
public abstract class BaseSort<T> {
    public abstract void sort(Comparable[] arrays);

    /**
     * less
     * @param a
     * @param b
     * @return
     */
    public static boolean less(Comparable a , Comparable b) {
        return a.compareTo(b) < 0;
    }

    /**
     * 交换
     * @param arrays
     * @param i
     * @param j
     */
    public static void each(Comparable[] arrays,int i,int j) {
        Comparable temp = arrays[i];
        arrays[j] =  arrays[i];
        arrays[i] = temp;
    }

    public static void show(Comparable[] arrays) {
       Assert.notEmpty(arrays,"数组不能为空");
        for (Comparable c :arrays) {
            System.out.println(c.toString());
        }
    }

    public static boolean isSort(Comparable[] arrays) {
        Assert.notEmpty(arrays,"数组不能为空");
        for (int i = 0; i <arrays.length - 1 ; i++) {
            if(less(arrays[i+1],arrays[i])){
                return false;
            }
        }
        return  true;
    }
}
