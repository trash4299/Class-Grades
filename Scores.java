import java.util.Scanner;
import java.io.*;
public class Scores
{
    private int[] myScores;
    private int mySize;
    private static final int MAXSIZE = 10;
    
    public Scores()
    {
        myScores = new int[MAXSIZE];
        mySize = 0;
    }
    
    public void getScores(String line) throws IOException, FileNotFoundException
    {
        Scanner in = new Scanner(line);
        while(in.hasNextInt())
        {
            myScores[mySize] = in.nextInt();
            mySize++;
        }
    }
    
    public double findAverage()
    {
        double sum = 0;
        for (int i=0;i<mySize;i++)
            sum+=myScores[i];
        return sum/mySize;
    }
    
    public String toString()
    {
        String scores = "";
        for(int i = 0;i<mySize;i++)
            scores += myScores[i] + "\t";
        return scores;
    }
}
