package SpringRestApiFirebaseTodoApp.Repository;

import SpringRestApiFirebaseTodoApp.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsername(String name);

}
