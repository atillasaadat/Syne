import com.leapmotion.leap.Finger;
import com.leapmotion.leap.Vector;



public class LetterCheck {
	private Vector thumb_metacarpal,thumb_proximal,thumb_intermediate,thumb_distal;
	private Vector index_metacarpal,index_proximal,index_intermediate,index_distal;
	private Vector middle_metacarpal,middle_proximal,middle_intermediate,middle_distal;
	private Vector ring_metacarpal,ring_proximal,ring_intermediate,ring_distal;
	private Vector pinky_metacarpal,pinky_proximal,pinky_intermediate,pinky_distal;
	private Vector[] thumbArray;
	private Vector[] indexArray;
	private Vector[] middleArray;
	private Vector[] ringArray;
	private Vector[] pinkyArray;
	public LetterCheck(){
		thumb_metacarpal =  new Vector(0f,0f,0f);
		thumb_proximal = new Vector(0.466117f, -0.173513f, 0.867541f);
		thumb_intermediate = new Vector(0.0449905f, -0.281162f, 0.958605f);
		thumb_distal = new Vector(-0.191874f, -0.185983f, 0.963636f);
		thumbArray = new Vector [] {thumb_metacarpal,thumb_proximal,thumb_intermediate,thumb_distal};
		
		index_metacarpal = new Vector(0.19751f, -0.473539f, 0.858342f);
		index_proximal = new Vector(0.0811034f, 0.769529f, 0.633441f);
		index_intermediate = new Vector(-0.279616f, 0.667961f, -0.689668f); 
		index_distal = new Vector(-0.27891f, 0.0658935f, -0.958054f);
		indexArray = new Vector [] {index_metacarpal,index_proximal,index_intermediate,index_distal};
		
		middle_metacarpal = new Vector(0.0615962f, -0.477843f, 0.876283f);
		middle_proximal = new Vector(0.192668f, 0.767193f, 0.611795f);
		middle_intermediate = new Vector(0.0319338f, 0.662303f, -0.748555f);
		middle_distal = new Vector(-0.0928271f, 0.0701192f, -0.99321f);
		middleArray = new Vector [] {middle_metacarpal,middle_proximal,middle_intermediate,middle_distal};
		
		ring_metacarpal = new Vector(-0.0891604f, -0.469499f, 0.87842f);
		ring_proximal = new Vector(0.2135f, 0.623173f, 0.752379f);
		ring_intermediate = new Vector(0.229997f, 0.856765f, -0.461579f);
		ring_distal = new Vector(0.0853547f, 0.424603f, -0.901348f);
		ringArray = new Vector [] {ring_metacarpal,ring_proximal,ring_intermediate,ring_distal};
		
		pinky_metacarpal = new Vector(-0.229746f, -0.486887f, 0.842709f);
		pinky_proximal = new Vector(0.271031f, 0.544498f, 0.793766f);
		pinky_intermediate = new Vector(0.480715f, 0.779236f, -0.402125f);
		pinky_distal = new Vector(0.287146f, 0.40055f, -0.870119f);
		pinkyArray = new Vector [] {pinky_metacarpal,pinky_proximal,pinky_intermediate,pinky_distal};
		
		for(int i = 0; i < 4; i++){
			thumbArray[i].setX((float)Math.round(thumbArray[i].getX()*1)/1);
			thumbArray[i].setY((float)Math.round(thumbArray[i].getY()*1)/1);
			thumbArray[i].setZ((float)Math.round(thumbArray[i].getZ()*1)/1);
			
			indexArray[i].setX((float)Math.round(indexArray[i].getX()*1)/1);
			indexArray[i].setY((float)Math.round(indexArray[i].getY()*1)/1);
			indexArray[i].setZ((float)Math.round(indexArray[i].getZ()*1)/1);
			
			middleArray[i].setX((float)Math.round(middleArray[i].getX()*1)/1);
			middleArray[i].setY((float)Math.round(middleArray[i].getY()*1)/1);
			middleArray[i].setZ((float)Math.round(middleArray[i].getZ()*1)/1);
			
			ringArray[i].setX((float)Math.round(ringArray[i].getX()*1)/1);
			ringArray[i].setY((float)Math.round(ringArray[i].getY()*1)/1);
			ringArray[i].setZ((float)Math.round(ringArray[i].getZ()*1)/1);
			
			pinkyArray[i].setX((float)Math.round(pinkyArray[i].getX()*1)/1);
			pinkyArray[i].setY((float)Math.round(pinkyArray[i].getY()*1)/1);
			pinkyArray[i].setZ((float)Math.round(pinkyArray[i].getZ()*1)/1);
		}
		
	}
	
	public boolean checkIfA(Finger.Type inputFinger,
		Vector metacarpal,Vector proximal,Vector intermediate,Vector distal)
	{
		metacarpal = new Vector((float)Math.round(metacarpal.getX()),(float)Math.round(metacarpal.getY()),
				(float)Math.round(metacarpal.getZ()));
		proximal = new Vector((float)Math.round(proximal.getX()),(float)Math.round(proximal.getY()),
				(float)Math.round(proximal.getZ()));
		intermediate = new Vector((float)Math.round(intermediate.getX()),(float)Math.round(intermediate.getY()),
				(float)Math.round(intermediate.getZ()));
		distal = new Vector((float)Math.round(distal.getX()),(float)Math.round(distal.getY()),
				(float)Math.round(distal.getZ()));
		
		if(inputFinger == Finger.Type.TYPE_THUMB){
			
			if(metacarpal.equals(thumbArray[0])&&proximal.equals(thumbArray[1])&&intermediate.equals(thumbArray[2])&&distal.equals(thumbArray[3])){
				return true;
			}
		}
		else if(inputFinger == Finger.Type.TYPE_INDEX){
			if(metacarpal.equals(indexArray[0])&&proximal.equals(indexArray[1])&&intermediate.equals(indexArray[2])&&distal.equals(indexArray[3])){
				return true;
			}
		}
		else if(inputFinger == Finger.Type.TYPE_MIDDLE){
			if(metacarpal.equals(middleArray[0])&&proximal.equals(middleArray[1])&&intermediate.equals(middleArray[2])&&distal.equals(middleArray[3])){
				return true;
			}
		}
		else if(inputFinger == Finger.Type.TYPE_RING){
			if(metacarpal.equals(ringArray[0])&&proximal.equals(ringArray[1])&&intermediate.equals(ringArray[2])&&distal.equals(ringArray[3])){
				return true;
			}
		}
		else if(inputFinger == Finger.Type.TYPE_PINKY){
			if(metacarpal.equals(pinkyArray[0])&&proximal.equals(pinkyArray[1])&&intermediate.equals(pinkyArray[2])&&distal.equals(pinkyArray[3])){
				return true;
			}
		}
		return false;
	}
}