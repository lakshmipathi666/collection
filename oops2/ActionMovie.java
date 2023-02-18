package oops2;

public class ActionMovie extends Movie {

	public String getFightSequence(int fightSequence){
		if(fightSequence>=1&&fightSequence<4) {
			return "low action movie";
		}
		else if(fightSequence>=4&fightSequence<7) {
			return "average action movie";
		}
		else if(fightSequence>=7) {
			return "high  action loaded movie";
		}
		else{
			return "its not an action movie";
		}
	}
	
}
		


