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
					if(!isRangeOk) { // 범위 검사 탈락한 경우
						System.out.println("1~45의 숫자만 입력 가능합니다.");
					}else {
						System.out.println("이미 입력한 숫자입니다.");
					}
					System.out.println("다시 입력해주세요.");
				}
			}
		}
		
//		6개 숫자 입력 완료됨.
//		당첨번호 임시로 6개 직접 타이핑 (하드코딩) 

		int[]  winLottoNumbers = { 2, 13, 20, 30, 31, 41 };
		
		
	}

}
