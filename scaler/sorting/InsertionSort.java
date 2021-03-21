public class InsertionSort {
	
	public static void main(String[] args) {
		int[] a= {96,27,29,61,7,4,9,3,0,76,103};
		solve(a);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

	static int[] solve(int[] a) {
		
		for(int i=0; i<a.length; i++) {
			int key = a[i];
			
			int j=i-1;
			while(j>=0) {
				//find the right position for key , if number is a[j] is greater than key means key should 
				//be in place a[j] and a[j] should be in place of key
				if(a[j]>key) {
					int temp =a[j];
					a[j]=key;
					a[j+1]=temp;
				}
				j--;
			}
		}
		return a;
	}
}
