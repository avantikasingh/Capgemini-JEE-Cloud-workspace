package comcg.DemoJunit.service;

public class CalculatorServiceImpl implements CalculatorService{

	public Double addNumber(double numOne, double numTwo) {
		// TODO Auto-generated method stub
		return numOne+numTwo;
	}

	public Double subNumber(double numOne, double numTwo) {
		// TODO Auto-generated method stub
		return numOne-numTwo;
	}

	public Double mulNumber(double numOne, double numTwo) {
		// TODO Auto-generated method stub
		return numOne*numTwo;
	}

	public Double divNumber(double numOne, double numTwo) throws ArithmeticException {
		// TODO Auto-generated method stub
		
		if(numTwo==0)
			throw new ArithmeticException();
		return numOne/numTwo;
	}
	
	

}
