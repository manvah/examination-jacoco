package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.ArrayList;

public class ConversorTest {
	Conversor conversor = new Conversor();
	commonTest commonTest = new commonTest();
	ArrayList<String> array1 = new ArrayList<String>();
	
	@Test
	public void testArray(){
		
		array1.add("Your first name is smaller than your last name");
		array1.add("Your last name is smaller than your first name");
		array1.add("The lengths of your first name is your last name are the same");
		
		conversor.setNameConverterArrayValues();
		
		assertTrue(commonTest.testArrays(array1, conversor.getNameConverterArray()));
	}
	/*
	 @Test
	public void testConversor0() {
		Conversor conversor = new Conversor();
		conversor.setNameConverterArrayValues();
		assertEquals(conversor.getNameConverterArray().get(0), "Your first name is smaller than your last name");
	}*/
	
	@Test
	public void setGenderConverterArrayValues(){
	
	array1.add("man!");
	array1.add("woman!");
	array1.add("person!");
	
	conversor.setGenderConverterArrayValues();
	assertTrue(commonTest.testArrays(array1, conversor.getGenderConverterArray()));
	}
	
	@Test
	public void setAgeConverterArrayValues(){
	
	//array1.add("You are young and talented! Things will come your way soon enough!");
	//array1.add("You are experienced and talented! Things will come your way soon enough!");
	
		conversor.setAgeConverterArrayValues();
		assertTrue(commonTest.testArrays(array1, conversor.getAgeConverterArray()));
	
		}
	@Test
	public void setCityConverterArrayValues(){
		array1.add(" A, ");
		array1.add(" B, ");
		array1.add(" C, ");
		array1.add(" D, ");
		array1.add(" E, ");
		array1.add(" F, ");
		array1.add(" G, ");
		array1.add(" H, ");
		array1.add(" I, ");
		array1.add(" J,");
		array1.add(" a letter that comes after J, ");
		
		conversor.setCityConverterArrayValues();
		
		assertTrue(commonTest.testArrays(array1, conversor.getCityConverterArray()));	
		
	}

}
