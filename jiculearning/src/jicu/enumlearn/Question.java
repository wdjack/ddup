package jicu.enumlearn;

import java.util.Random;

public class Question {

	Random rand = new Random();
	
	Answer ask() {
		int pro = (int)(100*rand.nextDouble());
		if(pro<15) {
			return Answer.MAYBE;
		}
		else if(pro<30) {
			return Answer.NO;
		}
		else if(pro<60) {
			return Answer.YES;
		}
		else  if(pro<75) {
			return Answer.LATER;
		}
		else if(pro<98) {
			return Answer.SOON;
		}
		else {
			return Answer.NEVER;
		}
	}
}
