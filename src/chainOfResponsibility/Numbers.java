package chainOfResponsibility;

public class Numbers {
	private int number1,number2;
	private String calculationWanted;
	
	public Numbers(int number1, int number2, String calculationWanted) {
		super();
		this.number1 = number1;
		this.number2 = number2;
		this.calculationWanted = calculationWanted;
	}

	public int getNumber2() {
		return number2;
	}


	public int getNumber1() {
		return number1;
	}

	public String getCalculationWanted() {
		return calculationWanted;
	}
	
}