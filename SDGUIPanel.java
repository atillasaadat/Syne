import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.*;
import javax.sound.sampled.AudioSystem;
import java.applet.*;

public class SDGUIPanel extends JPanel{
//LOAD/INITIALIZE.=======================================================================
	private Font guifont;

//=======================================================================================
	public SDGUIPanel(){
		super();
		setFocusable(true);
		grabFocus();
		guifont=new Font("arial",Font.PLAIN,24);
		//loadFont("GlennsHand.ttf");
		
	}
	//GETDATA METHODS.=================================================================	
	public void getData()
	
	
	//METHODS.=========================================================================		
/*	public void loadFont(String fontname){ //Loads a custom font to use for the gui.
		String fontpath="SpiqueDataGUIAssets/Font/"+fontname;
		try{
	    	InputStream is=SpiqueDataGUI.class.getResourceAsStream(fontpath);
	    	guifont=Font.createFont(Font.TRUETYPE_FONT,is);
	    	guifont=guifont.deriveFont(24f); //Changes loaded font size.
	    }
	    catch (Exception ex){ //Loads a common system font if the custom font cannot be loaded.
	    	System.err.println("Font was not found in "+fontpath+". Using basic arial font.");
	    	guifont=new Font("arial",Font.PLAIN,24);
	    }
	}*/
	//DRAW METHODS.======================================================================
	public void drawTitle(Graphics g){
		Graphics2D g2d=(Graphics2D)g.create();
		g2d.setFont(guifont);
        g2d.setColor(new Color(255,255,255)); //White colour for data.
        g2d.drawString("Thumb",174,50); //Draws and centers the data.     
        g2d.drawString("Index",348,50); //Draws and centers the data.
        g2d.drawString("Middle",522,50); //Draws and centers the data.
        g2d.drawString("Ring",696,50); //Draws and centers the data.
        g2d.drawString("Pinky",870,50); //Draws and centers the data.
        g2d.drawString("Meta.",20,150); //Draws and centers the data.
        g2d.drawString("Prox.",20,250); //Draws and centers the data.
        g2d.drawString("Inter.",20,350); //Draws and centers the data.
        g2d.drawString("Dist.",20,450); //Draws and centers the data.
        //---------------
        for(int i=144;i<900;i=i+174){
        	g2d.drawLine(i,0,i,576);
        }
        for(int i=100;i<576;i=i+100){
        	g2d.drawLine(0,i,1024,i);
        }
		g2d.dispose();
	}
	
	public void drawData(Graphics g){ //Draws the data on the screen.
		Graphics2D g2d=(Graphics2D)g.create();
	}
//Paint Component.=======================================================================
	public void paintComponent(Graphics g){
	 	g.setColor(Color.orange);
	 	g.fillRect(0,0,1024,768);
	 	drawTitle(g);
	}
}