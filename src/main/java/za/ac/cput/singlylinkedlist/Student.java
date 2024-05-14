package za.ac.cput.singlylinkedlist;

public class Student {
    private String name;
    private Long studentNumber;
    private String course;
    private Mark mark;

    public Student(String name, Long studentNumber, String course) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.course = course;
    }

    public Student(String name, Long studentNumber, String course, Mark mark) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.course = course;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(Long studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Mark getMark() {
        return mark;
    }

    public void setMark(Mark mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentNumber=" + studentNumber +
                ", course='" + course + '\'' +
                ", mark=" + mark +
                '}';
    }
}
