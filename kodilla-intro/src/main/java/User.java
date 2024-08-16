public class User {
    String name;
    int age;
    int size;
    double averageAge;


    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }


    public static void main(String[] args) {

        User hannah = new User("Hannah", 29);
        User wendy = new User("Wendy", 46);
        User jack = new User("Jack", 33);
        User tom = new User("Tom", 89);
        User katie = new User("Katie", 17);
        User lena = new User("Lena", 9);
        User dani = new User("Dani", 24);
        User jamie = new User("Jamie", 26);

        User[] users = {hannah, wendy, jack, tom, katie, lena, dani, jamie};

        int sum = 0;
        for (int i = 0; i < users.length; i++) {
            sum += users[i].getAge();
        }

            double averageAge = sum / users.length;

        System.out.println("Users with age below the average:");

        for (int i = 0; i < users.length; i++) {

            if ( users[i].age < averageAge) {
                System.out.println(users[i].name + " " + users[i].age);
            }

        }

    }
}



