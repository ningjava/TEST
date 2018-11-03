package TEST20181103NEW;

public class ACCOUNT2 extends Account{

	double money;
	
	public ACCOUNT2(double money) {
		this.money=money;
	}
	
	public double getLiXi() {
		return money*super.getRate();
	}

}
