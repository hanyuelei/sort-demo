package com.hyl;

/**
 * 
 * <p>
 * 标题:选择排序
 * </p>
 * <p>
 * 描述: 选择排序
 * </p>
 * 
 * @autho hanyl
 * @time 2019年11月13日 下午4:05:55
 */
public class ChoiceSort {
	/**
	　　①、从待排序序列中，找到关键字最小的元素
　	        ②、如果最小元素不是待排序序列的第一个元素，将其和第一个元素互换
　	       ③、从余下的 N - 1 个元素中，找出关键字最小的元素，重复(1)、(2)步，直到排序结束
	 */
	public static void main(String[] args) {
		int[] array  = {4,7,5,2,1,6,3};
		for(int i=0;i<array.length-1;i++) {
			int min=i;
			 //每轮需要比较的次数
			for(int j=i+1;j<array.length;j++) {
				System.out.println(array[j]+"和"+array[min]+"比较");
				if(array[j]<array[min]) {
					min=j;//记录目前能找到的最小值元素的下标
				}
			}
		      //将找到的最小值和i位置所在的值进行交换
            if(i != min){
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
            //第 i轮排序的结果为
            System.out.print("第"+(i+1)+"轮排序后的结果为:");
            display(array);
		}
	}
	
	
	 //遍历显示数组
    public static void display(int[] array){
        for(int i = 0 ; i < array.length ; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    
}
