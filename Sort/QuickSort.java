package sort;

public class QuickSort 
{
	public static void main(String[] args)
	{
		int arr[]= {3,5,7,9,4,1,3,10,2,0,8};
		sort(arr,0,arr.length-1);
		print(arr);
	}
	public static void sort(int arr[],int leftBound,int rightBound)
	{
		if(leftBound >= rightBound) return;
		int mid = partition(arr, leftBound, rightBound);
		sort(arr,leftBound,mid-1);
		sort(arr,mid+1,rightBound);
	}

	static int partition(int arr[], int leftBound,int rightBound)
	{
		int pivot = arr[rightBound];
		int left = leftBound;
		int right = rightBound -1;
		
		while(left<=right)
		{
			while(left <= right && arr[left]<=pivot)
			{left++;}
			while(left <= right && arr[right]>pivot)
			{right--;}
			
			if(left < right) 
			{swap(arr,left,right);}
		}
		
		swap(arr,left,rightBound);
		return left;
	}
	 
	static void swap(int[] arr, int left, int rightBound) 
	{
		int t=arr[left];
		arr[left]=arr[rightBound];
		arr[rightBound]=t;
	}
	
	static void print(int arr[]) 
	{
		for(int i=0;i<arr.length;i++) 
		{
			System.out.print(arr[i]+" ");
		}
	}
		
		
}
	
	

