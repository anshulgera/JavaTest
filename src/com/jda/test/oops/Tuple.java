package com.jda.test.oops;

public class Tuple<S1, S2> {
	
	public S1 quantity;
	public S2 timeStamp;
	Tuple(S1 quantity,S2 timeStamp){
		this.quantity = quantity;
		this.timeStamp = timeStamp;
	}

}
