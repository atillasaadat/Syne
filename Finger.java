import com.leapmotion.leap.*;
//import java.util.*;
public class Finger{

//-------------------------------------------------------------------------------- 3 Main Data Variables

	private String id; //type of fing
//	private double length;
//	private double width;

//-------------------------------------------------------------------------------- Meta Carpel Data

	private Vector meta;
//	private double startM;
//	private double endM;
//	private double dirM;

//-------------------------------------------------------------------------------- Proxima Data

	private Vector prox;
//	private double startP;
//	private double endP;
//	private double dirP;

//-------------------------------------------------------------------------------- Intermediate Data

	private Vector inter;
//	private double startI;
//	private double endI;
//	private double dirI;

//-------------------------------------------------------------------------------- Distal Data

//	private double startD;
//	private double endD;
//	private double dirD;
	private Vector distal;

//-------------------------------------------------------------------------------- Initialization

	public Finger(String eyed, Vector m, Vector p, Vector i, Vector d){

		id = eyed; //type of fing
//		length = len;
//		width = wid;

		meta = m;
		prox = p;
		inter = i;
		distal = d;

//		startM = stm;
//		endM = ndm;
//		dirM = dirtm;
//
//		startP = stp;
//		endP = ndp;
//		dirP = dirtp;
//
//		startI = sti;
//		endI = ndi;
//		dirI = dirti;
//
//		startD = std;
//		endD = ndd;
//		dirD = dirtd;
	}

//-------------------------------------------------------------------------------- Return Vals

	public String getID(){
		return id;
	}

//	public double getLength(){
//		return length;
//	}
//
//	public double getWidth(){
//		return width;
//	}

	public double getMetaX(){
		return meta.getX();
	}
	
	public double getProxX(){
		return prox.getX();
	}
	
	public double getInterX(){
		return inter.getX();
	}
	
	public double getDistalX(){
		return distal.getX();
	}
	
	public double getMetaY(){
		return meta.getY();
	}
	
	public double getProxY(){
		return prox.getY();
	}
	
	public double getInterY(){
		return inter.getY();
	}
	
	public double getDistalY(){
		return distal.getY();
	}
	
	public double getMetaZ(){
		return meta.getZ();
	}
	
	public double getProxZ(){
		return prox.getZ();
	}
	
	public double getInterZ(){
		return inter.getZ();
	}
	
	public double getDistalZ(){
		return distal.getZ();
	}
}

