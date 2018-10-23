package SpringRestApiFirebaseTodoApp.Model;

import java.io.Serializable;
import java.util.Date;

public class TaskEntity implements Serializable {
    private Long Id;
    private String Name;
    private String Description;
    private Date Deadline;
    private boolean Status;
/*Each to-do item should have a name, description, deadline, and status.*/

    public Long getTaskId(){
        return Id;
    }

    public void setTaskId(Long taskId) {
        this.Id = taskId;
    }

    public String getTaskName() {
        return Name;
    }

    public void setTaskName(String taskName) {
        this.Name = taskName;
    }

    public boolean isCompleted() {
        return Status;
    }

    public void setCompleted(boolean taskStatus) {
        this.Status = Status;
    }

    public Date getDeadLine() {
        return Deadline;
    }

    public void setDeadLine(Date taskDeadLine) {
        this.Deadline = taskDeadLine;
    }


}
