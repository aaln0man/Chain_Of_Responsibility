package chainOfResponsibility;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Testing {

	@Test
	void test() {
		Numbers request = new Numbers(4, 2, "add");
		Numbers request1 = new Numbers(5, 3, "multi");
		Numbers request3 = new Numbers(5, 3, "sub");
		
		AddNumbers addNumbers = new AddNumbers();
		MultiplyNumber multiply = new MultiplyNumber();
		Subtract subtract = new Subtract();
		
		addNumbers.setNextChain(multiply);
		multiply.setNextChain(subtract);
		
		assertEquals(6, addNumbers.calculate(request), "4 + 2 = 6");
		assertEquals(15, addNumbers.calculate(request1), "5 * 3 = 15");
		assertEquals(2, addNumbers.calculate(request3), "5 - 3 = 2");
	}
}