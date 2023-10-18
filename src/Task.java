import java.time.LocalDate;

public class Task {
  private String title;
  private String description;
  private LocalDate dueDate;
  private boolean isComplete;

  protected Task(String title, String description, LocalDate dueDate) {
    this.title = title;
    this.description = description;
    this.dueDate = dueDate;
    this.isComplete = false;
  }

  public String getTitle() {
    return title;
  }

  public String getDescription() {
    return description;
  }

  public LocalDate getDueDate() {
    return dueDate;
  }

  public boolean getIsComplete() {
    return isComplete;
  }

  @Override
  public String toString() {
    return "Task : [title=" + title + ", description=" + description + ", dueDate=" + dueDate + ", isComplete="
        + isComplete + "]\n";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((title == null) ? 0 : title.hashCode());
    result = prime * result + ((description == null) ? 0 : description.hashCode());
    result = prime * result + ((dueDate == null) ? 0 : dueDate.hashCode());
    result = prime * result + (isComplete ? 1231 : 1237);
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
    Task other = (Task) obj;
    if (title == null) {
      if (other.title != null)
        return false;
    } else if (!title.equals(other.title))
      return false;
    if (description == null) {
      if (other.description != null)
        return false;
    } else if (!description.equals(other.description))
      return false;
    if (dueDate == null) {
      if (other.dueDate != null)
        return false;
    } else if (!dueDate.equals(other.dueDate))
      return false;
    if (isComplete != other.isComplete)
      return false;
    return true;
  }

}
