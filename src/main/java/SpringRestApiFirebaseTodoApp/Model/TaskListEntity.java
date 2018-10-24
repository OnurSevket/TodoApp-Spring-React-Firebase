package SpringRestApiFirebaseTodoApp.Model;


import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import java.util.Set;

public class TaskListEntity {
    private Long Id;
    private Set<TaskEntity> tasks;

    public TaskListEntity() {
    }

    public TaskListEntity(Long id, Set<TaskEntity> tasks) {
        Id = id;
        this.tasks = tasks;
    }

    public Long getTaskListId(){return Id;}

    @ManyToOne
    @JoinTable(name = "tak", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    public Set<TaskEntity> getTasks(){return tasks;}

    @Override
    public String toString() {
        return "TaskListEntity{" +
                "Id=" + Id +
                ", tasks=" + tasks +
                '}';
    }
}
