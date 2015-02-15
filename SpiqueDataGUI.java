//Sam Wang
import java.io.*;

import javax.swing.*;

import java.awt.*;
import java.awt.Image;
import java.awt.event.*;

import com.leapmotion.leap.*;

import java.io.IOException;
import java.lang.Math;
import java.util.ArrayList;

import com.leapmotion.leap.*;
import com.leapmotion.leap.Frame;
import com.leapmotion.leap.Gesture.State;

public class SpiqueDataGUI extends JFrame implements ActionListener{
	
//LOAD/INITIALIZE.=======================================================================
 	SDGUIPanel gui;
 	SampleListener listener;
 	Controller controller;
	Image icon=new ImageIcon("Icon.png").getImage();
	javax.swing.Timer frameupdater=new javax.swing.Timer(1000/80,this);
	
	javax.swing.Timer testaction=new javax.swing.Timer(500,this);
	private String[][] freshData= {{"tmx","tmy","tmz","tpx","tpy","tpz","tix","tiy","tiz","tdx","tdy","tdz"},
    		{"imx","imy","imz","ipx","ipy","ipz","iix","iiy","iiz","idx","idy","idz"},
    		{"mmx","mmy","mmz","mpx","mpy","mpz","mix","miy","miz","mdx","mdy","mdz"},
    		{"rmx","rmy","rmz","rpx","rpy","rpz","rix","riy","riz","rdx","rdy","rdz"},
    		{"pmx","pmy","pmz","ppx","ppy","ppz","pix","piy","piz","pdx","pdy","pdz"}};
	public SpiqueDataGUI(){
		super("Spique Interactive");
		gui=new SDGUIPanel();
		
		gui.setPreferredSize(new Dimension(1024,576));
		gui.setLocation(0,0);
		setIconImage(icon); //Sets the JFrame icon.
		//setIconImage(icon); //Sets the JFrame icon.
		add(gui);
		pack(); //Resizes window so that all panels are at their preferred size.
		setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		frameupdater.start();
		
		testaction.start();
		
		
        // Create a sample listener and controller
        SampleListener listener = new SampleListener();
        Controller controller = new Controller();
        
        

        // Have the sample listener receive events from the controller
        controller.addListener(listener);
        
        try{
        	freshData = listener.getList();
        }
        catch(NullPointerException e){
        }
        // Keep this process running until Enter is pressed
        System.out.println("Press Enter to quit...");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Remove the sample listener when done
        controller.removeListener(listener);
	}
	
	public String[][] getTheData(){
		return freshData;
	}
	
//ACTION PERFORMED.======================================================================
	public void actionPerformed(ActionEvent evt){
        try{
        	freshData = listener.getList();
        }
        catch(NullPointerException e){
        }
		gui.setTheList(freshData);
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