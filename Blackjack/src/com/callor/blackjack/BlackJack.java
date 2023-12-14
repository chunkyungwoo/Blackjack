package com.callor.blackjack;

public class BlackJack {
	
	/*
	 * Winner winner chicken dinner - 승자에게
	 * 52개의 카드
	 * 2 ~ 10 숫자 J K Q A
	 * 빨강 ◆  ♥  검정 ♣  ♠
	 */
public static void main(String[] args) {

		// 새로로 출력하는 코드
		for(int dan = 2 ; dan < 10 ; dan++) {
			for(int num = 1 ; num < 10 ; num ++) {
				System.out.printf("%d x %d = %d\n",dan, num, dan * num);
			}
		}
		// 가로로 출력하는 코드
		for(int num = 1 ; num < 10 ; num++) {
			for(int dan = 2 ; dan < 10 ; dan ++) {
				System.out.printf("%d x %d = %d\t",dan, num, dan * num);
			}
			System.out.println();
		}

		
	}

}

