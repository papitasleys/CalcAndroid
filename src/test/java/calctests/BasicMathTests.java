package calctests;

import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.Test;

import usersteps.CalcMainUserSteps;

public class BasicMathTests extends Baseclass {
	Random rand = new Random();
	int firstNumber;
	int secondNumber;
	
	@Test
	public void divideTest() {
		firstNumber = rand.nextInt(99) + 1;
		secondNumber = rand.nextInt(99) + 1;
		float result = (float) firstNumber /secondNumber;
		String expectedResult = String.valueOf(result);
		
		CalcMainUserSteps calcMainUserSteps = new CalcMainUserSteps(driver);
		calcMainUserSteps.divideTwoNumbers(firstNumber, secondNumber);
		
		calcMainUserSteps = new CalcMainUserSteps(driver);
		String actualResult = calcMainUserSteps.readResult().replace(",", "");
		
		Assert.assertEquals(actualResult, expectedResult);
	}
	
	@Test
	public void multiplyTest() {
		firstNumber = rand.nextInt(99);
		secondNumber = rand.nextInt(99);
		String expectedResult = String.valueOf(firstNumber * secondNumber);
		
		CalcMainUserSteps calcMainUserSteps = new CalcMainUserSteps(driver);
		calcMainUserSteps.multiplyTwoNumbers(firstNumber, secondNumber);
		
		calcMainUserSteps = new CalcMainUserSteps(driver);
		String actualResult = calcMainUserSteps.readResult().replace(",", "");
		
		Assert.assertEquals(actualResult, expectedResult);
	}
	
	@Test
	public void sumTest() {
		firstNumber = rand.nextInt(99);
		secondNumber = rand.nextInt(99);
		String expectedResult = String.valueOf(firstNumber + secondNumber);
		
		CalcMainUserSteps calcMainUserSteps = new CalcMainUserSteps(driver);
		calcMainUserSteps.sumTwoNumbers(firstNumber, secondNumber);
		
		calcMainUserSteps = new CalcMainUserSteps(driver);
		String actualResult = calcMainUserSteps.readResult().replace(",", "");
		
		Assert.assertEquals(actualResult, expectedResult);
	}
	
	@Test
	public void substractTest() {
		firstNumber = rand.nextInt(99);
		secondNumber = rand.nextInt(99);
		int result = firstNumber - secondNumber;
		String expectedResult = String.valueOf(result);
		
		CalcMainUserSteps calcMainUserSteps = new CalcMainUserSteps(driver);
		calcMainUserSteps.substractTwoNumbers(firstNumber, secondNumber);
		
		calcMainUserSteps = new CalcMainUserSteps(driver);
		String actualResult = calcMainUserSteps.readResult().replace(",", "");
		if (result < 0) {
			Assert.assertEquals(actualResult.substring(1), expectedResult.substring(1));
		}
		Assert.assertEquals(actualResult, expectedResult);
	}

}
