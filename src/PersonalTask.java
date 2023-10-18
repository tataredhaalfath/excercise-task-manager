import java.time.LocalDate;

public class PersonalTask extends Task {
  private Priority priority;

  public PersonalTask(String title, String description, LocalDate dueDate, Priority priority) {
    super(title, description, dueDate);
    this.priority = priority;
  }

  public Priority getPriority() {
    return this.priority;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + ((priority == null) ? 0 : priority.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!super.equals(obj))
      return false;
    if (getClass() != obj.getClass())
      return false;
    PersonalTask other = (PersonalTask) obj;
    if (priority != other.priority)
      return false;
    return true;
  }

}
