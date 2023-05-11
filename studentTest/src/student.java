public class student {
    //student class that store a student name and average
    private String name;
    private  double average;

    //constructor initializes instance variable
    public student(String name, double average)
    {
        this.name=name;

        // validate that average is > 0.0 and <= 100.0; otherwise,
         // keep instance variable average's default value(0.0)
        if (average > 0.0 )
            if (average <= 100.0)
                this.average = average;


    }

    // set the student name
    public void setName(String name) {
        this.name = name;
    }

    //retrieve the student name
    public String getName() {
        return name;
    }

    // set the student average
    public void setAverage(double average) {

        if (average > 0.0 )
            if (average <= 100.0)

        this.average = average;
    }

    //to get average
    public double getAverage() {
        return average;
    }


    // to get student letter garde
    public String getLetterGrade()
    {
        String letterGrade = "";

        if ( average >= 90.0)
            letterGrade = "A";
        else if (average >= 80.0) {
            letterGrade = "B";
        } else if (average >= 70.0) {
            letterGrade = "C";
        } else if (average >= 60.0) {
            letterGrade = "D";
        }else {
            letterGrade = "F";
        }
        return letterGrade;
    }
}
