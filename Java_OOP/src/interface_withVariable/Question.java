package interface_withVariable;

import java.util.Random;

public class Question implements SharedConstants {
	Random rand = new Random();
	int ask() {
		int prob = (int) (100 * rand.nextDouble());		//rand.nextDouble() : 0.1 -> 1.0
		if (prob < 30)
			return NO;		//30%
		else if (prob < 60)
			return YES;
		else if (prob < 75)	
			return LATER;	//15%
		else if (prob < 98)	
			return SOON;	//13%
		else
			return NEVER;	//2%
	}
}
