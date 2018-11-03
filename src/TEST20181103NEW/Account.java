package TEST20181103NEW;

public abstract class Account {

	private double rate=0.041;
	public abstract double getLiXi();
	
	
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	
	
}
