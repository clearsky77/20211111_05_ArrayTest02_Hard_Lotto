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
				
				// 검사 1. 1~45 범위 맞는가? 결과 boolean으로 저장.
				boolean isRangeOk = (1<= inputNum) && (inputNum <= 45);
				
				// 검사 2. 이미 입력한 숫자인가?
				boolean isDuplOK = true;
				
				for(int num : myInputNumbers) {
					// 중복 발견
					if(num == inputNum) {
						isDuplOK = false;
					}
				}
				
				
				// 검사 1과 2가 괜찮으면
				if( isRangeOk && isDuplOK) {
					myInputNumbers[i] = inputNum;
					break;
				}else {
					System.out.println("잘못된 숫자를 입력했습니다. 다시 입력해주세요.");
				}
			}
		}
		
	}

}
