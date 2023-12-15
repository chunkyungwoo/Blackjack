package com.callor.blackjack;

import com.callor.blackjack.service.BlackjackService;
import com.callor.blackjack.service.impl.BlackjackServiceImplV2;

public class BlackjackStart {
	
	public static void main(String[] args) {
		
		BlackjackService blService = new BlackjackServiceImplV2();
		
		blService.Dealer();
	}

}
