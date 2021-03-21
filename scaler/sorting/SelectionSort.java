public class SelectionSort {
	
	public static void main(String[] args) {
		 int[] a= {96,27,29,61,7,4,9,3,0,76,103};
		 int length = a.length-1;
		 selectionSort(a, length);
	}
	
	static int[] selectionSort(int[] a, int length) {
		int n=a.length;
		while(n>1) {
			int max=a[0];
			int index=0;
			for(int i=0; i<=length; i++) {
				if(a[i]>max) {
					max=a[i];
					index=i;
				}
			}
			
			int temp = a[length];
			a[length]=max;
			a[index]=temp;
			length--;
			n--;
		}
		return a;
	}

}
