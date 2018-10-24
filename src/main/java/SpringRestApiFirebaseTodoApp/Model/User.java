package SpringRestApiFirebaseTodoApp.Model;


import javax.persistence.*;
import java.util.Set;


@Entity
public class User  {
    private Long id;
    private String username;
    private String email;
    private String password;
    private String passwordConfirm;
    private Set<TaskListEntity> taskListEntities;

    public User() {
    }

    public User(Long id, String username, String email, String password, String passwordConfirm, Set<TaskListEntity> taskListEntities) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.passwordConfirm = passwordConfirm;
        this.taskListEntities = taskListEntities;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Transient
    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", passwordConfirm='" + passwordConfirm + '\'' +
                ", taskListEntities=" + taskListEntities +
                '}';
    }
}
