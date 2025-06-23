package Src.ClassFiles;

public abstract class AcademicRecord {
    private int id;
    private String courseCode;

    public AcademicRecord(int id, String courseCode){
        this.id = id;
        this.courseCode = courseCode; 
    }

    public abstract double gradeCalculator();
}
