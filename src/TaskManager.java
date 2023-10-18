import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
  List<Task> tasks;
  List<User> users;

  public TaskManager() {
    this.tasks = new ArrayList<>();
    this.users = new ArrayList<>();
  }

  // Add new user list
  public void addUser(User user) {
    this.users.add(user);
  }

  // Add new task list
  public void addTask(Task task) {
    this.tasks.add(task);
  }

  // Remove user from list
  public void removeUser(User user) {
    if (!this.isUserExist(user)) {
      // throw exception
      throw new UserExistException("User not found : " + user.getUsername());
    }
    this.users.remove(user);

  }

  // Remove task from list
  public void removeTask(Task task) {
    if (!this.isTaskExist(task)) {
      // throw exception
      throw new TaskExistException("Task not found : " + task.getTitle());
    }

    this.tasks.remove(task);
  }

  // Assign task to user
  public void assignTaskToUser(Task task, User user) {
    this.removeTask(task); // remove task from list
    User existingUser = this.getUser(user);
    existingUser.addTask(task); // assign to user
  }

  public void getUserTask(User user) {

    User existingUser = this.getUser(user);
    existingUser.getMyTask();

  }

  private User getUser(User user) {
    if (!this.isUserExist(user)) {
      throw new UserExistException("User not found : " + user.getUsername());
      // System.out.println("User not found : " + user);
    }
    return this.users.stream().filter(existingUser -> existingUser.equals(user)).collect(Collectors.toList()).get(0);
  }

  // check user exist in the user list
  private boolean isUserExist(User user) {
    return this.users.contains(user);
  }

  // check task exist in the task list
  private boolean isTaskExist(Task task) {
    return this.tasks.contains(task);
  }

  public List<Task> getTasks() {
    return this.tasks;
  }

  public List<User> getUsers() {
    return this.users;
  }

}
