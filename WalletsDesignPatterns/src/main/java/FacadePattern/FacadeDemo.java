package FacadePattern;

public class FacadeDemo {

	public static void main(String[] args) {
		FacadeWallet wallet = new FacadeWallet();
		
		wallet.WaterProofWallet();
		wallet.AluminiumWallet();
		wallet.BiFoldWallet();

	}

}
