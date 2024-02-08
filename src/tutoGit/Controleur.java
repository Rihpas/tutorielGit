package tutoGit;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Controleur implements ActionListener {

	Modele refModl;
	
	public Controleur(Modele m) {
		this.refModl = m;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		refModl.incremente();
	}

	
}