package main;

import widok.OknoGlowne;

public class Main{
	public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            	OknoGlowne OG = new OknoGlowne();
            }
        });
	}
}
