package com.hyl;

/**
 * 
 * <p>
 * ����: ��������
 * </p>
 * <p>
 * ����: ��������
 * </p>
 * 
 * @autho hanyl
 * @time 2019��11��13�� ����5:25:34
 */
public class InsertSort {
	/**
	 * 
	 * ֱ�Ӳ����������˼����ÿһ����һ��������ļ�¼�����뵽ǰ���Ѿ��ź��������������ȥ��ֱ����������Ԫ��Ϊֹ��
	 * 
	 * @time 2019��11��13�� ����5:26:01
	 */
	public static void main(String[] args) {
		int[] array  = {4,7,5,2,1,6,3};
		int j;
		 //���±�Ϊ1��Ԫ�ؿ�ʼѡ����ʵ�λ�ò��룬��Ϊ�±�Ϊ0��ֻ��һ��Ԫ�أ�Ĭ���������
		for(int i=1;i<array.length;i++) {
			int tmp=array[i];//��¼Ҫ���������
			j=i;
			while (j>0&&tmp<array[j-1]) {//���Ѿ�������������ұߵĿ�ʼ�Ƚϣ��ҵ�����С����
				 	array[j] = array[j-1];//���Ų��
	                j--;
				
			}
		    array[j] = tmp;//���ڱ���С����������
		   
		}
		 display(array);
	}
	
	 //������ʾ����
    public static void display(int[] array){
        for(int i = 0 ; i < array.length ; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}
