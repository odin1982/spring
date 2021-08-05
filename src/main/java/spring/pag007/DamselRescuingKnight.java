package spring.pag007;
//Tightly coupled to RescueDamselQuest
public class DamselRescuingKnight implements Knight{
	private RescueDamselQuest quest;
	public DamselRescuingKnight() {
		quest = new RescueDamselQuest();
	}
	
	public void embarkOnQuest() throws QuestException{
		quest.embark();
	}

}
