package codes;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		int[] myInputNumbers = new int[6];
		
		for(int i=0; i<myInputNumbers.length; i++) {
			
			while(true) {
				System.out.print(i+1+"번째 숫자 입력 : ");
				int inputNum = myScanner.nextInt();
				
				boolean isRangeOk = (1<= inputNum) && (inputNum <= 45);
				
				if( isRangeOk ) {
					myInputNumbers[i] = inputNum;
					break;
				}else {
					System.out.println("잘못된 숫자를 입력했습니다. 다시 입력해주세요.");
				}
			}
		}
		
	}

}
