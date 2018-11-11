package chainOfResponsibility;

public class Subtract implements Chain {
	private Chain nextInChain;
	@Override
	public void setNextChain(Chain nextChain) {
		this.nextInChain = nextChain;		
	}

	@Override
	public double calculate(Numbers requests) {
		if(requests.getCalculationWanted() == "sub") {
			 double addition = requests.getNumber1() - requests.getNumber2();
			 return addition;
		}
		else
		{
			return nextInChain.calculate(requests);
		}
	}

}