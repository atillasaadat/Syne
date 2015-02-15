//Sam Wang
import java.io.*;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.*;

import javax.sound.sampled.AudioSystem;

import java.applet.*;

public class SDGUIPanel extends JPanel implements KeyListener{
//LOAD/INITIALIZE.=======================================================================
	private Font guifont;
	private Font guifontcalibri;
	private String selectedletter;
	private int selectednumber;

	private int prevnumber=-1;
	
	private Image[] signlist={
			new ImageIcon("SpiqueDataGUIAssets/Image/A.png").getImage(),
			new ImageIcon("SpiqueDataGUIAssets/Image/B.png").getImage(),
			new ImageIcon("SpiqueDataGUIAssets/Image/C.png").getImage(),
			new ImageIcon("SpiqueDataGUIAssets/Image/D.png").getImage(),
			new ImageIcon("SpiqueDataGUIAssets/Image/E.png").getImage(),
			new ImageIcon("SpiqueDataGUIAssets/Image/F.png").getImage(),	
			new ImageIcon("SpiqueDataGUIAssets/Image/G.png").getImage(),
			new ImageIcon("SpiqueDataGUIAssets/Image/H.png").getImage(),	
			new ImageIcon("SpiqueDataGUIAssets/Image/I.png").getImage(),
			new ImageIcon("SpiqueDataGUIAssets/Image/J.png").getImage(),	
			new ImageIcon("SpiqueDataGUIAssets/Image/K.png").getImage(),
			new ImageIcon("SpiqueDataGUIAssets/Image/L.png").getImage(),	
			new ImageIcon("SpiqueDataGUIAssets/Image/M.png").getImage(),
			new ImageIcon("SpiqueDataGUIAssets/Image/N.png").getImage(),	
			new ImageIcon("SpiqueDataGUIAssets/Image/O.png").getImage(),
			new ImageIcon("SpiqueDataGUIAssets/Image/P.png").getImage(),
			new ImageIcon("SpiqueDataGUIAssets/Image/Q.png").getImage(),	
			new ImageIcon("SpiqueDataGUIAssets/Image/R.png").getImage(),
			new ImageIcon("SpiqueDataGUIAssets/Image/S.png").getImage(),	
			new ImageIcon("SpiqueDataGUIAssets/Image/T.png").getImage(),
			new ImageIcon("SpiqueDataGUIAssets/Image/U.png").getImage(),	
			new ImageIcon("SpiqueDataGUIAssets/Image/V.png").getImage(),
			new ImageIcon("SpiqueDataGUIAssets/Image/W.png").getImage(),
			new ImageIcon("SpiqueDataGUIAssets/Image/X.png").getImage(),	
			new ImageIcon("SpiqueDataGUIAssets/Image/Y.png").getImage(),
			new ImageIcon("SpiqueDataGUIAssets/Image/Z.png").getImage()};

	private Image bg = new ImageIcon("Image Construct/BG.png").getImage();

	private String[][] datatest={{"tmx","tmy","tmz","tpx","tpy","tpz","tix","tiy","tiz","tdx","tdy","tdz"},
    		{"imx","imy","imz","ipx","ipy","ipz","iix","iiy","iiz","idx","idy","idz"},
    		{"mmx","mmy","mmz","mpx","mpy","mpz","mix","miy","miz","mdx","mdy","mdz"},
    		{"rmx","rmy","rmz","rpx","rpy","rpz","rix","riy","riz","rdx","rdy","rdz"},
    		{"pmx","pmy","pmz","ppx","ppy","ppz","pix","piy","piz","pdx","pdy","pdz"}};
	private String[] alphabet={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
//=======================================================================================
	public SDGUIPanel(){
		super();
		setFocusable(true);
		grabFocus();
		addKeyListener(this);
		loadFont("GlennsHand.ttf");
		guifontcalibri=new Font("calibri",Font.PLAIN,18);
		Random die=new Random();
		selectednumber=die.nextInt(26);
		selectedletter=alphabet[selectednumber];
		//System.out.println(selectedletter);
	}
	
	public void keyReleased(KeyEvent evt){
		int keycode=evt.getKeyCode();
		switch(keycode){
			case KeyEvent.VK_SPACE:
				
				//Call the save position code.
			break;
		}
	}
	//GETDATA METHODS.=================================================================	
	//public void getData()
	
	
	//METHODS.=========================================================================
	public void changeLetter(){
		Random die=new Random();
		while (selectednumber==prevnumber){
			selectednumber=die.nextInt(26);
		}
		prevnumber=0+selectednumber;
		selectedletter=alphabet[selectednumber];
	}
	
	public void loadFont(String fontname){ //Loads a custom font to use for the gui.
		String fontpath="SpiqueDataGUIAssets/Font/"+fontname;
		try{
	    	InputStream is=SpiqueDataGUI.class.getResourceAsStream(fontpath);
	    	guifont=Font.createFont(Font.TRUETYPE_FONT,is);
	    	guifont=guifont.deriveFont(172f); //Changes loaded font size.
	    }
	    catch (Exception ex){ //Loads a common system font if the custom font cannot be loaded.
	    	System.err.println("Font was not found in "+fontpath+". Using basic arial font.");
	    	guifont=new Font("arial",Font.PLAIN,24);
	    }
	}
	//DRAW METHODS.======================================================================
	public void drawLetter(Graphics g,String select){
		
		
		Graphics2D g2d=(Graphics2D)g.create();
		g2d.setFont(guifont);
		g2d.setColor(new Color(56,200,53));
		
        int stringwidth=(int)g2d.getFontMetrics().getStringBounds(select,g2d).getWidth();
        int stringheight=(int)g2d.getFontMetrics().getStringBounds(select,g2d).getHeight();
        
        g2d.setColor(new Color(3,5,6)); //For shadow.
        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER,0.5f));
        
        //g2d.drawString(select,(512-stringwidth/2)+5,205); //Score shadow, for aesthetics.
        g2d.drawString(select,105,288-(stringheight/2)+5);
        
        g2d.setColor(new Color(255,255,255));
        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER,1.0f));
        
        //g2d.drawString(select,512-stringwidth/2,200);
        g2d.drawString(select,100,288-(stringheight/2));
        
        AffineTransform at=new AffineTransform();
		at.translate(512-signlist[selectednumber].getWidth(null)/2,288-signlist[selectednumber].getHeight(null)/2);
        g2d.drawImage(signlist[selectednumber],at,this);
        
        
        g2d.dispose();
	}
	
	public void drawTitle(Graphics g){
		Graphics2D g2d=(Graphics2D)g.create();
		g2d.setFont(guifontcalibri);
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
//=======================================================================================
	public void setTheList(String[][] test){
		datatest=test;
	}
	
	
	public String getLetter(){
		return selectedletter;
	}
	
//Paint Component.=======================================================================
	public void paintComponent(Graphics g){
		g.setColor(Color.white);
	 	//g.setColor(new Color(42,132,153));
	 	g.fillRect(0,0,1024,576);
	 	//drawLetter(g,selectedletter);
	 	drawTitle(g);
	 	drawData(g,datatest);
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}