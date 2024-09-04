import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private String name;
    private String subject;
    private int experience;
    private List<Student> students; // 할당은 보통 생성자를 통해 한다.

    public Teacher(String name, String subject, int experience) {
        this.name = name;
        this.subject = subject;
        this.experience = experience;
        students = new ArrayList<>(); // 초기화 작업
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    // method
    public void addStudents(Student student) {
        students.add(student);
        student.setT(this); // 해당 클래스의 값을 넘겨줌. (학생에게 교사를 할당)
    }

    public void showStudents() {
        System.out.println(name + " teaches tthe following student:");
        for(Student s : students) {
            System.out.println("- " + s.getName());
        }
    }

    public void showInfo() {
        System.out.println("Teacher Name: " + name);
        System.out.println("Subject: " + subject);
        System.out.println("Experience: " + experience);

    }

    public void teach() {
        System.out.println(name + " is teaching " + subject);
    }
}
