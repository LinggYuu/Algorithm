package sort;

//knuth序列
//h=1
//h=3*h+1
public class ShellSort {
	
	public static void main(String[] args) 
	{
		int arr[]= {9,6,11,3,5,12,8,7,10,15,14,4,1,13,2};
		
		sort(arr);
		
		print(arr);
	}
	
	public static void sort(int a[]) 
	{
		int h=1;
		while(h<= a.length/3)
		{
			h=h*3+1;
		}	
		
		for(int gap=h;gap>0;gap= (gap-1)/3 ) 
		{
		
			for(int i=gap;i<a.length;i++) //设一个点
			{	
				for(int j=i;j>gap-1;j-=gap) 
				{	 
					if(a[j]<a[j-gap]) 
					{
						swap(a,j,j-gap);
					}
				}
			}
		}
	}
	
	
	static void swap(int a[],int i,int j) 
	{
		int t=a[i];
		a[i]=a[j];
		a[j]=t;
	}
	static void print(int a[]) 
	{
		for(int i=0;i<a.length;i++) 
		{
			System.out.print(a[i]+" ");
			
		}
		
	}
	
	
}
