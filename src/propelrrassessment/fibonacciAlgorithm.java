package propelrrassessment;

import java.util.Scanner;

public class fibonacciAlgorithm {

	public static void main(String[] args) {
		//Assuming that the 1-20 input is the number of iterations

		int n1=0,n2=1;
		System.out.print("Input number of iterations: ");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		if(input>0 && input<21) {
			
			for(int i =1;i<=input;++i) {
				System.out.print(n1+", ");
				int n3 = n1+n2;
				n1=n2;
				n2=n3;
			}
		}else {
			System.out.println("Input should be between 1-20");
		}

	}

}
