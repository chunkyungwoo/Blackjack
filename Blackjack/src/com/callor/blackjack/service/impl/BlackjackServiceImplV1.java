package com.callor.blackjack.service.impl;

import com.callor.blackjack.service.BlackjackService;

public class BlackjackServiceImplV1 implements BlackjackService{
	
	
	

	@Override
	public void card() {
		
		boolean noSame[] = new boolean[52];
		int cardSet[] = new int[52];
		int playerNum = 0;
		int dealerNum = 0;
		for(int i = 0; i < noSame.length; i++) {
			noSame[i] = false;
		}
		while(playerNum < 52) {
			dealerNum = (int)(Math.random()*52);
			if(noSame[dealerNum] == false) {
				noSame[dealerNum] = true;
				cardSet[playerNum] = dealerNum + 1;
				playerNum++;
			}
		}		
	}

	@Override
	// 한장은 보여주고 한장은 보여주지않음
	// 플레이어가 Hit , Stay 결정시 딜러와 카드비교하고
	// 16이하면 한장뽑음
	public void Dealer() {
		int dealersum = 0;
	}

	@Override
	// Hit or Stay
	//Stay 결정시 각자의 카드를 공개하고 비교해서 승패결정
	public void Player() {
		int playersum = 0;
	}

	@Override
	public void Game() {
		
		System.out.println("Black Jack Game");
		
		while(true) {
		}
		
	}

}
