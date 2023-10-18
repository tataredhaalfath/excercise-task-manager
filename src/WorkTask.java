import java.time.LocalDate;

public class WorkTask extends Task {
  private Department department;

  public WorkTask(String title, String description, LocalDate dueDate, Department department) {
    super(title, description, dueDate);
    this.department = department;
  }

  public Department getDepartment() {
    return department;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + ((department == null) ? 0 : department.hashCode());
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
    WorkTask other = (WorkTask) obj;
    if (department != other.department)
      return false;
    return true;
  }

}
