package properlrrassessmentNo2;

import java.util.Arrays;

public class MedianLargestValueUtil {
	
	private double median;
	private int largestVAl;
	
	public MedianLargestValueUtil(int[] arr) {
		for(int i=0; i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp = arr[i];
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		System.out.println("Sorted arr: "+ Arrays.toString(arr));
		if(arr.length % 2 == 0) {
			this.median = ((double)arr[(arr.length/2)-1] + (double)arr[(arr.length/2)])/2;
		}else {
			this.median = arr[arr.length/2];
		}
		this.largestVAl = arr[arr.length-1];
	}

	public double getMedian() {
		return median;
	}

	public int getLargestVAl() {
		return largestVAl;
	}

	
	
}
