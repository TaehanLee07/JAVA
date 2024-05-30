package nullLabel.before;

public class Person {
    private Label name;
    private Label mail;

    public Person(Label name, Label mail) {
        this.name = name;
        this.mail = mail;
    }

    public Person(Label name) {
        this(name, null);
    }
    public void display() {
        if (name != null) {
            name.display();
        }
        if (mail != null) {
            mail.display();
        }
    }

    @Override
    public String toString() {
        String result = "[ Person :";

        result += " name = ";
        if (name == null) {
            result += "\"(none)\"";
        }else {
            result += name;
        }

        result += " mail ";
        if (mail == null) {
            result += "\"(none)\"";
        }else {
            result += mail;
        }

        result += "]";

        return result;
    }
}
