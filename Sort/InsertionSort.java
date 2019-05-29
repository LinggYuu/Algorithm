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
		for(int i=1;i<a.length;i++) //选择动的位置
		{
			for(int j=i;j>0 && (a[j]<a[j-1]) ;j--) //从后往前比较
			{
				//if(a[j]<a[j-1]) 
				{
					swap(a,j,j-1);
				}
			}
		}
	}
	
	static void swap(int[]a,int i,int j) //交换a[i]和a[j]的值
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
