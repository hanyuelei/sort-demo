package com.hyl;
/**
 * 
 * <p>����:ð������ </p>
 * <p>����:ð������ </p>
 * @autho hanyl
 * @time 2019��11��13�� ����2:56:41
 */
public class BubbleSort {
	/**
	 *    �١��Ƚ����ڵ�Ԫ�ء������һ���ȵڶ����󣬾ͽ�������������
	�����ڡ���ÿһ������Ԫ����ͬ���Ĺ������ӿ�ʼ��һ�Ե���β�����һ�ԡ��ⲽ���������Ԫ�ػ�����������Ҳ���ǵ�һ��ð����ɣ���
	�����ۡ�������е�Ԫ���ظ����ϵĲ��裬�������һ����
	�����ܡ�����ÿ�ζ�Խ��Խ�ٵ�Ԫ���ظ�����Ĳ��裬ֱ��û���κ�һ��������Ҫ�Ƚϡ�
	 * @autho hanyl
	 * @time 2019��11��13�� ����2:57:15
	 */
	public static void main(String[] args) {
		int[] array  = {1,7,5,2,4,6,3};
		//����forѭ����ʾ�ܹ���Ҫ�Ƚ϶�����
//		for(int i=1;i<array.length;i++) {
//			//�趨һ����ǣ���Ϊtrue�����ʾ�˴�ѭ��û�н��н�����Ҳ���Ǵ��������Ѿ����������Ѿ���ɡ�
//            boolean flag = true;
//          //����forѭ����ʾÿ�ֱȽϲ����Ԫ���±�
//           //�Ե�ǰ��������array[0......length-i]��������
//          //j�ķ�Χ�ܹؼ��������Χ��������С��,��Ϊÿ�ֱȽ϶��Ὣ���ķ����ұ�
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
//            //�� i������Ľ��Ϊ
//            System.out.print("��"+i+"�������Ľ��Ϊ:");
//            display(array);
//		}
		sort(array);
	}
	
	 //������ʾ����
    public static void display(int[] array){
        for(int i = 0 ; i < array.length ; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    /**
     * ��ϵ
     * @time 2019��11��13�� ����3:08:38
     */
    public static int[]  sort(int[] array) {
    	//�趨һ��������

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
