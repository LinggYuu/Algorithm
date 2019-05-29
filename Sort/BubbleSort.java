package sort;

public class BubbleSort {
	public static void main(String[] args) 
	{
		int a[]= {9,3,1,4,5,7,8,5,2};
		sort(a);
		print(a);
		
	}
	static void sort(int arr[]) 
	{
		for(int i=arr.length-1;i>0;i--) //设置每次冒泡的终点，一道墙
		{
			for(int j=0;j<i;j++)
			{
				if(arr[j]>arr[j+1]) 
				{
					swap(arr,j,j+1);
				}//一次冒泡执行，最值移动到末尾
			}
		}
	}

	static void swap(int a[],int i,int j)
	{
		int t=a[i];
		a[i]=a[j];
		a[j]=t;
	}
	
	static void print(int a[]) {
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	}
}
