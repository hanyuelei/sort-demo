package com.hyl;

/**
 * 
 * <p>
 * 标题: 插入排序
 * </p>
 * <p>
 * 描述: 插入排序
 * </p>
 * 
 * @autho hanyl
 * @time 2019年11月13日 下午5:25:34
 */
public class InsertSort {
	/**
	 * 
	 * 直接插入排序基本思想是每一步将一个待排序的记录，插入到前面已经排好序的有序序列中去，直到插完所有元素为止。
	 * 
	 * @time 2019年11月13日 下午5:26:01
	 */
	public static void main(String[] args) {
		int[] array  = {4,7,5,2,1,6,3};
		int j;
		 //从下标为1的元素开始选择合适的位置插入，因为下标为0的只有一个元素，默认是有序的
		for(int i=1;i<array.length;i++) {
			int tmp=array[i];//记录要插入的数据
			j=i;
			while (j>0&&tmp<array[j-1]) {//从已经排序的序列最右边的开始比较，找到比其小的数
				 	array[j] = array[j-1];//向后挪动
	                j--;
				
			}
		    array[j] = tmp;//存在比其小的数，插入
		   
		}
		 display(array);
	}
	
	 //遍历显示数组
    public static void display(int[] array){
        for(int i = 0 ; i < array.length ; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}
