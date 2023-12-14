package com.callor.blackjack.service.impl;

import com.callor.blackjack.util.Line;

public class BlackjackServiceImplV2 extends BlackjackServiceImplV1{
	public BlackjackServiceImplV2() {
		
	}
	// 한장은 보여주고 한장은 보여주지않음
		// 플레이어가 Hit , Stay 결정시 딜러와 카드비교하고
		// 16이하면 한장뽑음 17 이상이면 자동스테이
		// 플레이어가 스테이할때까지 한장씩준다
		// 단 ace 와 6의 조합으로 17이 되는경우에는 
		// ace가 1 또는 11 이기때문에 딜러는 추가로 히트로 진행할수있다
	@Override
	public void Dealer() {
		Integer cardSet = 0;
		Line.dLine(50);
		System.out.println("블랙잭 게임 시작");
		Line.dLine(50);
		while(true) {
			this.card();
			System.out.print("딜러가 카드를 받습니다");
			String str = scan.nextLine();
			System.out.println("Hit or STAY");
			if(str.equals("HiT")) {
				
			}
			
		}
		
	}
	public void Player() {
		// 카드를 한장 뽑을수있게끔 명령어를 생성해야함
	}

}
