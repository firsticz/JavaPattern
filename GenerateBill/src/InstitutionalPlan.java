
public class InstitutionalPlan extends Plan{
	public void getRate() {
		super.rate = 5.5;
	}
	public void calculateBill(int units) {
		System.out.println(super.rate*units);
	}
}
