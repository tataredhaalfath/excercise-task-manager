import java.util.ArrayList;
import java.util.List;

public class User {
  private String username;
  private List<Task> task;

  public User(String username) {
    this.username = username;
    this.task = new ArrayList<>();
  }

  public void addTask(Task task) {
    this.task.add(task);
  }

  public void getMyTask() {
    for (Task task : this.task) {
      System.out.println(task);
    }
  }

  public void getDetail() {

  }

  public String getUsername() {
    return username;
  }

  @Override
  public String toString() {
    return "User : [username=" + username + ", task=" + task + "]";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((username == null) ? 0 : username.hashCode());
    result = prime * result + ((task == null) ? 0 : task.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    User other = (User) obj;
    if (username == null) {
      if (other.username != null)
        return false;
    } else if (!username.equals(other.username))
      return false;
    if (task == null) {
      if (other.task != null)
        return false;
    } else if (!task.equals(other.task))
      return false;
    return true;
  }

  // public void getSpesificTask(TaskType taskType) {
  // List<Task> result = this.task.stream().filter(t ->
  // t.getTaskType().equals(taskType)).toList();
  // int no = 1;
  // System.out.println("\n========== " + taskType + " ==========\n");
  // for (Task task : result) {
  // System.out.println("Task No : " + no);
  // System.out.println("Username : " + this.username);
  // System.out.println(task);
  // no++;
  // }
  // }

}
