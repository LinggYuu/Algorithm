package sort;

public class SelectionSort 
{
	public static void main(String[] args)
		{
			int[] arr= {5,3,6,8,1,7,9,4,2};
			
			for(int i=0;i<arr.length-1;i++)//length-1可以少 一次
			{
				int minpos=i;
				
				for(int j=i+1;j<arr.length;j++) 
				{	//if(arr[j]<arr[minpos])
					//{minpos=j;}
				minpos=arr[j]<arr[minpos]?j:minpos;
				}			//找到最小值的位置
				
				swap(arr,i,minpos);
				System.out.println("经过第"+(i+1)+"次后的内容");
				print(arr);
				System.out.println(" ");
				
			}		
	
		}
	static void print(int[]arr) 
	{
		for(int i=0;i<arr.length;i++) 
		{
			System.out.print(arr[i]+" ");
		}
	}
	static void swap(int arr[],int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;   //交换最小值和第一个的值
	}
}
