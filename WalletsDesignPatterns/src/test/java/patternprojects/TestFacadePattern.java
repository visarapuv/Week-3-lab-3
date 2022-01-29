package patternprojects;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import FacadePattern.FacadeWallet;


class TestFacadePattern {

	@Test
	void testLEDScreen() {
FacadeWallet wallet = new FacadeWallet();
		
		wallet.WaterProofWallet();
			
		assertEquals(0, wallet.WaterProofWallet());
	}

	@Test
	void testLCDScreen() {
FacadeWallet wallet = new FacadeWallet();
		
		wallet.AluminiumWallet();

		
		assertEquals(0, wallet.AluminiumWallet());
	}
	

	@Test
	void testCRTScreen() {
FacadeWallet wallet = new FacadeWallet();
		
		wallet.BiFoldWallet();
		
		assertEquals(1, wallet.BiFoldWallet());
	}

}
