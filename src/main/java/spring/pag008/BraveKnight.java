package spring.pag008;

import spring.pag007.Knight;
import spring.pag007.QuestException;

public class BraveKnight implements Knight{
	private Quest quest;
	
	public BraveKnight(Quest quest) {
		this.quest = quest;
	}
	
	public void embarkOnQuest() throws QuestException{
		quest.embark();
	}

}
