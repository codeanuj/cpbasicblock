public class QuickSort {
	
	public static void main(String[] args) {
		int[] a= {96,27,29,61,7,4,9,3,0,76,103};
		quickSort(a, 0, a.length-1);
	}

	public static void quickSort(int[] a, int start, int end) {

		if(start>=end) return;
		
		int pivotIndex = partition(a, start, end);
	    quickSort(a, start, pivotIndex);
		quickSort(a, pivotIndex+1, end);
		
	}
	static int partition(int[] a, int start, int end) {
		
		int pivot=a[start];
		int pivotIndex=start+1;
		
		for(int i=start+1; i<end; i++) {
			if(a[i]<=pivot) {
				int temp=a[i];
				a[i]=a[pivotIndex];
				a[pivotIndex] = temp;
				pivotIndex++;
			}
		}
		
		int temp = a[start];
		a[start] = a[pivotIndex-1];
		a[pivotIndex-1]=temp;
		return pivotIndex-1;
		
	}
