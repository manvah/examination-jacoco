package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class GameTest {
	Game game = new Game();
	ArrayList<String> array = new ArrayList<String>();
	
	@Test
	public void testRun(){
		array.addAll(Arrays.asList("Game","Rafael", "Silva","M","30","Fortaleza"));
		game.run(array);
	}

	@Test
	public void testCalculateOutPutBasedOnNames1() {
	
		int result = game.calculateOutPutBasedOnNames("Rafael", "Silva");
		assertEquals("The result should be 1", result, 1);
	}
	 @Test
	  public void testCalculateOutPutBasedOnNames2(){
		  
		  int result= game.calculateOutPutBasedOnNames("Rafa", "Silva");
			assertEquals("The result should be 0", result, 0);
	  }
	 @Test
	  public void testCalculateOutPutBasedOnNames3(){
	  
	  int result= game.calculateOutPutBasedOnNames("Rafa", "Silv");
	  assertEquals("The result should be 2", result, 2);
	}
	@Test
	public void testGetGenderFromInputValues(){
		array.addAll(Arrays.asList("Game","Rafael", "Silva","M","30","Fortaleza"));	
		assertEquals("The result should be 'M'",'M', game.getGenderFromInputValues(array));
	}
	@Test
	public void testGetAgeFromInputValues(){
		array.addAll(Arrays.asList("Game","Rafael", "Silva","M","30","Fortaleza"));
		assertEquals("The result should be 30",30, game.getAgeFromInputValues(array));
	}
  @Test
  public void testCalculateOutPutBasedOnGender2(){
	  int result = game.calculateOutPutBasedOnGender('F');
	  assertEquals("The result should be 'F'", result,1);
  }
  @Test
  public void testCalculateOutPutBasedOnGender3(){
	  int result = game.calculateOutPutBasedOnGender('p');
	  assertEquals("The result should be 'p'", result,2);
  }
  @Test
  public void testCalculateOutPutBasedOnAge(){
	  int result= game.calculateOutPutBasedOnAge(25);
	  assertEquals("The result should be 25",result,0);
  }
  @Test
  public void testCalculateOutPutBasedOnHomeCity(){
	  array.addAll(Arrays.asList("amsterdam","beirut","chicago","dublin","eskilstuna","frankfurt","gothenburg","helsinki","istanbul","jerusalem","stockholm"));
	  for(int i=0; i < array.size();i++){
		  int result = game.calculateOutPutBasedOnHomeCity(array.get(i));
		  assertEquals("The result should be berirut",result,i);
	  }
  }
  
  
  
  
}
