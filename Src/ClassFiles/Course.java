package Src.ClassFiles;

public class Course extends AcademicRecord{
    private int test1, test2, test3, finalExam; 

    public Course(int id, String courseCode, int test1, int test2, int test3, int finalExam){
        super (id, courseCode);
        
        this.test1 = test1; 
        this.test2 = test2; 
        this.test3 = test3; 
        this.finalExam = finalExam; 
    }

    @Override
    public double gradeCalculator(){
        return ((((test1 + test2 + test3)*0.2 )+ (finalExam*0.4))*10.0) / 10.0; 
    }
}

