package chainOfResponsibility;

public class AddNumbers implements Chain{
	private Chain nextInChain;
	@Override
	public void setNextChain(Chain nextChain) {
		this.nextInChain = nextChain;
	}

	@Override
	public double calculate(Numbers requests) {
		if(requests.getCalculationWanted() == "add") {
			 double addition = requests.getNumber1() + requests.getNumber2();
			 return addition;
		}
		else
		{
			return nextInChain.calculate(requests);
		}
	}

}