package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.*;

import org.junit.Test;

public class ResultsFromInputsTest {
	ResultFromInputs resultsFromInputs = new ResultFromInputs();
	@Test
	public void testResultForNameLenghtGettersAndSettersMethods(){
		resultsFromInputs.setResultForNameLenght(10);
		assertEquals("The result should be 10", resultsFromInputs.getResultForNameLenght(),10);
	}
	@Test 
	public void testResultForGenderGettersAndSettersMethods(){
		resultsFromInputs.setResultForGender('F');
		assertEquals("The result should be 'F'", resultsFromInputs.getResultForGender(),'F');
	}
	@Test
	public void testAgeGettersAndSettersMethods() {
		resultsFromInputs.setResultForAge(20);
		assertEquals("The result should be 20", resultsFromInputs.getResultForAge(), 20);
	}
	@Test
	public void testGetResultForHomeCityGettersAndSettersMethods(){
		resultsFromInputs.setResultForHomeCity(32);
		assertEquals("The result should be 32", resultsFromInputs.getResultForHomeCity(),32);
	}

}
