package chatapp.DataBase;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import chatapp.Models.User;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

/*public interface UserRepository extends CrudRepository<User, Integer>
{
    List<User> findUserById(Integer id);
    List<User> findUserByName(@Param("name") String name);
}*/

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {}