package com.hyl;

/**
 * 
 * <p>
 * ����:ѡ������
 * </p>
 * <p>
 * ����: ѡ������
 * </p>
 * 
 * @autho hanyl
 * @time 2019��11��13�� ����4:05:55
 */
public class ChoiceSort {
	/**
	�����١��Ӵ����������У��ҵ��ؼ�����С��Ԫ��
��	        �ڡ������СԪ�ز��Ǵ��������еĵ�һ��Ԫ�أ�����͵�һ��Ԫ�ػ���
��	       �ۡ������µ� N - 1 ��Ԫ���У��ҳ��ؼ�����С��Ԫ�أ��ظ�(1)��(2)����ֱ���������
	 */
	public static void main(String[] args) {
		int[] array  = {4,7,5,2,1,6,3};
		for(int i=0;i<array.length-1;i++) {
			int min=i;
			 //ÿ����Ҫ�ȽϵĴ���
			for(int j=i+1;j<array.length;j++) {
				System.out.println(array[j]+"��"+array[min]+"�Ƚ�");
				if(array[j]<array[min]) {
					min=j;//��¼Ŀǰ���ҵ�����СֵԪ�ص��±�
				}
			}
		      //���ҵ�����Сֵ��iλ�����ڵ�ֵ���н���
            if(i != min){
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
            //�� i������Ľ��Ϊ
            System.out.print("��"+(i+1)+"�������Ľ��Ϊ:");
            display(array);
		}
	}
	
	
	 //������ʾ����
    public static void display(int[] array){
        for(int i = 0 ; i < array.length ; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    
}
