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
		thumb_proximal = new Vector(0.633255f, -0.229303f, 0.739194f);
		thumb_intermediate = new Vector(0.0140248f, 0.00470271f, 0.999891f);
		thumb_distal = new Vector(-0.107216f, 0.0499425f, 0.992981f);
		thumbArray = new Vector [] {thumb_metacarpal,thumb_proximal,thumb_intermediate,thumb_distal};
		
		index_metacarpal = new Vector(0.224711f, -0.350514f, 0.9092f);
		index_proximal = new Vector(0.167005f, 0.803414f, 0.57152f);
		index_intermediate = new Vector(-0.218985f, 0.699985f, -0.679755f); 
		index_distal = new Vector(-0.3f, 0f, -0.9f);
		indexArray = new Vector [] {index_metacarpal,index_proximal,index_intermediate,index_distal};
		
		middle_metacarpal = new Vector(0.0899691f, -0.344703f, 0.93439f);
		middle_proximal = new Vector(0.262136f, 0.788972f, 0.555704f);
		middle_intermediate = new Vector(0.0677098f, 0.675011f, -0.734694f);
		middle_distal = new Vector(-0.103219f, 0.102759f, -0.989336f);
		middleArray = new Vector [] {middle_metacarpal,middle_proximal,middle_intermediate,middle_distal};
		
		ring_metacarpal = new Vector(-0.0598401f, -0.327759f, 0.942864f);
		ring_proximal = new Vector(0.305183f, 0.707564f, 0.637351f);
		ring_intermediate = new Vector(0.184174f, 0.751916f, -0.63301f);
		ring_distal = new Vector(-0.0274737f, 0.228677f, -0.973115f);
		ringArray = new Vector [] {ring_metacarpal,ring_proximal,ring_intermediate,ring_distal};
		
		pinky_metacarpal = new Vector(-0.202879f, -0.342209f, 0.91746f);
		pinky_proximal = new Vector(0.366474f, 0.643916f, 0.671616f);
		pinky_intermediate = new Vector(0.435562f, 0.669531f, -0.601677f);
		pinky_distal = new Vector(0.166438f, 0.205593f, -0.964381f);
		pinkyArray = new Vector [] {pinky_metacarpal,pinky_proximal,pinky_intermediate,pinky_distal};
		
		for(int i = 0; i < 4; i++){
			thumbArray[i].setX((float)Math.round(thumbArray[i].getX()*10f)/10f);
			thumbArray[i].setY((float)Math.round(thumbArray[i].getY()*10f)/10f);
			thumbArray[i].setZ((float)Math.round(thumbArray[i].getZ()*10f)/10f);
			
			indexArray[i].setX((float)Math.round(indexArray[i].getX()*10f)/10f);
			indexArray[i].setY((float)Math.round(indexArray[i].getY()*10f)/10f);
			indexArray[i].setZ((float)Math.round(indexArray[i].getZ()*10f)/10f);
			
			middleArray[i].setX((float)Math.round(middleArray[i].getX()*10f)/10f);
			middleArray[i].setY((float)Math.round(middleArray[i].getY()*10f)/10f);
			middleArray[i].setZ((float)Math.round(middleArray[i].getZ()*10f)/10f);
			
			ringArray[i].setX((float)Math.round(ringArray[i].getX()*10f)/10f);
			ringArray[i].setY((float)Math.round(ringArray[i].getY()*10f)/10f);
			ringArray[i].setZ((float)Math.round(ringArray[i].getZ()*10f)/10f);
			
			pinkyArray[i].setX((float)Math.round(pinkyArray[i].getX()*10f)/10f);
			pinkyArray[i].setY((float)Math.round(pinkyArray[i].getY()*10f)/10f);
			pinkyArray[i].setZ((float)Math.round(pinkyArray[i].getZ()*10f)/10f);
		}
		
	}
	
	public boolean checkIfA(Finger.Type inputFinger,
		Vector metacarpal,Vector proximal,Vector intermediate,Vector distal)
	{
		metacarpal = new Vector((float)Math.round(metacarpal.getX()*10f)/10f,((float)Math.round(metacarpal.getY()*10f)/10f),
				(float)Math.round(metacarpal.getZ()*10f)/10f);
		proximal = new Vector((float)Math.round(proximal.getX()*10f)/10f,(float)Math.round(proximal.getY()*10f)/10f,
				(float)Math.round(proximal.getZ()*10f)/10f);
		intermediate = new Vector((float)Math.round(intermediate.getX()*10f)/10f,(float)Math.round(intermediate.getY()*10f)/10f,
				(float)Math.round(intermediate.getZ()*10f)/10f);
		distal = new Vector((float)Math.round(distal.getX()*10f)/10f,(float)Math.round(distal.getY()*10f)/10f,
				(float)Math.round(distal.getZ()*10f)/10f);
		
		if(inputFinger == Finger.Type.TYPE_THUMB){
			
			if(metacarpal.equals(thumbArray[0])&&proximal.equals(thumbArray[1])&&intermediate.equals(thumbArray[2])&&distal.equals(thumbArray[3])){
				return true;
			}
		}
		if(inputFinger == Finger.Type.TYPE_INDEX){
			System.out.println(distal+"      "+indexArray[3]);
			if(distal.equals(indexArray[3])){
				System.out.println("worth");
			}
			if(metacarpal.equals(indexArray[0])&&
					proximal.equals(indexArray[1])&&intermediate.equals(indexArray[2])&&distal.equals(indexArray[3])){
				System.out.println("index true");
				return true;
			}
		}
		if(inputFinger == Finger.Type.TYPE_MIDDLE){
			if(metacarpal.equals(middleArray[0])&&proximal.equals(middleArray[1])&&intermediate.equals(middleArray[2])&&distal.equals(middleArray[3])){
				return true;
			}
		}
		if(inputFinger == Finger.Type.TYPE_RING){
			if(metacarpal.equals(ringArray[0])&&proximal.equals(ringArray[1])&&intermediate.equals(ringArray[2])&&distal.equals(ringArray[3])){
				return true;
			}
		}
		if(inputFinger == Finger.Type.TYPE_PINKY){
			if(metacarpal.equals(pinkyArray[0])&&proximal.equals(pinkyArray[1])&&intermediate.equals(pinkyArray[2])&&distal.equals(pinkyArray[3])){
				return true;
			}
		}
		return false;
	}
}