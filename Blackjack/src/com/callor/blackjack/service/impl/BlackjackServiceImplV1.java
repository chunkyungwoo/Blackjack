package com.callor.blackjack.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.callor.blackjack.model.CardDto;
import com.callor.blackjack.service.BlackjackService;
import com.callor.blackjack.util.Line;

public class BlackjackServiceImplV1 implements BlackjackService{	
	protected Scanner scan = null;
	protected BlackjackService blService = null;
	List<CardDto> deckList = new ArrayList<CardDto>();
	
	public BlackjackServiceImplV1() {
		scan = new Scanner(System.in);	
	}
	

	@Override
	public void card() {
		// TODO : 카드
		String strSuit = "♠♥♣◆";
		String strDenomination = "A234567890KQJ";
		
		String[] suits = strSuit.split("");
		String[] denos = strDenomination.split("");
		
		
		for(String suit : suits) {
			for(String deno : denos) {			
				CardDto dto = new CardDto();
				dto.suit = suit;
				dto.denomination = deno;
				
				int value = 0;
				try {
					value = Integer.valueOf(deno);
					dto.value = value;
				} catch (Exception e) {
					if(deno.equals("A")) value = 1;
					else value = 10;
					dto.value = value;
				}
				deckList.add(dto);
			}
		}
		Collections.shuffle(deckList);
	}

	@Override
	public void Dealer() {
		// TODO : 딜러		
	}

	@Override
	// 둘다 21이 넘는 카드를 받게되면 무승부
	// Hit or Stay
	// Stay 결정시 각자의 카드를 공개하고 비교해서 승패결정
	// ace 한장과 10의가치가 있는 카드가뽑히면 블랙잭 딜러가 블랙잭이아니면 승리
	// 카드2장을 받았을때 값이 충분하다 생각되면 스테이
	// 21 넘는 값을 받았을떈 버스트 , 버스트되면 패배 종료
	public void Player() {
		// TODO : 플레이어		
	}

	@Override
	public void Game() {
		// TODO : 게임
	
		
	}

}
