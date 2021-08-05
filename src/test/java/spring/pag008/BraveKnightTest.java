package spring.pag008;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.*;

import org.junit.Test;

import spring.pag007.QuestException;

public class BraveKnightTest {
	@Test
	public void knightShouldEmbarkOnQuest() throws QuestException{
		Quest mockQuest = mock(Quest.class);
		
		BraveKnight knight = new BraveKnight(mockQuest);
		knight.embarkOnQuest();
		
		verify(mockQuest,times(1)).embark();
	}

}
