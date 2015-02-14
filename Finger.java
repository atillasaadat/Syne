import com.leapmotion.leap.*;
//import java.util.*;
public class Finger{

//-------------------------------------------------------------------------------- 3 Main Data Variables

	private int id; //type of fing
	private double length;
	private double width;

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

	public Finger(int eyed, double len, double wid, Vector m, Vector p, Vector i, Vector d){

		id = eyed; //type of fing
		length = len;
		width = wid;

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

	public int getID(){
		return id;
	}

	public double getLength(){
		return length;
	}

	public double getWidth(){
		return width;
	}

	public double getMetaStart(){
		return meta.getX();
	}
	
	public double getProxStart(){
		return prox.getX();
	}
	
	public double getInterStart(){
		return inter.getX();
	}
	
	public double getDistalStart(){
		return distal.getX();
	}
	
	public double getMetaEnd(){
		return meta.getY();
	}
	
	public double getProxEnd(){
		return prox.getY();
	}
	
	public double getInterEnd(){
		return inter.getY();
	}
	
	public double getDistalEnd(){
		return distal.getY();
	}
	
	public double getMetaDir(){
		return meta.getZ();
	}
	
	public double getProxDir(){
		return prox.getZ();
	}
	
	public double getInterDir(){
		return inter.getZ();
	}
	
	public double getDistalDir(){
		return distal.getZ();
	}
}

