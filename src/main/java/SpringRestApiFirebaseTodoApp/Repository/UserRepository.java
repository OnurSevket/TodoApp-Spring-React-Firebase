package SpringRestApiFirebaseTodoApp.Repository;

import SpringRestApiFirebaseTodoApp.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsername(String name);

}
