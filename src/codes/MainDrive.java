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
		System.out.println("-------------------------------");
		
//		당첨번호 랜덤
		int[]  winLottoNumbers = new int[6];
		
		for(int i=0; i<winLottoNumbers.length; i++) {
			while(true) {
				int randomNum = (int)(Math.random()*45+1);
				System.out.println("랜덤 숫자: "+randomNum);
				
				boolean isDuplOk = true;
				
				// 이미 뽑은 번호와 중복인지 확인
				for(int winNum : winLottoNumbers) {
					if(winNum == randomNum) { // 중복이 있었다면
						isDuplOk = false;
					}
				}
				
				// 중복이 있나
				if(isDuplOk) { // 중복이 없으면 for문 탈출
					winLottoNumbers[i] = randomNum;
					break;
				}
				
			}
		}
		
		
		
		
		int correctCount = 0;
		
		for(int myNum : myInputNumbers) {
			for(int winNum : winLottoNumbers) {
				if(myNum == winNum) {
					correctCount++;
				}
			}	
		}
		
		
		
//		보너스 번호
		int bonusNum = 0;

		while (true) {
			int randomNum = (int) (Math.random() * 45 + 1);
			boolean isDuplOk = true;
			
			for ( int winNum  : winLottoNumbers ) {
				if (randomNum == winNum) {
//					중복 발견! -> 중복검사 탈락!
					isDuplOk = false;
				}
			}

//			검사 결과 true -> 보너스번호로 사용해도 됨.
			if (isDuplOk) {
				bonusNum = randomNum;
				break; // 보너스번호 추첨 종료
			}

		}
		
		
		
//		당첨 번호를 오름차순으로 정렬 (Bubble sort)
		
		for(int i=0; i<winLottoNumbers.length; i++) {
			for(int j=0; j<winLottoNumbers.length-1; j++) {
				if(winLottoNumbers[j] > winLottoNumbers[j+1]) {
					int backUp =  winLottoNumbers[j];
					winLottoNumbers[j] = winLottoNumbers[j+1];
					winLottoNumbers[j+1] = backUp;
				}
			}
			
		}
		
		
		
//		당첨 번호, 보너스 번호 출력
		System.out.println("-------------------------------");
		for(int winNum : winLottoNumbers) {
			System.out.println("당첨 번호: "+winNum);
		}
		System.out.println("보너스 번호 :"+bonusNum);
		
		
		
		
		
		System.out.println("-------------------------------");
//		등수 확인
		switch (correctCount) {
		case 6:
			System.out.println("1등!");
			break;
			
		case 5:
			boolean isBonusCreect = false;
			for(int myNum : myInputNumbers) {
				if(bonusNum == myNum) {
					isBonusCreect = true;
				}
			}
			
			if(isBonusCreect) {
				System.out.println("2등!"); //임시로 3등으로 설정
			}else {
				System.out.println("3등!"); //임시로 3등으로 설정
			}
			break;
			
		case 4:
			System.out.println("4등!");
			break;
			
		case 3:
			System.out.println("5등!");
			break;
			
		default:
			System.out.println("낙첨입니다.");
			break;
		}
		
		
	}

}
