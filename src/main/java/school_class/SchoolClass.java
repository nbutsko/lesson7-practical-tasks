package school_class;

import java.util.List;

public class SchoolClass {

    private String schoolClassName;
    private List<Student> students;

    public SchoolClass(String schoolClassName, List<Student> students) {
        this.schoolClassName = schoolClassName;
        this.students = students;
    }

    public String getSchoolClassName() {
        return schoolClassName;
    }

    public void setSchoolClassName(String schoolClassName) {
        this.schoolClassName = schoolClassName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public double getAverageScoreOfClass() {
        double sumScore = 0;
        for (Student student : this.students) {
            sumScore += student.getScore();
        }
        return sumScore / this.students.size();
    }

    @Override
    public String toString() {
        return "SchoolClass{" +
                "name='" + schoolClassName + '\'' +
                ", average score=" + getAverageScoreOfClass() +
                ", \nstudents=" + students + '\'' +
                '}';
    }
}
