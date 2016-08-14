
import java.util.Scanner;
import java.io.*;
public class GradeBook
{
    private int studentcount;
    private ClassList harrisClass;
    
    public GradeBook()
    {
        studentcount = 0;
        harrisClass = new ClassList();
    }
    
    public void header()
    {
        System.out.println("Vincent Lobo");
        System.out.println("M359");
        System.out.println("Gradebook Program\n");
        System.out.println("\tNAME\t\tTestAve\tProgAve\tHkAve\tTotAve\tGrade");
    }
    
    public void footer()
    {
        System.out.println("Grade Book Distrabution:\n\tA's\tB's\tC's\tD's\tF's");
    }
    
    public void inputStudentInfo() throws IOException, FileNotFoundException
    {
        Scanner inF = new Scanner(new File("F:\\studentsData.txt"));
        while(inF.hasNext())
            harrisClass.inputStudents(inF);
    }
    
    public void printclassgrades()
    {
        header();
        studentcount = 1;
        for(int i=0;i<harrisClass.stud();i++)
        {
            System.out.print(studentcount + ".\t");
            System.out.println(printStudGrades(harrisClass.getStud(i)));
            studentcount++;
        }
        footer();
        printclassGradeDist();
        System.out.println("\nClass Average: " + harrisClass.computeClassAverage());
    }
    
    public String printStudGrades(Student astudent)
    {
        harrisClass.printStudGrades(astudent);
        return "";
    }
    
    public void printclassGradeDist()
    {
        harrisClass.printClassGrades();
    }
}
