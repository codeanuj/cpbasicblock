public class BubbleSort {
	
	public static void main(String[] args) {
		int[] a= {96,27,29,61,7,4,9,3,0,76,103};
		bubbleSort(a);
	}
  static int[] bubbleSort(int[] a) {
	  
	  for(int i=0; i<a.length; i++) {
		  for(int j=i+1; j<a.length; j++) {
			  if(a[i]>a[j]) {
				  int temp=a[i];
				  a[i]=a[j];
				  a[j]=temp;
			  }
		  }
	  }
	  
	  return a;
  }
