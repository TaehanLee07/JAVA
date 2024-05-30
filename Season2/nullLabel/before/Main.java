package nullLabel.before;

public class Main {
    public static void main(String[] args) {
        Person people[] = {
                new Person(new Label("Alice"), new Label("alice@aaa.com")),
                new Person(new Label("James"), new Label("james@bbb.com")),
                new Person(new Label("Tomas"))
        };
        for (Person person : people) {
            System.out.println(person.toString());
            person.display();
            System.out.println();
        }
    }
}
