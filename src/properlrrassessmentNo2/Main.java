package properlrrassessmentNo2;

public class Main {

	public static void main(String[] args) {
		
		int[] arr = {5,2,9,1,7,6};
		MedianLargestValueUtil test = new MedianLargestValueUtil(arr);
		System.out.println("The largest value is: " + test.getLargestVAl());
		System.out.println("The media for the arr is: "+ test.getMedian());
	}

}
