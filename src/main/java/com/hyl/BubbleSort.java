package com.hyl;
/**
 * 
 * <p>标题:冒泡排序 </p>
 * <p>描述:冒泡排序 </p>
 * @autho hanyl
 * @time 2019年11月13日 下午2:56:41
 */
public class BubbleSort {
	/**
	 *    ①、比较相邻的元素。如果第一个比第二个大，就交换他们两个。
	　　②、对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。这步做完后，最后的元素会是最大的数（也就是第一波冒泡完成）。
	　　③、针对所有的元素重复以上的步骤，除了最后一个。
	　　④、持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
	 * @autho hanyl
	 * @time 2019年11月13日 下午2:57:15
	 */
	public static void main(String[] args) {
		int[] array  = {1,7,5,2,4,6,3};
		//这里for循环表示总共需要比较多少轮
//		for(int i=1;i<array.length;i++) {
//			//设定一个标记，若为true，则表示此次循环没有进行交换，也就是待排序列已经有序，排序已经完成。
//            boolean flag = true;
//          //这里for循环表示每轮比较参与的元素下标
//           //对当前无序区间array[0......length-i]进行排序
//          //j的范围很关键，这个范围是在逐步缩小的,因为每轮比较都会将最大的放在右边
//            for(int j = 0 ; j < array.length-i ; j++){
//                if(array[j]>array[j+1]){
//                    int temp = array[j];
//                    array[j] = array[j+1];
//                    array[j+1] = temp;
//                    flag = false;
//                }
//            }
//            if(flag){
//                break;
//            }
//            //第 i轮排序的结果为
//            System.out.print("第"+i+"轮排序后的结果为:");
//            display(array);
//		}
		sort(array);
	}
	
	 //遍历显示数组
    public static void display(int[] array){
        for(int i = 0 ; i < array.length ; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    /**
     * 联系
     * @time 2019年11月13日 下午3:08:38
     */
    public static int[]  sort(int[] array) {
    	//设定一共多少轮

    	for(int i=1;i<array.length;i++) {
    		boolean flag=true;
    		for(int j=0;j<array.length-i;j++) {
    			if(array[j]>array[j+1]) {
    				int temp=array[j];
    				array[j]=array[j+1];
    				array[j+1]=temp;
    				flag=false;
    			}
    		}
    		if(flag) {
    			break;
    		}
    	}
    	display(array);
		return array;
    } 
    
}
