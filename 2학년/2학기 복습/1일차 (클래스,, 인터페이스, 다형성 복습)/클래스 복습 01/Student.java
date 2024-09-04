public class Student {
    private String name;
    private int grade;
    private String studentId;
    private Teacher t;

    public Student(String name, int grade, String studentId) {
        this.name = name;
        this.grade = grade;
        this.studentId = studentId;
    }

    // 교사 설정 getter & setter
    public Teacher getT() {
        return t;
    }

    public void setT(Teacher t) {
        this.t = t;
    }

    // studentId 의 경우 값이 바뀌면 안되기에 getter 만 선언

    public String getStudentId() {
        return studentId;
    }

    // 나머지 필드값은 getter & setter 생성


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    // methods
    public void study() {
        System.out.println(name + " is Studying.");
    }

    public void showInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("StudentId: " + studentId);

        if (t != null)
            System.out.println("Teacher: " + t.getName());
        else
            System.out.println("No Teacher  Asigned.");

    }
}
