package project;
//선택정렬,버블정렬<삽입정렬<셸정렬<퀵정렬<힙정렬,병합정렬 순으로 빠름
public class Sort {
	static void Swap(int[] arr, int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	static void heapify(int[] arr,int n,int i) {
		int p = i;
		int l = i*2+1;
		int r = i*2+2;
		
		if(l<n&&arr[p]<arr[l]) p=l;
		if(r<n&&arr[p]<arr[r]) p=r;
		
		if(!(i==p)) {
			Swap(arr,i,p);
			heapify(arr,n,p);
		}
	}
	public void HeapSort(int[] arr) {
		int n = arr.length;
		
		for(int i=n/2-1;i>=0;i--) {
			heapify(arr,n,i);
		}
		for(int i=n-1;i>0;i--) {
			Swap(arr,i,0);
			heapify(arr,i,0);
		}
	}
	//힙정렬 nlog2(n)
	public void InsertionSort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			for(int j=i-1;j>=0;j--) {
				if(arr[j]>arr[j+1]) {
					Swap(arr,j,j+1);
				}else 
					break;
			}
		}
	}
	//삽입정렬 n^2
	public void CountingSort(int[] arr) {
		
		
		
	}
	//카운트정렬 n
}
