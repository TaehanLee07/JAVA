package removeControlflag.after;

public class FindIntMain {
    public static void main(String[] args) {
        int data[] = {1,2,3,4,5,6,7,8,9,10};

        if (FindInt.find(data,10)) {
            System.out.println("found!");
        }else
            System.out.println("Not found");
    }
}
