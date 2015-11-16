package org.abhi.app;

public class FTP extends Http {

	protected void use() {
		get();
		post();
	}
	
	public static Http giveOthers() {
		Http h = new Http();
		return h;
	}
}
