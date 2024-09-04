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

        Person[] people = {teacher1, teacher2, student1, student2, student3};

        // 정보 출력
        printPersonInfo(people);
    }

    private static void printPersonInfo(Person[] people)  {;
        System.out.println("=== Person Info ===");
        for (Person person : people) {
            if (person instanceof Teacher) {
                person.showInfo();
                // 다운 캐스팅 복습을 위한 코드
                ((Teacher) person).showStudents();
                ((Teacher) person).teach();
                System.out.println();
            } else {
                person.showInfo();
                System.out.println();
            }
        }
    }

}
