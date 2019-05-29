package sort;

public class InsertionSort {
	public static void main(String[] args) 
	{
		int []a= {9,3,1,4,6,8,7,5,2};
		sort(a);
		print(a);
	}
	
	static void sort(int[] a) 
	{
		for(int i=1;i<a.length;i++) //ѡ�񶯵�λ��
		{
			for(int j=i;j>0 && (a[j]<a[j-1]) ;j--) //�Ӻ���ǰ�Ƚ�
			{
				//if(a[j]<a[j-1]) 
				{
					swap(a,j,j-1);
				}
			}
		}
	}
	
	static void swap(int[]a,int i,int j) //����a[i]��a[j]��ֵ
	{
		int t=a[i];
		a[i]=a[j];
		a[j]= t;
	}
	
	static void print(int[] a) 
	{
		for(int i=0;i<a.length;i++) 
		{
			System.out.print(a[i]+" ");
		}
		
	}
	
}
