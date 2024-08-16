public class Application {
    String name;
    double age;
    double height;

    public Application(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void checkParameters () {
        if (this.name != null && this.age > 30 && this.height > 160) {
            System.out.println("User is older than 30 and taller than 160cm");
        } else {
            System.out.println("User is 30 (or younger) and 160cm (or shorter)");
        }

    }

    public static void main(String[] args) {
        Application firstApplicant = new Application("Adam", 40.5, 178);
        firstApplicant.checkParameters();
    }
}