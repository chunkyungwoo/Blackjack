package com.callor.blackjack.service.impl;

import com.callor.blackjack.service.BlackjackService;

public class BlackjackServiceImplV1 implements BlackjackService{
	
	
	

	@Override
	public void card() {
		boolean noSame[] = new boolean[52];
		int playerNum = 0;
		int dealerNum = 0;
		for(int i = 0; i < noSame.length; i++) {
			noSame[i] = false;
		}
		while(playerNum < 52) {
			dealerNum = (int)(Math.random()*52);
			if(noSame[dealerNum] == false) {
				
			}
		}
		
		
	}

	@Override
	public void Dealer() {
		int dealersum = 0;
	}

	@Override
	public void Player() {
		int playersum = 0;
	}

	@Override
	public void Game() {
		
	}

}
