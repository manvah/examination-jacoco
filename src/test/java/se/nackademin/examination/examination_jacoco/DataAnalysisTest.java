package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class DataAnalysisTest {
	DataAnalysis dataAnalysis = new DataAnalysis();
	ArrayList<String> values = new ArrayList<String>();

	@Test
	public void testBuildFinalString() {
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "27", "Fortaleza"));
		
		String result = dataAnalysis.buildFinalString(values);
		//assertTrue("'#####################-- ANALYSIS OF THE INPUT DATA --#####################\n' "  ,
			//result.contains("#####################-- ANALYSIS OF THE INPUT DATA --#####################\n" + result));

	}
	@Test
	 public void testGetResultStringNamesAndAge1(){
		values.addAll(Arrays.asList("Game", "Rafae", "Silva", "M", "25", "Fortaleza"));
		 String result= dataAnalysis.getResultStringNamesAndAge(values);
		 assertTrue("The result should contain 'The first name is smaller or equals in size to the last name and the participant is 30 or younger' ",
		 result.contains("The first name is smaller or equals in size to the last name and the participant is 30 or younger"));
		 
	}
	@Test
	 public void testGetResultStringNamesAndAge2(){
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "31", "Fortaleza"));
		 String result= dataAnalysis.getResultStringNamesAndAge(values);
		 assertTrue("The result should contain 'The first name is greater or equals in size to the last name and the participant older than 30' ",
		 result.contains("The first name is greater or equals in size to the last name and the participant older than 30"));
		 
	}
	@Test
	public void testGetResultStringNamesAndAge22(){
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "31", "Fortaleza"));
		String result= dataAnalysis.getResultStringNamesAndAge(values);
		assertTrue("The result should contain 'The first name is greater or equals in size to the last name and the participant older than 30' ",
				result.contains("The first name is greater or equals in size to the last name and the participant older than 30"));
	}
	@Test
	 public void testGetResultStringNamesAndAge3(){
		values.addAll(Arrays.asList("Game", "Rafae", "Silva", "M", "31", "Fortaleza"));
		 String result= dataAnalysis.getResultStringNamesAndAge(values);
		 assertTrue("The result should contain 'No analysis was performed' ",
		 result.contains("No analysis was performed"));
		 
	}
	
	@Test
     public void testGetResulStringHomecityAndAge1() {
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "30", "Fort"));
		String result= dataAnalysis.getResulStringHomecityAndAge(values);
		assertTrue("The result should contain 'The name of the homecity is small and the participant is 30 or older '",
				result.contains("The name of the homecity is small and the participant is 30 or older"));
     }
	@Test
	public void testGetResulStringHomecityAndAge2(){
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "28", "Fort"));
		String result= dataAnalysis.getResulStringHomecityAndAge(values);
		assertTrue("The result should contain 'The name of the homecity is small and the participant is younger than 30'",
				result.contains("The name of the homecity is small and the participant is younger than 30"));
		
	}
	@Test
	public void testGetResulStringHomecityAndAge3(){
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "30", "Fortalezaaa"));
		String result= dataAnalysis.getResulStringHomecityAndAge(values);
		assertTrue("The result should contain 'The name of the homecity is big and the participant is 30 or older'",
				result.contains("The name of the homecity is big and the participant is 30 or older"));
	}
	@Test
	public void testGetResulStringHomecityAndAge4(){
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "27", "Fortalezaaa"));
		String result= dataAnalysis.getResulStringHomecityAndAge(values);
		assertTrue("The result should contain 'The name of the homecity is big and the participant is younger than 30'",
				result.contains("The name of the homecity is big and the participant is younger than 30"));
	}

	
}

