package challenge.database.programming_challenge;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ResponseRepository extends CrudRepository<Customer,Integer>{
    @Query(value="SELECT c.email_address FROM customers c where c.email_address = :email", nativeQuery=true)
    public String findEmail(@Param("email") String email);
}
