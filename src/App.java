import java.time.LocalDate;

public class App {
  public static void main(String[] args) throws Exception {
    // Task Management System
    Task taskOne = new WorkTask("Feature Auth", "Fitur untuk login dan authentication", LocalDate.now(),
        Department.DEVELOPMENT);
    Task taskTwo = new WorkTask("Send OTP", "Fitur send otp to falivate forget password", LocalDate.now(),
        Department.DEVELOPMENT);
    Task taskThree = new PersonalTask("Bug Fix Trx", "Bug fix request transaction nominal doesnt match",
        LocalDate.now(),
        Priority.HIGHT);
    Task taskFourth = new PersonalTask("Presentasi", "Presentasi aplikasi",
        LocalDate.now(),
        Priority.HIGHT);

    User redha = new User("redha");
    User alfath = new User("alfath");
    User doma = new User("doma");

    // redha.addTask(taskOne);
    // redha.addTask(taskTwo);
    // redha.addTask(taskThree);
    // redha.getMyTask();

    TaskManager system = new TaskManager();
    system.addTask(taskOne);
    system.addTask(taskTwo);
    system.addTask(taskThree);
    system.addTask(taskFourth);

    system.addUser(redha);
    system.addUser(alfath);
    system.addUser(doma);

    // List of task
    System.out.println("===== List Of Task =====");
    System.out.println(system.getTasks());
    System.out.println("===== End List Of Task =====\n");

    // List of task
    System.out.println("===== List Of User =====");
    System.out.println(system.getUsers());
    System.out.println("===== End List Of User =====\n");

    // assign task to users
    system.assignTaskToUser(taskOne, redha);
    system.assignTaskToUser(taskTwo, alfath);
    system.assignTaskToUser(taskThree, doma);
    system.assignTaskToUser(taskFourth, doma); // doma have 2 task

    System.out.println("\n=============== FINAL RESULT ===============\n");
    // List of task
    System.out.println("===== New List Of Task =====");
    System.out.println(system.getTasks());
    System.out.println("===== End New List Of Task =====\n");

    // List of task
    System.out.println("===== New List Of User =====");
    System.out.println(system.getUsers());
    System.out.println("===== End New List Of User =====\n");

    // Remove User
    try {
      system.removeUser(doma);
    } catch (UserExistException error) {
      System.out.println(error.getMessage());
    }
    System.out.println("\n===== New List Of User =====");
    System.out.println(system.getUsers());
  }
}
