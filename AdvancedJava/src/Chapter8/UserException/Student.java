package Chapter8.UserException;
import java.util.Scanner;

public class Student {

    private String stNumber;
    private String stName;
    private int test1,test2, assignment;


    public Student (String stNum, String stNam, int t1, int t2, int Assign) throws NoExamEntryException{

        setStNumber(stNum);
        setStName(stNam);
        setTest1(t1);
        setTest2(t2);
       setAssignment(Assign);

       CalcSemesterMark();
    }



    public String getStNumber() {
        return stNumber;
    }

    public void setStNumber(String stNumber){

        if(stNumber.isEmpty() || stNumber.length() <9) {
            throw new IllegalArgumentException("Student Number cannot be empty or less than 9");
        }

            this.stNumber = stNumber;
    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName){

        if(stName==null || stName.length()<3){

            throw new IllegalArgumentException();
        }
        this.stName = stName;
    }

    public int getTest1() {
        return test1;
    }

    public void setTest1(int test1) {

        if(test1 <0 || test1 >100){
            throw new IllegalArgumentException("test mark must be between 0 to 100");
        }
        this.test1 = test1;
    }

    public int getTest2() {
        return test2;
    }

    public void setTest2(int test2){

        if(test2 < 0 || test2>100){
            throw new IllegalArgumentException();
        }
        this.test2 = test2;
    }

    public int getAssignment() {
        return assignment;
    }

    public void setAssignment(int assignment) {
        if(assignment < 0 || assignment > 100){
            throw new IllegalArgumentException();
        }
        this.assignment = assignment;
    }

private double CalcSemesterMark() throws NoExamEntryException {

    double SM =0;
    SM = (test1 * 0.33) + (test2 * 0.34) + (assignment * 0.33);
    if(SM < 45) throw new NoExamEntryException("Students semester mark is lower than threshold");
    return SM;
}

private double calcFinalMark(int examMark) throws NoExamEntryException {
        double FM=0;
        FM= (CalcSemesterMark() + examMark) /2;
        return FM;
}



    public String toString(){

        try {
            return ("\nStudent No: " + getStNumber()+
                    "\nName: " + getStName() +
                    "\nTest 1: " + getTest1() +
                     "\nTest2: " + getTest2() +
                    "\nSmester Mark: " + CalcSemesterMark()+
                    "\nFinal Mark: " + calcFinalMark(60)



            );
        } catch (NoExamEntryException e) {
            throw new RuntimeException(e);
        }

    }

}
