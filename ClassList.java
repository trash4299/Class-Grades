
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
public class ClassList
{
    private ArrayList <Student> myStudents;
    private int[] myGradeDistrabution;
    private double classave;
    
    public ClassList()
    {
        myGradeDistrabution = new int[5];
        classave = 0;
        myStudents = new ArrayList <Student>();
    }
    
    public void inputStudents(Scanner inF) throws IOException, FileNotFoundException
    {
        while(inF.hasNext())
        {
            Student aStudent = new Student();
            aStudent.inputInfo(inF);
            myStudents.add(aStudent);
        }
    }
    
    public double computeClassAverage()
    {
        classave = 0;
        for(int i=0;i<myStudents.size();i++)
            classave+= myStudents.get(i).getAve();
        classave = classave/myStudents.size();
        return classave;
    }
    
    public void computeGradeDist()
    {
        myGradeDistrabution[0]=0;
        myGradeDistrabution[1]=0;
        myGradeDistrabution[2]=0;
        myGradeDistrabution[3]=0;
        myGradeDistrabution[4]=0;
        for(int x=0;x<=myStudents.size()-1;x++)
        {
            if(myStudents.get(x).getMyGrade().equals("A+")||myStudents.get(x).getMyGrade().equals("A")||myStudents.get(x).getMyGrade().equals("A-"))
               myGradeDistrabution[0]++;
            else if(myStudents.get(x).getMyGrade().equals("B+")||myStudents.get(x).getMyGrade().equals("B")||myStudents.get(x).getMyGrade().equals("B-"))
               myGradeDistrabution[1]++;
            else if(myStudents.get(x).getMyGrade().equals("C+")||myStudents.get(x).getMyGrade().equals("C")||myStudents.get(x).getMyGrade().equals("C-"))
               myGradeDistrabution[2]++;
            else if(myStudents.get(x).getMyGrade().equals("D+")||myStudents.get(x).getMyGrade().equals("D"))
               myGradeDistrabution[3]++;
            else
               myGradeDistrabution[4]++;
        }
    }
    
    public void printClassGrades()
    {
        this.computeGradeDist();
        System.out.print("\t" + myGradeDistrabution[0]);
        System.out.print("\t" + myGradeDistrabution[1]);
        System.out.print("\t" + myGradeDistrabution[2]);
        System.out.print("\t" + myGradeDistrabution[3]);
        System.out.print("\t" + myGradeDistrabution[4]);
    }
    
    public Student getStud(int i)
    {
        return myStudents.get(i);
    }
    
    public int stud()
    {
        return myStudents.size();
    }
    
    public String printStudGrades(Student astudent)
    {
        astudent.toString();
        return "";
    }
}
