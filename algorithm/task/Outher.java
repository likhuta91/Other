package algorithm.task;

import algorithm.task.Outher.Inner;

public class Outher {
	class Inner{
		
	}
	
}

class Subclass extends Outher.Inner{

	public Subclass(Outher outher) {
		outher.super();
	}
	
}