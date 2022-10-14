import java.util.ArrayList;
import java.util.List;

public class Student {
    private final String firstName;
    private final String lastName;
    List<Exam> exams;

   public Student(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Exam> getExams() {
        return exams;
    }

    public void registerExam(Exam exam) {
        exams.add(exam);
    }

    public double computeAverageGrade() {
        double add = 0;
        for (int i=0; i<exams.size(); i++) {
             add = add + exams.get(i).getGrade();
        }
        double result = add/exams.size();
      return result;
    }
}