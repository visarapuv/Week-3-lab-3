package FacadePattern;

public class FacadeWallet {
	private Wallet waterproof;
	private Wallet bifold;
	private Wallet aluminium;
	
	public FacadeWallet() {
		waterproof = new WaterProof();
		bifold = new BiFold();
		aluminium = new Aluminium();
	}
	
	public int WaterProofWallet() {
		return waterproof.display();
	}
	public int BiFoldWallet() {
		return bifold.display();
	}
	public int AluminiumWallet() {
		return aluminium.display();
	}
	
}
