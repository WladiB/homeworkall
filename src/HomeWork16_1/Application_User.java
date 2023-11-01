package HomeWork16_1;

public class Application_User {

    public static void main(String[] args) {

        User user1 = new User("Sergej", 35, "sergej@exe.com");

        User user2 = new User("Svetlana", 44, "sveta@exe.com");

        System.out.println("User 1:");
        System.out.println("Name: " + user1.getName());
        System.out.println("Age: " + user1.getAge());
        System.out.println("Email: " + user1.getEmail());

        System.out.println("User 2:");
        System.out.println("Name: " + user2.getName());
        System.out.println("Age: " + user2.getAge());
        System.out.println("Email: " + user2.getEmail());

        System.out.println();

        user2.setEmail("susiALL@exe.com");


        System.out.println("Updated information about the first user:");
        System.out.println("Name: " + user1.getName());
        System.out.println("Age: " + user1.getAge());
        System.out.println("Email: " + user1.getEmail());

        System.out.println("Updated information about the second user:");
        System.out.println("Name: " + user2.getName());
        System.out.println("Age: " + user2.getAge());
        System.out.println("Email: " + user2.getEmail());
    }
}