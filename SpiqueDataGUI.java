//Sam Wang
import java.io.*;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SpiqueDataGUI extends JFrame implements ActionListener{
//LOAD/INITIALIZE.=======================================================================
 	SDGUIPanel gui;
	javax.swing.Timer frameupdater=new javax.swing.Timer(1000/80,this);
	
	javax.swing.Timer testaction=new javax.swing.Timer(500,this);
	
	public SpiqueDataGUI(){
		super("Spique Interactive");
		gui=new SDGUIPanel();
		gui.setPreferredSize(new Dimension(1024,576));
		gui.setLocation(0,0);
		//setIconImage(icon); //Sets the JFrame icon.
		add(gui);
		pack(); //Resizes window so that all panels are at their preferred size.
		setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		frameupdater.start();
		
		testaction.start();
	}
//ACTION PERFORMED.======================================================================
	public void actionPerformed(ActionEvent evt){
		gui.repaint(); //Repaint here as updating is disabled on pause.
		
		Object source=evt.getSource();
		if(source==testaction){
			gui.changeLetter();
		}
	}
	
	public static void main(String[]args){
		SpiqueDataGUI frame=new SpiqueDataGUI();
	}
}