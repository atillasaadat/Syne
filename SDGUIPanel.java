//Sam Wang
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
	private Font guifontcalibri;
	private char selected;
	private String[][] datatest={{"tmx","tmy","tmz","tpx","tpy","tpz","tix","tiy","tiz","tdx","tdy","tdz"},
    		{"imx","imy","imz","ipx","ipy","ipz","iix","iiy","iiz","idx","idy","idz"},
    		{"mmx","mmy","mmz","mpx","mpy","mpz","mix","miy","miz","mdx","mdy","mdz"},
    		{"rmx","rmy","rmz","rpx","rpy","rpz","rix","riy","riz","rdx","rdy","rdz"},
    		{"pmx","pmy","pmz","ppx","ppy","ppz","pix","piy","piz","pdx","pdy","pdz"}};

//=======================================================================================
	public SDGUIPanel(){
		super();
		setFocusable(true);
		grabFocus();
		loadFont("GlennsHand.ttf");
		guifontcalibri=new Font("calibri",Font.PLAIN,24);
		
		Random die=new Random();
		selectedletter=(char)(die.nextInt(26) + "A");
	}
	//GETDATA METHODS.=================================================================	
	//public void getData()
	
	
	//METHODS.=========================================================================		
	public void loadFont(String fontname){ //Loads a custom font to use for the gui.
		String fontpath="SpiqueDataGUIAssets/Font/"+fontname;
		try{
	    	InputStream is=SpiqueDataGUI.class.getResourceAsStream(fontpath);
	    	guifont=Font.createFont(Font.TRUETYPE_FONT,is);
	    	guifont=guifont.deriveFont(144f); //Changes loaded font size.
	    }
	    catch (Exception ex){ //Loads a common system font if the custom font cannot be loaded.
	    	System.err.println("Font was not found in "+fontpath+". Using basic arial font.");
	    	guifont=new Font("arial",Font.PLAIN,24);
	    }
	}
	//DRAW METHODS.======================================================================
	public void drawLetter(Graphics g,char selectedletter){
		Graphics2D g2d=(Graphics2D)g.create();
		g2d.setFont(guifont);
		g2d.setColor(255,255,255);
		String drawme=selectedletter;
        g2d.drawString(drawme,174,50);
        g2d.dispose();
	}
	
	public void drawTitle(Graphics g){
		Graphics2D g2d=(Graphics2D)g.create();
		g2d.setFont(guifont);
        g2d.setColor(new Color(0,176,34));
        g2d.drawString("Thumb",174,50);
        g2d.drawString("Index",348,50);
        g2d.drawString("Middle",522,50);
        g2d.drawString("Ring",696,50);
        g2d.drawString("Pinky",870,50);
        g2d.drawString("Meta.",20,150);
        g2d.drawString("Prox.",20,250);
        g2d.drawString("Inter.",20,350);
        g2d.drawString("Dist.",20,450);
        //---------------
        for(int i=144;i<900;i=i+174){
        	g2d.drawLine(i,0,i,576);
        }
        for(int i=100;i<576;i=i+100){
        	g2d.drawLine(0,i,1024,i);
        }
		g2d.dispose();
	}
	
	public void drawData(Graphics g, String[][] test){ //Draws the data on the screen.
		Graphics2D g2d=(Graphics2D)g.create();
		g2d.setFont(guifontcalibri);
        g2d.setColor(new Color(0,0,0));
        
        
        //ArrayList[][] test=new ArrayList[5][12];
        int hand=0;
        int handpos=0;
        
        /*String[][] test={{"tmx","tmy","tmz","tpx","tpy","tpz","tix","tiy","tiz","tdx","tdy","tdz"},
        		{"imx","imy","imz","ipx","ipy","ipz","iix","iiy","iiz","idx","idy","idz"},
        		{"mmx","mmy","mmz","mpx","mpy","mpz","mix","miy","miz","mdx","mdy","mdz"},
        		{"rmx","rmy","rmz","rpx","rpy","rpz","rix","riy","riz","rdx","rdy","rdz"},
        		{"pmx","pmy","pmz","ppx","ppy","ppz","pix","piy","piz","pdx","pdy","pdz"}};*/
        
        for(int stx=174;stx<1024;stx=stx+174){
        	for(int sty=130;sty<520;sty=sty+100){
                g2d.drawString("X = "+test[hand][handpos],stx,sty);
                handpos+=1;
                g2d.drawString("Y = "+test[hand][handpos],stx,sty+30);
                handpos+=1;
                g2d.drawString("Z = "+test[hand][handpos],stx,sty+60);
                handpos+=1;
        	}
        	handpos=0;
        	hand+=1;
        }
		g2d.dispose();
	}
//Paint Component.=======================================================================
	public void paintComponent(Graphics g){
	 	g.setColor(Color.white);
	 	g.fillRect(0,0,1024,768);
	 	drawLetter(g,selectedletter);
	 	//drawTitle(g);
	 	//drawData(g,datatest);
	}
}