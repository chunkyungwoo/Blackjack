package com.callor.blackjack.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.blackjack.model.CardDto;

public class blackjackDeckExA {
	
	public static void main(String[] args) {
		String strSuit = "♠♥♣◆";
		String strDenomination = "A234567890KQJ";
		
		String[] suits = strSuit.split("");
		String[] denos = strDenomination.split("");
		
		List<CardDto> deckList = new ArrayList<CardDto>();
		
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
			for(CardDto dto : deckList) {
				for(String pattern : dto.getPattern()) {
					System.out.println(pattern);
				}
			}
		}			
		
	}

}
