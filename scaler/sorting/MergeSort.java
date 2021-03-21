public class MergeSort {
	public static void main(String[] args) {
		int[] a= {96,27,29,61,7,4,9,3,0,76,103};
		 int start=0;
		 int end = a.length-1;
		 mergeSort(a, start,end);
		
	}

	static void mergeSort(int[] a, int start, int end){
		
		if(start>=end) return;
		int mid =(start+end)/2;
		mergeSort(a,start, mid);
		mergeSort(a, mid+1, end);
		merge(a, start, mid, end);
		
	}
	
	static int[] merge(int[] a, int start, int mid, int end) {
		int i=0;
		int k=start;
		int j=0;
		
		int[] l=new int[mid-start+1];
		int[] r=new int[end-mid];
		
		for(int p=0;p<l.length;p++) {
			l[p]=a[start+p];
		}
		for(int q=0;q<r.length;q++) {
			r[q]=a[mid+1+q];
		}
		while(i<l.length && j<r.length) {
			if(l[i]<r[j]) {
				a[k]=l[i];
				i++;
			}else {
				a[k] =r[j];
				j++;
			}
			k++;
		}
		
		while(i<l.length) {
			a[k]=l[i];
			k++;
			i++;
		}
		while(j<r.length) {
			a[k]=r[j];
			k++;
			j++;
		}
 		return a;
	} 
}
