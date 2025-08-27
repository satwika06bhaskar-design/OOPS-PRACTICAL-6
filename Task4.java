package tasks;
class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayRole() {
        System.out.println("I am a person.");
    }
}

// Student Class
class Studentz extends Person {
    Studentz(String name, int id) {
        super(name, id);
    }


    void displayRole() {
        System.out.println("I study.");
    }
}

// Faculty Class
class Faculty extends Person {
    Faculty(String name, int id) {
        super(name, id);
    }

    void displayRole() {
        System.out.println("I teach.");
    }
}


class Admin extends Person {
    Admin(String name, int id) {
        super(name, id);
    }


    void displayRole() {
        System.out.println("I manage administration tasks.");
    }
}


public class Task4 {
    public static void main(String[] args) {
        Person s = new Studentz("Alice", 101);
        Person f = new Faculty("Bob", 202);
        Person a = new Admin("Charlie", 303);

        s.displayRole();
        f.displayRole();
        a.displayRole();
    }
}
