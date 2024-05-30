package nullLabel.before;

public class Label {
    private String label;

    public Label(String label) {
        this.label = label;
    }
    public void display() {
        System.out.println("display : " + label);
    }

    @Override
    public String toString() {
        return "\"" + label + "\"";
    }
}
