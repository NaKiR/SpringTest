package com.springinaction.springidol;

public class Sonnet29 implements Poem {
	private static String[] LINES = {
			"Kogda ", "v ", "razdore "
	};
	
	public Sonnet29() {
	}
	
	public void recite() {
		for (int i = 0; i < LINES.length; i++) {
			System.out.println(LINES[i]);
		}
	}
}
