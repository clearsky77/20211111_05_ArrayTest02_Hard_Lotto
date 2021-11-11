package codes;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		int[] myInputNumbers = new int[6];
		
		for(int i=0; i<myInputNumbers.length; i++) {
			System.out.print(i+1+"번째 숫자 입력 : ");
			int inputNum = myScanner.nextInt();
			myInputNumbers[i] = inputNum;
			
		}
		
	}

}
