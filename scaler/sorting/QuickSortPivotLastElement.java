public class QuickSortPivotLast {
	
	public static void main(String[] args) {
		int[] a= {96,27,29,61,7,4,9,3,0,76,103};
		quickSort(a, 0, a.length-1);
	}

	static void quickSort(int[] a, int start, int end) {
		if(start>=end) return;
		
		int pivotIndex= partition(a, start, end);
		quickSort(a, start, pivotIndex-1);
		quickSort(a, pivotIndex+1, end);
		
	}
	
	static int partition(int[] a, int start, int end) {
		int pivot = a[end];
		int pivotIndex=start;
		
		for(int i=start; i<end;i++) {
			if(a[i]<=pivot) {
			   int temp =a[i];
			   a[i]=a[pivotIndex];
			   a[pivotIndex] = temp;
			   pivotIndex++;
			}
		}
		
		int temp =a[pivotIndex];
		a[pivotIndex]=pivot;
		a[end]=temp;
		return pivotIndex;
	}
}
