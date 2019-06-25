package com.ly.arith.sort;

import org.springframework.util.Assert;

/**
 * description:选择排序的思想：查询出未数组中最小的节点，并和未排序数组的首位交换位置
 *
 * @author: tuoer
 * @date： 2019/6/25
 */
public class SelectedSort<T> extends BaseSort<T> {
    @Override
    public void sort(Comparable[] arrays) {
        Assert.notEmpty(arrays,"数组不能为空");
        for (int i = 0; i < arrays.length-1; i++) {
            for (int j = i+1; j < arrays.length; j++) {
                if(less(arrays[j],arrays[i])) {
                    each(arrays,i,j);
                }
            }

        }

    }

    public static void main(String[] args) {
        Integer[] arrays = {4,5,3,8};

        SelectedSort s = new SelectedSort();
        s.sort(arrays);

        show(arrays);
    }
}
