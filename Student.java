
import java.util.Scanner;
import java.io.*;
public class Student
{
    private String myName;
    private Scores myTests;
    private Scores myProgs;
    private Scores myHk;
    private String myGrade;
    
    private int testAve;
    private int progAve;
    private int hkAve;
    private int myAve;
    
    private final int AP = 98;
    private final int A = 93;
    private final int AM = 90;
    private final int BP = 88;
    private final int B = 83;
    private final int BM = 80;
    private final int CP = 78;
    private final int C = 73;
    private final int CM = 70;
    private final int DP = 68;
    private final int D = 60;
    private final int TESTPOINTS = 100;
    private final int PROGSPOINTS = 25;
    private final int HKPOINTS = 10;
    private final double TESTAVE = .65;
    private final double PROGAVE = .30;
    private final double HKAVE = .05;
    
    public Student()
    {
        myName =  "";
        myGrade = "";
        myTests= new Scores();
        myProgs= new Scores();
        myHk= new Scores();
    }
    
    public void inputInfo(Scanner line)    throws IOException, FileNotFoundException
    {
        myName = line.nextLine();
        myTests.getScores(line.nextLine());
        myProgs.getScores(line.nextLine());
        myHk.getScores(line.nextLine());
        this.computeAve();
        this.computeGrade();
    }
    
    public void computeAve()      
    {
        testAve =(int) ((myTests.findAverage()/TESTPOINTS)*100);
        progAve =(int) ((myProgs.findAverage()/PROGSPOINTS)*100);
        hkAve = (int) ((myHk.findAverage()/HKPOINTS)*100);
        myAve = (int)(testAve*TESTAVE + progAve*PROGAVE + hkAve*HKAVE);
    }
    
    public void computeGrade()     
    {
        if(myAve>=AP)
           myGrade = "A+";
        else if(myAve>=A)
           myGrade = "A";
        else if(myAve>=AM)
           myGrade = "A-";
        else if(myAve>=BP)
           myGrade = "B+";
        else if(myAve>=B)
           myGrade = "B";
        else if(myAve>=BM)
           myGrade = "B-";
        else if(myAve>=CP)
           myGrade = "C+";
        else if(myAve>=C)
           myGrade = "C";
        else if(myAve>=CM)
           myGrade = "C-";
        else if(myAve>=DP)
           myGrade = "D+";
        else if(myAve>=D)
           myGrade = "D";
        else
           myGrade = "F";
    }
    
    public String toString()
    {
        if(myName.length()>7)
            System.out.println(myName + "\t" + testAve + " \t" + progAve + "\t" + hkAve + "\t" + myAve + "\t" + myGrade);
        else
            System.out.println(myName + "\t\t" + testAve + " \t" + progAve + "\t" + hkAve + "\t" + myAve + "\t" + myGrade);
        return"";
    }
    
    public double getAve()
    {
        return myAve;
    }
    
    public String getMyGrade()
    {
        return myGrade;
    }
}   
