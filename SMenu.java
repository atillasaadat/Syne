//Yasin can fly.

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.awt.geom.*;

public class SMenu extends JPanel implements MouseMotionListener, MouseListener{
	private Image background=new ImageIcon("Assets/Backgrounds/MorningStage.png").getImage(); //Loads images associated with main menu
	private Image loadPage=new ImageIcon("Assets/Backgrounds/Load.png").getImage();
	private Image soundOnPic=new ImageIcon("Assets/Icons/SoundOn.png").getImage();
	private Image soundOnHoverPic=new ImageIcon("Assets/Icons/SoundOnHover.png").getImage();
	private Image soundOffPic=new ImageIcon("Assets/Icons/SoundOff.png").getImage();
	private Image soundOffHoverPic=new ImageIcon("Assets/Icons/SoundOffHover.png").getImage();
	private Image helpPic=new ImageIcon("Assets/Icons/Help.png").getImage();
	private Image helpHoverPic=new ImageIcon("Assets/Icons/HelpHover.png").getImage();
	private Image playPic=new ImageIcon("Assets/Icons/Play.png").getImage();
	private Image playHoverPic=new ImageIcon("Assets/Icons/PlayHover.png").getImage();
	private Image custPic=new ImageIcon("Assets/Icons/Customize.png").getImage();
	private Image custHoverPic=new ImageIcon("Assets/Icons/CustomizeHover.png").getImage();
	private Image titlePic=new ImageIcon("Assets/Icons/Title.png").getImage();
	private Image missileL=new ImageIcon("Assets/Characters/MissileL.png").getImage();
	private Image missileR=new ImageIcon("Assets/Characters/MissileR.png").getImage();
	private Image catL=new ImageIcon("Assets/Characters/1.png").getImage();
	private Image catR=new ImageIcon("Assets/Characters/1.0.png").getImage();
	private Image bigCat=new ImageIcon("Assets/Icons/BigCat.png").getImage();
	private Image starPic=new ImageIcon("Assets/Powerups/Star64.png").getImage();

	private Image cat1=new ImageIcon("Assets/Characters/1.png").getImage(); //Loads images associated with char selection
	private Image cat2=new ImageIcon("Assets/Characters/2.png").getImage();
	private Image cat3=new ImageIcon("Assets/Characters/3.png").getImage();
	private Image cat4=new ImageIcon("Assets/Characters/4.png").getImage();
	private Image cat5=new ImageIcon("Assets/Characters/5.png").getImage();
	private Image cat6=new ImageIcon("Assets/Characters/6.png").getImage();
	private Image cat7=new ImageIcon("Assets/Characters/7.png").getImage();
	private Image cat8=new ImageIcon("Assets/Characters/8.png").getImage();
	private Image catLock2=new ImageIcon("Assets/Characters/2Lock.png").getImage();
	private Image catLock3=new ImageIcon("Assets/Characters/3Lock.png").getImage();
	private Image catLock4=new ImageIcon("Assets/Characters/4Lock.png").getImage();
	private Image catLock5=new ImageIcon("Assets/Characters/5Lock.png").getImage();
	private Image catLock6=new ImageIcon("Assets/Characters/6Lock.png").getImage();
	private Image catLock7=new ImageIcon("Assets/Characters/7Lock.png").getImage();
	private Image catLock8=new ImageIcon("Assets/Characters/8Lock.png").getImage();
	private Image charBox=new ImageIcon("Assets/Border/SelectionBox.png").getImage();
	private Image num0=new ImageIcon("Assets/Numbers/0.png").getImage();
	private Image num1=new ImageIcon("Assets/Numbers/1.png").getImage();
	private Image num2=new ImageIcon("Assets/Numbers/2.png").getImage();
	private Image num3=new ImageIcon("Assets/Numbers/3.png").getImage();
	private Image num4=new ImageIcon("Assets/Numbers/4.png").getImage();
	private Image num5=new ImageIcon("Assets/Numbers/5.png").getImage();
	private Image num6=new ImageIcon("Assets/Numbers/6.png").getImage();
	private Image num7=new ImageIcon("Assets/Numbers/7.png").getImage();
	private Image num8=new ImageIcon("Assets/Numbers/8.png").getImage();
	private Image num9=new ImageIcon("Assets/Numbers/9.png").getImage();
	private Image cost100=new ImageIcon("Assets/Numbers/100.png").getImage();
	private Image cost200=new ImageIcon("Assets/Numbers/200.png").getImage();
	private Image cost400=new ImageIcon("Assets/Numbers/400.png").getImage();
	private Image cost600=new ImageIcon("Assets/Numbers/600.png").getImage();
	private Image cost800=new ImageIcon("Assets/Numbers/800.png").getImage();
	private Image cost1000=new ImageIcon("Assets/Numbers/1000.png").getImage();
	private Image cost1400=new ImageIcon("Assets/Numbers/1400.png").getImage();
	private Image selectPic=new ImageIcon("Assets/Icons/CatSelected.png").getImage();
	private Image lock=new ImageIcon("Assets/Icons/Lock.png").getImage();
	private Image backPic=new ImageIcon("Assets/Icons/Back.png").getImage();
	private Image backHoverPic=new ImageIcon("Assets/Icons/BackHover.png").getImage();

	private Image how1=new ImageIcon("Assets/Border/HOW1.png").getImage(); //Loads images associated with help screens
	private Image how2=new ImageIcon("Assets/Border/HOW2.png").getImage();
	private Image how3=new ImageIcon("Assets/Border/HOW3.png").getImage();
	private Image how4=new ImageIcon("Assets/Border/HOW4.png").getImage();
	private Image how5=new ImageIcon("Assets/Border/HOW5.png").getImage();
	private Image rightPic=new ImageIcon("Assets/Icons/Right.png").getImage();
	private Image leftPic=new ImageIcon("Assets/Icons/Left.png").getImage();
	private Image rightHoverPic=new ImageIcon("Assets/Icons/RightHover.png").getImage();
	private Image leftHoverPic=new ImageIcon("Assets/Icons/LeftHover.png").getImage();

	private Image stageSelectPic=new ImageIcon("Assets/Icons/StageSelect.png").getImage();//Loads images associated with stage selection screen
	private Image morningPic=new ImageIcon("Assets/Icons/Morning.png").getImage();
	private Image afternoonPic=new ImageIcon("Assets/Icons/Afternoon.png").getImage();
	private Image eveningPic=new ImageIcon("Assets/Icons/Evening.png").getImage();
	private Image lockedAfternoonPic=new ImageIcon("Assets/Icons/AfternoonLocked.png").getImage();
	private Image lockedEveningPic=new ImageIcon("Assets/Icons/EveningLocked.png").getImage();
	private Image morningHoverPic=new ImageIcon("Assets/Icons/MorningHover.png").getImage();
	private Image afternoonHoverPic=new ImageIcon("Assets/Icons/AfternoonHover.png").getImage();
	private Image eveningHoverPic=new ImageIcon("Assets/Icons/EveningHover.png").getImage();

	//lists of stage selection pic rects, hover pics, and their respective points
	private Image[] stageHoverPics = new Image[] {morningHoverPic,afternoonHoverPic,eveningHoverPic};
	private Image[] stagePics = new Image[] {morningPic, afternoonPic, eveningPic};
	private Image[] lockedStagePics = new Image[] {morningPic, lockedAfternoonPic, lockedEveningPic};
	private Image[] stageLineup = new Image[3];
	private Rectangle[] stageRects = new Rectangle[] {new Rectangle(344, 180, 336, morningPic.getHeight(this)), new Rectangle(294, 330, 437, afternoonPic.getHeight(this)), new Rectangle(355, 480, 315, eveningPic.getHeight(this))};
	private String[] stages = new String[] {"Morning", "Afternoon", "Evening"};

	//lists of help/info pic rects, hover pics, and their respective points
	private Image[] howPage = new Image[] {how1, how2, how3, how4, how5}; //diff screens of help/how to play
	private int pageNum = 0; //which screen is being displayed on the screen
	private Rectangle rightRect = new Rectangle (890, 670, rightPic.getWidth(this), rightPic.getHeight(this)); //arrows to move through pages
	private Rectangle leftRect = new Rectangle (20, 670, leftPic.getWidth(this), leftPic.getHeight(this));

	//lists of char select pic rects, hover pics, and their respective points
	private Image[] charPics = new Image[] {cat1, cat2, cat3, cat4, cat5, cat6, cat7, cat8};
	private Image[] lockedCharPics = new Image[] {cat1, catLock2, catLock3, catLock4, catLock5, catLock6, catLock7, catLock8};
	private Image[] catLineup = new Image[8];
	private int[] charpicxPoints = new int[8];
	private int[] charpicyPoints = new int[8];
	private Rectangle[] charPicRecs = new Rectangle[8];
	private Image[]scoreNumPics = new Image[] {num0, num1, num2, num3, num4, num5, num6, num7, num8, num9};
	private Image[]costPics = new Image[] {cost100, cost100, cost200, cost400, cost600, cost800, cost1000, cost1400};
	private Rectangle backRect = new Rectangle(800,20, backPic.getWidth(this), backPic.getHeight(this));

	//lists of menu pic rects, hover pics, and their respective points
	private Image[] hoverPics = new Image[] {soundOnHoverPic, helpHoverPic, playHoverPic, custHoverPic};
	private Image[] menuPics = new Image[] {soundOnPic, helpPic, playPic, custPic};
	private int[] picxPoints = new int[] {907,25,423-41,311};
	private int[] picyPoints = new int[] {546-25,554-25,466-11,596};
	private Rectangle[] menuPicRecs = new Rectangle[] {new Rectangle (907,546-25,soundOnPic.getWidth(this), soundOnPic.getHeight(this)-9), new Rectangle (25,554-25, helpPic.getWidth(this), helpPic.getHeight(this)), new Rectangle (423,488, playPic.getWidth(this)-81, playPic.getHeight(this)-65), new Rectangle (311,596, custPic.getWidth(this), custPic.getHeight(this))};

	private Rectangle mousePoint = new Rectangle (0,0,1,1); //a rect where the mouse pointer is (place values put in so does not show up as null and crashing if mouse is not on game screen when starting up)
	private boolean selection; //indicates whether character selection is selecteed
	private boolean help; //indicates whether help screen is selecteed
	private boolean stageSelect; //indicates whether stage selection screen is selecteed
	boolean menu = true; //on menu screen to start off

	private boolean soundOn = true; //flag indicating whether the sound is enabled or not
	private boolean startPhase = true; //flag indicating whether the menu was just opened so icons can come in
	private int loading = 0; //counter to help determine the delay time for the transition from loading screen to menu
	private int spd = 20; //changes speed and movement for icons
	private int hoverBounce = 1; //affects whether the big cat is going up/down
	private int x = 0; //variable that is increased/decreased with spd, ultimately this affects the icon movement

	private int charChosen = 1; //which cat character is chosen
	private String stageChosen = "Morning"; //stage chosen
	private int charHover = 0; //number in which the cat picture moves up/down
	private int charHoverBounce = 1; //affects whether the big cat is going up/down
	String starNum;
	private int[] scoreWidth; //amount of space between the numbers in the score
	private boolean[] unlockStatus = new boolean[8]; //indicates which cats are unlocked
	private boolean[] unlockStageStatus = new boolean[3]; //indicates which stages are unlocked
	private int[] costPrice = new int[] {0, 100, 200, 400, 600, 800 ,1000, 1400};


	private Cursor normalCursor = new Cursor(Cursor.DEFAULT_CURSOR); //normal cursor used for eveyrthing
	private Cursor loadingCursor = new Cursor(Cursor.WAIT_CURSOR); //curser used while loading

    SpiqueDataGUI centralPoint;

    public  SMenu(SpiqueDataGUI central){
    	super();
		setFocusable(true);
		grabFocus();

		addMouseMotionListener(this);
		addMouseListener(this);

		centralPoint = central;
//
//		unlockUpdate(); //checks from txt file which cats are unlocked and locked
//		unlockStageUpdate(); //checks from txt file which stages are unlocked and locked

//		scoreWidth = new int[starNum.length()];
//		scoreWidth[0]=0;
//		scoreWidthUpdate(); //gets the width between each number image so it's spaced out evenly

//		for (int i=0; i<8; i++){
//			if (i<4){
//				charpicxPoints[i] = 150+i*200; //points of cats when in selection screen
//				charpicyPoints[i] = 345;
//			}
//			else{
//				charpicxPoints[i] = 150+i*200-4*200;
//				charpicyPoints[i] = 545;
//			}
//			charPicRecs[i] = new Rectangle(charpicxPoints[i], charpicyPoints[i], catLineup[i].getWidth(this), catLineup[i].getHeight(this)); //the rects of each cat
//		}
	}
	//-------------------------------------------------------------------- RESTART
	public void restartMenu(){ //when returning back to the menu all variables concerning the startup of the menu are reset
		menu = true;
		startPhase = true;
		x = 0;
		spd = 20;
		hoverBounce = 1;
		loading = 100;
	}
	//-------------------------------------------------------------------- RETURN
//	public String returnStage(){ //returns character chosen
//		return stageChosen;
//	}
//	//--------------------------------------------------------------------
//	public int returnChar(){ //returns character chosen
//		return charChosen;
//	}
//	//--------------------------------------------------------------------
//	public int returnSp(){ //Returns number of starpoints.
//		return Integer.parseInt(starNum);
//	}
//	//--------------------------------------------------------------------
//	public boolean returnSoundStatus(){ //returns if sound is enabled or not
//		return soundOn;
//	}
//	//--------------------------------------------------------------------
//	public Image[] returnSnp(){ //returns the pictures of each number to be used in the game
//		return scoreNumPics;
//	}
//	//--------------------------------------------------------------------
//	public int[] returnSw(){ //returns the width of each of the numbers used in the current star score
//		return scoreWidth;
//	}
	//-------------------------------------------------------------------- MAIN MENU ANIMATION
	public void moveIcons(){ //x value is increased/decreased by spd which then affects the coordinates of the icons making it display that they are moving
		x+=spd;
	}
	//--------------------------------------------------------------------
	public void chaseScene(Graphics g){ //scales the missile images making it seem like they are flying and chasing cat
		Graphics2D g2d=(Graphics2D) g;
		AffineTransform mL=new AffineTransform();
		AffineTransform cL=new AffineTransform();
		AffineTransform mR=new AffineTransform();
		AffineTransform cR=new AffineTransform();
		mL.scale(1+spd*.01,1+spd*.01); //scales to decrease in size as the spd decreases
		cL.scale(1+spd*.01,1+spd*.01); //scales to decrease in size as the spd decreases
		mL.scale(-1,-1); //Negatively scales the image by the x coordinate to flip it and start from the opposite side and increases in size
		cL.scale(-1,-1); //Negatively scales the image by the x coordinate to flip it and start from the opposite side and increases in size
		mR.scale(1+spd*.01,1+spd*.01); //scales to decrease in size as the spd decreases
		cR.scale(1+spd*.01,1+spd*.01); //scales to decrease in size as the spd decreases
 		mL.translate(423+50,466-33-25); //states the intended starting points of the missiles
 		mR.translate(423+50,466-33-25);
 		cL.translate(850,370); //states the intended starting points of the missiles
 		cR.translate(320,300);
		mR.rotate(Math.toRadians(320),256,128); //rotates the missile/cat so it looks like it's facing where it's flying to
		mL.rotate(Math.toRadians(114),256,128);
		cL.rotate(Math.toRadians(114),128,128);
		cR.rotate(Math.toRadians(320),128,128);
		g2d.drawImage(missileL,mL,this);
		g2d.drawImage(catL,cL,this);
		g2d.drawImage(missileR,mR,this);
		g2d.drawImage(catR,cR,this);
	}
	//-------------------------------------------------------------------- UPDATES & REWRITES
//	public void scoreWidthUpdate(){ //updates the width of the numbers when the numbers change (after cat purchase)
//		scoreWidth=new int[starNum.length()];
//		for (int i=1;i<starNum.length();i++){
//			scoreWidth[i] = scoreNumPics[Integer.parseInt(starNum.substring(i-1,i))].getWidth(this) + scoreWidth[i-1] - 5;
//		}
//	}
	//--------------------------------------------------------------------
//	public void unlockUpdate(){ //checks which cat characters are unlocked in customization and which are not
//		Scanner infile=null;
//		try{
//			infile=new Scanner(new BufferedReader(new FileReader("Assets/Info/UnlockedStatus.txt")));
//		}
//		catch(IOException ex){
//			System.out.println("The UnlockedStatus.txt file was not found.");
//		}
//		for (int i=0; i<unlockStatus.length; i++){
//			if (infile.nextLine().equals("LOCKED")){
//				catLineup[i] = lockedCharPics[i]; //a greyed out cat pic will be displayed signifying that it is locked
//				unlockStatus[i] = false;
//			}
//			else{
//				catLineup[i] = charPics[i]; //the normal pic of the cat will be displayed
//				unlockStatus[i] = true;
//			}
//		}
//	}
	//--------------------------------------------------------------------
//	public void unlockStageUpdate(){ //checks which stages are unlocked and whch are not
//		Scanner infile=null;
//		try{
//			infile=new Scanner(new BufferedReader(new FileReader("Assets/Info/UnlockedStage.txt")));
//		}
//		catch(IOException ex){
//			System.out.println("The UnlockedStage.txt file was not found.");
//		}
//		for (int i=0; i<unlockStageStatus.length; i++){
//			if (infile.nextLine().equals("LOCKED")){
//				stageLineup[i] = lockedStagePics[i];
//				unlockStageStatus[i] = false;
//			}
//			else{
//				stageLineup[i] = stagePics[i];
//				unlockStageStatus[i] = true;
//			}
//		}
//	}
	//--------------------------------------------------------------------
//	public void rewriteUnlockedStatus(){ //Updates which cat characters have been unlocked
//		PrintWriter outFile=null;
//		try{
//			outFile=new PrintWriter(new BufferedWriter(new FileWriter("Assets/Info/UnlockedStatus.txt")));
//		}
//		catch(IOException ex){
//			System.out.println("Something went wrong with saving UnlockedStatus.txt.");
//		}
//		for (int i=0; i<unlockStatus.length; i++){
//			if (unlockStatus[i]){
//				outFile.println("UNLOCKED");
//			}
//			else{
//				outFile.println("LOCKED");
//			}
//		}
//		outFile.close();
//	}
	// ------------ MouseListener ------------------------------------------
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
	//--------------------------------------------------------------------
    public void mouseClicked(MouseEvent e){
    	if (menuPicRecs[0].intersects(mousePoint)&& menu && loading >= 100){ //when the mouse is over the sound button rect and not on the loading screen (on the menu) (sound enabled/disabled)
    		if (soundOn){
				soundOn = false;
				mainplay.getSoundStat(soundOn);
    		}
    		else{
    			soundOn = true;
				mainplay.getSoundStat(soundOn);
    		}
    	}
    	if (menuPicRecs[1].intersects(mousePoint) && menu && loading>=100){ ////when the mouse is over the help button rect and not on the loading screen (on the menu)goes to help menu when setting help to true
    		menu = false;
    		help = true;
    	}
    	if (menuPicRecs[2].intersects(mousePoint) && menu && loading >= 100){ //when the mouse is over the play button rect and not on the loading screen (on the menu)
			menu = false;
			stageSelect = true;
    	}

    	if (menuPicRecs[3].intersects(mousePoint)&& menu && loading >= 100){ //when the mouse is over the customize button rect and not on the loading screen(on the menu)
    		menu = false;
    		selection = true;
    	}

    	if (backRect.intersects(mousePoint) && (selection || help || stageSelect)){ //when the mouse is over the back button rect and on the selection/help/stage select screen
    		selection = false;
    		help = false;
    		stageSelect = false;
    		pageNum = 0; //help screen page reset to beginning
    		restartMenu();
    	}
    }
	//--------------------------------------------------------------------
    public void mousePressed(MouseEvent e){ //put in mousepressed so a cat is not unlocked when clicking on the customization button in the same area where the cat is
		if (selection){ //when on the selection screen
	    	for (int i=0;i<catLineup.length;i++){ //choosing character
				if (charPicRecs[i].intersects(mousePoint)){
					if (unlockStatus[i]){ //if it's unlocked, the new characte ris chosen
						charChosen = i+1;
						mainplay.getCharNum();
					}
					else if(!unlockStatus[i] && costPrice[i]<=Integer.parseInt(starNum)){ //if the character is locked and the user has enough stars to buy it
						unlockStatus[i] = true;
						starNum = Integer.toString(Integer.parseInt(starNum) - costPrice[i]); //the number of stars decreases with the transaction
						charChosen = i+1;
						mainplay.getCharNum(); //changes choice of cat chosen
						scoreWidthUpdate(); //width between the number images for the star score is updated (since they're used to unlock the cat)
						mainplay.setSp(); //Changes the starpoints variable in the GamePanel to match the new, deducted amount.
						mainplay.game.rewriteStarPoints(Integer.parseInt(starNum)); //number of stars is rewritten into the text file
						rewriteUnlockedStatus(); //rewrites which cats are locked/unlocked
						unlockUpdate(); //changes the unlockStatus to the current one so the unlocked cat can be seen in colour
					}
				}
			}
		}

		if (help){ //when on the help screen
			if (rightRect.intersects(mousePoint) && pageNum+1!=howPage.length){ //arrow button for next page, doesnt show up on last page
				pageNum+=1;
			}
			if (leftRect.intersects(mousePoint) && pageNum!=0){ //arrow button for next page, doesnt show up on first page
				pageNum-=1;
			}
		}

		if (stageSelect){ //when on the stage select screen
			for (int i=0; i<stageRects.length; i++){
				if (stageRects[i].intersects(mousePoint) && unlockStageStatus[i]){ //when a stage is unlocked and it's chosen, the menu closes and the game begins
					stageChosen = stages[i];
		  			mainplay.add(mainplay.game);
		    		mainplay.menutime.stop();
					mainplay.getCharNum(); //menu returns needed info to rtc then to the game panel
					mainplay.getStage();
		   			mainplay.setSnp();
		   			mainplay.setSw();
					mainplay.setSp();
					mainplay.timeStart();
				}
			}
		}
	}

    // ---------- MouseMotionListener ------------------------------------------
    public void mouseDragged(MouseEvent e){}
    public void mouseMoved(MouseEvent e){
		mousePoint = new Rectangle (e.getX(), e.getY(), 1, 1); //rect to indicate where the mouse is, used for intersection
	}
    //Paint Component=======================================================================
    public void paintComponent(Graphics g){
		if (loading<100){ //loading screen is displayed
			setCursor(loadingCursor);
			g.drawImage(loadPage,0,0,this);
			loading+=1;
		}
		if (loading >=100){ //menu pictures are blit (includes selection/help/stage selecton pics)
			g.drawImage(background,0,0,this);
			setCursor(normalCursor);

			if(selection){ //if character selection is selected
				g.drawImage(starPic,16,16,this);  //draws number of stars
				for (int i=0;i<starNum.length();i++){
					g.drawImage(scoreNumPics[Integer.parseInt(starNum.substring(i,i+1))],100+scoreWidth[i],22,this);
				}

				g.drawImage(charBox, 0, 115, this);                    //--------- selection images blit
   				g.drawImage(selectPic,340,28,this);
				mainplay.game.drawScore(g,450-65,145-65);
   				g.drawImage(catLineup[charChosen-1], 450, 145, this);

   				if (backRect.intersects(mousePoint)){   //when mouse is over back button
   					g.drawImage(backHoverPic,800,20,this);
   				}
   				else{
   					g.drawImage(backPic,800,20,this);
   				}

				for (int i=0;i<charPicRecs.length;i++){ //draws each character, when no mouse is over it and when there is one
					if  (!charPicRecs[i].intersects(mousePoint)){
						g.drawImage(catLineup[i], charpicxPoints[i], charpicyPoints[i], this);
					}
					else{ //when mouse hovers over images
						mainplay.game.drawHover(g,charpicxPoints[i]-charHover/2-65,charpicyPoints[i]+charHover/2-65); //pallette from gamepanel is used for the effect
						g.drawImage(catLineup[i], charpicxPoints[i]-charHover/2, charpicyPoints[i]+charHover/2, this);
						charHover+=1*charHoverBounce;
						if (charHover>=10){ //cat movement from side to side
							charHoverBounce = -1;
						}
						if (charHover<=-10){
							charHoverBounce = 1;
						}
						if (!unlockStatus[i]){ //if the character is locked, the cost for it is shown
							g.drawImage(costPics[i], 0, 480, this);
						}
					}
					if (!unlockStatus[i]){ //if locked, lock is blit
						g.drawImage(lock, charpicxPoints[i]+35, charpicyPoints[i]+35, this);
					}
				}
			}
//=======================================================================
			else if(help){ //help and info screen
   				g.drawImage(howPage[pageNum],0,0,this);
   				if (backRect.intersects(mousePoint)){ //back button to go back to menu
   					g.drawImage(backHoverPic,800,20,this);
   				}
   				else{
   					g.drawImage(backPic,800,20,this);
   				}

				if (pageNum+1!=howPage.length){ //there is no right arrow blit on the last page
	   				if (rightRect.intersects(mousePoint)){ //arrow button for next page
	   					g.drawImage(rightHoverPic,890, 670, this);
	   				}
	   				else{
	   					g.drawImage(rightPic,890, 670, this);
	   				}
				}
				if (pageNum!=0){ //there is no left arrow blit on the first page
	   				if (leftRect.intersects(mousePoint)){ //arrow button for next page
	   					g.drawImage(leftHoverPic,20, 670, this);
	   				}
	   				else{
	   					g.drawImage(leftPic,20, 670, this);
	   				}
				}
			}
//=======================================================================
			else if(stageSelect){ //when on stage selection screen
   				if (backRect.intersects(mousePoint)){ //back button to go back to menu
   					g.drawImage(backHoverPic,800,20,this);
   				}
   				else{
   					g.drawImage(backPic,800,20,this);
   				}
   				g.drawImage(stageSelectPic,0,0,this);

				for (int i=0;i<stagePics.length;i++){
					if (stageRects[i].intersects(mousePoint) && unlockStageStatus[i]){ //hover images when mouse is over button
						g.drawImage(stageHoverPics[i], 0, 180+i*150, this);
					}
					else{
						g.drawImage(stageLineup[i], 0, 180+i*150, this);
					}
				}
			}
//=======================================================================
			else{ //main menu
				g.drawImage(starPic,16,16,this); //draws number of stars
				for (int i=0;i<starNum.length();i++){
					g.drawImage(scoreNumPics[Integer.parseInt(starNum.substring(i,i+1))],100+scoreWidth[i],22,this);
				}
				if (spd>-230){  //approximately when missile is off screen, when to stop running
					spd-=1;
					chaseScene(g);
				}

				else if (spd>-286){ //approximately when cat is off screen, when to stop running
					spd-=1;
					g.drawImage(bigCat,-3675-spd*14,4000+spd*14,this);
				}
				else{
					g.drawImage(bigCat,-3675-spd*14-(loading/100),4000+spd*14+(loading/100),this); //big cat comes in and hovers
					loading+=15*hoverBounce;
					if (loading>=800){
						hoverBounce = -1;
					}
					if (loading<=100){
						hoverBounce = 1;
					}
				}
				if (startPhase){ //initiates starting movements of icons
					moveIcons();
					if(spd==-15){
						startPhase=false;
					}
					if (soundOn){
						g.drawImage(soundOnPic, picxPoints[0]+117-x, picyPoints[0], this); //move in and out
					}
					else{
						g.drawImage(soundOffPic, 904+117-x, 518, this); //move in and out
					}
					g.drawImage(helpPic, picxPoints[1]-117+x, picyPoints[1], this);
					g.drawImage(playPic,423-41,466-11,256+x/8,128+x/16,this); //expand then shrink titles
					g.drawImage(titlePic,247-100,235-83,725+x/8,365+x/16,this);
					g.drawImage(custPic,311,596,406+x/8,70+x/16,this);
				}
				else{ //main menu pictures at rest
					for (int i=0;i<menuPicRecs.length;i++){
						g.drawImage(menuPics[i], picxPoints[i], picyPoints[i], this);
					}
					if (!soundOn){
						g.drawImage(soundOffPic,904,518,this); //when the sound option is off this image is blit
					}
					g.drawImage(titlePic,247-100,235-83,this);

					for (int i=0;i<hoverPics.length;i++){ //when the mouse is over the image it changes to look like hover
						if (menuPicRecs[i].intersects(mousePoint)){
							g.drawImage(hoverPics[i], picxPoints[i], picyPoints[i], this);
							if (!soundOn && i == 0){ //indicates the use of the sound off hover picture
		    					g.drawImage(soundOffHoverPic,904,518,this);
		    				}
						}
					}
				}
			}
		}
	}
}
