/**
 * Created by Abhi on 15-02-14.
 * csvWriter.java
 * Reads data gesture_data.csv and links it to the main
 */

import java.io.FileReader;
import java.util.Arrays;
import java.util.ArrayList;
import au.com.bytecode.opencsv.CSVReader;
import com.leapmotion.leap.*;
import com.leapmotion.leap.Gesture.State;

public class ReadData
{
    public String csv;
    String[][] allData = new String[20][];

    public Vector tM, tP, tI, tD;
    public Vector iM, iP, iI, iD;
    public Vector mM, mP, mI, mD;
    public Vector rM, rP, rI, rD;
    public Vector pM, pP, pI, pD;

    public void readData(String filename) throws Exception
    {
        this.csv = "Data/"+filename+".csv";

        CSVReader reader = new CSVReader(new FileReader(csv), ',', '"', 1);
        //ArrayList<String[]>allData = new ArrayList    <String[]>();

        String[] nextLine;
        int count = 0;
        while ((nextLine = reader.readNext()) != null) {

            if (nextLine != null) {
                allData[count] = nextLine;
                count ++;
            }
        }
    }

    public Vector gettM()
    {
        Vector newVector = new Vector(Float.parseFloat(allData[0][2]),Float.parseFloat(allData[0][3]),Float.parseFloat(allData[0][4]));
        return newVector;
    }

    public Vector gettP()
    {
        Vector newVector = new Vector(Float.parseFloat(allData[1][2]),Float.parseFloat(allData[1][3]),Float.parseFloat(allData[1][4]));
        return newVector;
    }

    public Vector gettI()
    {
        Vector newVector = new Vector(Float.parseFloat(allData[2][2]),Float.parseFloat(allData[2][3]),Float.parseFloat(allData[2][4]));
        return newVector;
    }

    public Vector gettD()
    {
        Vector newVector = new Vector(Float.parseFloat(allData[3][2]),Float.parseFloat(allData[3][3]),Float.parseFloat(allData[3][4]));
        return newVector;
    }

    public Vector getiM()
    {
        Vector newVector = new Vector(Float.parseFloat(allData[4][2]),Float.parseFloat(allData[4][3]),Float.parseFloat(allData[4][4]));
        return newVector;
    }

    public Vector getiP()
    {
        Vector newVector = new Vector(Float.parseFloat(allData[5][2]),Float.parseFloat(allData[5][3]),Float.parseFloat(allData[5][4]));
        return newVector;
    }

    public Vector getiI()
    {
        Vector newVector = new Vector(Float.parseFloat(allData[6][2]),Float.parseFloat(allData[6][3]),Float.parseFloat(allData[6][4]));
        return newVector;
    }

    public Vector getiD()
    {
        Vector newVector = new Vector(Float.parseFloat(allData[7][2]),Float.parseFloat(allData[7][3]),Float.parseFloat(allData[7][4]));
        return newVector;
    }

    public Vector getmM()
    {
        Vector newVector = new Vector(Float.parseFloat(allData[8][2]),Float.parseFloat(allData[8][3]),Float.parseFloat(allData[8][4]));
        return newVector;
    }

    public Vector getmP()
    {
        Vector newVector = new Vector(Float.parseFloat(allData[9][2]),Float.parseFloat(allData[9][3]),Float.parseFloat(allData[9][4]));
        return newVector;
    }

    public Vector getmI()
    {
        Vector newVector = new Vector(Float.parseFloat(allData[10][2]),Float.parseFloat(allData[10][3]),Float.parseFloat(allData[10][4]));
        return newVector;
    }

    public Vector getmD()
    {
        Vector newVector = new Vector(Float.parseFloat(allData[11][2]),Float.parseFloat(allData[11][3]),Float.parseFloat(allData[11][4]));
        return newVector;
    }

    public Vector getrM()
    {
        Vector newVector = new Vector(Float.parseFloat(allData[12][2]),Float.parseFloat(allData[12][3]),Float.parseFloat(allData[12][4]));
        return newVector;
    }

    public Vector getrP()
    {
        Vector newVector = new Vector(Float.parseFloat(allData[13][2]),Float.parseFloat(allData[13][3]),Float.parseFloat(allData[13][4]));
        return newVector;
    }

    public Vector getrI()
    {
        Vector newVector = new Vector(Float.parseFloat(allData[14][2]),Float.parseFloat(allData[14][3]),Float.parseFloat(allData[14][4]));
        return newVector;
    }

    public Vector getrD()
    {
        Vector newVector = new Vector(Float.parseFloat(allData[15][2]),Float.parseFloat(allData[15][3]),Float.parseFloat(allData[15][4]));
        return newVector;
    }

    public Vector getpM()
    {
        Vector newVector = new Vector(Float.parseFloat(allData[16][2]),Float.parseFloat(allData[16][3]),Float.parseFloat(allData[16][4]));
        return newVector;
    }

    public Vector getpP()
    {
        Vector newVector = new Vector(Float.parseFloat(allData[17][2]),Float.parseFloat(allData[17][3]),Float.parseFloat(allData[17][4]));
        return newVector;
    }

    public Vector getpI()
    {
        Vector newVector = new Vector(Float.parseFloat(allData[18][2]),Float.parseFloat(allData[18][3]),Float.parseFloat(allData[18][4]));
        return newVector;
    }

    public Vector getpD()
    {
        Vector newVector = new Vector(Float.parseFloat(allData[19][2]),Float.parseFloat(allData[19][3]),Float.parseFloat(allData[19][4]));
        return newVector;
    }

    @SuppressWarnings("resource")
    public static void main(String[]args) throws Exception
    {
        ReadData myreaddata = new ReadData();
        myreaddata.readData("data");
        System.out.println(myreaddata.gettM());
    }
}
