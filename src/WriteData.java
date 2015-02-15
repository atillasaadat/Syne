/**
 * Created by Abhi on 15-02-14.
 * csvWriter.java
 * Takes data input from LeapMotion API script and compiles a .csv file containing all the gestures data
 */

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import au.com.bytecode.opencsv.CSVWriter;
import com.leapmotion.leap.*;
import com.leapmotion.leap.Gesture.State;


public class WriteData
{
    public String csv;
    public String[]record;
    public ArrayList<ArrayList<Vector>>myFingers = new ArrayList<ArrayList<Vector>>();
    public void WriteData(ArrayList<Vector> thumb,
                          ArrayList<Vector> index,
                          ArrayList<Vector> middle,
                          ArrayList<Vector> ring,
                          ArrayList<Vector> pinky) throws Exception
    {

        myFingers.add(thumb);
        myFingers.add(index);
        myFingers.add(middle);
        myFingers.add(ring);
        myFingers.add(pinky);
        this.csv = "Data/data.csv";

        CSVWriter writer = new CSVWriter(new FileWriter(csv));
        this.record = "Fingers,Bones,X,Y,Z".split(",");

        writer.writeNext(record);
        String[]fingers = {"Thumb","Index","Middle","Ring","Pinky"};
        String[]bones = {"Metacarpal","Proximal","Intermediate","Distal"};
        for(int i=0; i<5; i++){
            for(int j=0; j<4; j++){
                Vector XYZ = myFingers.get(i).get(j);
                String wut = ""+fingers[i]+","+bones[j]+","+XYZ.getX()+","+XYZ.getY()+","+XYZ.getZ();
                writer.writeNext(wut.split(","));

            }
        }

        writer.close();
    }

    public static void main(String[]args) throws Exception
    {
        ArrayList<Vector>Thumb = new ArrayList<Vector>();
        Thumb.add(new Vector(1,2,3));
        Thumb.add(new Vector(1,2,3));
        Thumb.add(new Vector(1,2,3));
        Thumb.add(new Vector(1,2,3));
        Thumb.add(new Vector(1,2,3));
        ArrayList<Vector>Index = new ArrayList<Vector>();
        Index.add(new Vector(1,2,3));
        Index.add(new Vector(1,2,3));
        Index.add(new Vector(1,2,3));
        Index.add(new Vector(1, 2, 3));
        Index.add(new Vector(1,2,3));
        ArrayList<Vector>Middle = new ArrayList<Vector>();
        Middle.add(new Vector(1,2,3));
        Middle.add(new Vector(1,2,3));
        Middle.add(new Vector(1,2,3));
        Middle.add(new Vector(1, 2, 3));
        Middle.add(new Vector(1,2,3));
        ArrayList<Vector>Ring = new ArrayList<Vector>();
        Ring.add(new Vector(1,2,3));
        Ring.add(new Vector(1,2,3));
        Ring.add(new Vector(1,2,3));
        Ring.add(new Vector(1,2,3));
        Ring.add(new Vector(1, 2, 3));
        ArrayList<Vector>Pinky = new ArrayList<Vector>();
        Pinky.add(new Vector(1,2,3));
        Pinky.add(new Vector(1,2,3));
        Pinky.add(new Vector(1,2,3));
        Pinky.add(new Vector(1,2,3));
        Pinky.add(new Vector(1, 2, 3));


        WriteData mywritedata = new WriteData();
        mywritedata.WriteData(Thumb,Index,Middle,Ring,Pinky);


    }

}