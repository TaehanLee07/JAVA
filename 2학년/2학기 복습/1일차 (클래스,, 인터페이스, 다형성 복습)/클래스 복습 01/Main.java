package Teachers_reviewClass;

public class Main {
    public static void main(String[] args) {
        // student 객체 생성
        Student student1 = new Student("Alice", 10, "S12345");
        Student student2 = new Student("Bob", 11, "S54321");
        Student student3 = new Student("Charlie", 12, "S67890");

        // teacher 객체 생성
        Teacher teacher1 = new Teacher("Mr Smith", "Math", 5);
        Teacher teacher2 = new Teacher("Ms JohnSon", "English", 10);

        // 교사에게 학생 추가
        teacher1.addStudents(student1);
        teacher1.addStudents(student2);
        teacher2.addStudents(student3);

        // 정보 출력
        System.out.println("=== Teacher Info ===");
        teacher1.showInfo();
        teacher1.showStudents();
        teacher1.teach();

        System.out.println("=== === ===");

        teacher2.showInfo();
        teacher2.showStudents();
        teacher2.teach();

        System.out.println("\n===Student Info===");
        student1.showInfo();
        System.out.println();
        student2.showInfo();
        System.out.println();
        student3.showInfo();
    }
}
