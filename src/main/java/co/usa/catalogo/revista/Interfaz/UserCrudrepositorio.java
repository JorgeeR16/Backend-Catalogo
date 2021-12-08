package co.usa.catalogo.revista.Interfaz;



import co.usa.catalogo.revista.Modelos.User;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface UserCrudrepositorio extends CrudRepository<User, Integer>{
    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email, String password);
}
