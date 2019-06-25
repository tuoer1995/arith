package com.ly.arith.sort;

/**
 * 插入排序： 左边的数组有序，将需要排序的节点放在左边有序的数组的合适位置
 *
 * @author tuoer
 * @date 2019/6/25 23:30
 */
public class InsertSort<T> extends BaseSort<T> {
    @Override
    public void sort( Comparable[] arrays ) {
        for (int i = 1; i < arrays.length; i++) {
            for (int j = 0; j < i; j++) {
                if ( less ( arrays[i],arrays[j] ) ){
                    each ( arrays,i,j );
                }

            }
        }
    }

    public static void main( String[] args ) {
        Integer[] arrays = {4 , 5 , 3 , 7 , 1 , 2 , 2 , 3 , 3 , 3 , 8};
        InsertSort s = new InsertSort ();
        s.sort ( arrays );
        show ( arrays );
    }
}
