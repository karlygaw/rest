package kz.narxoz.firstapp.rest.repository;
import kz.narxoz.firstapp.rest.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;



import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    //1-task
    List<User> findByEmailEndingWith(String email);
    // email=kz kz barlardy shygarady

    //2-task
    List<User> findTop2ByNameStartsWith(String task2);
    // task2=g, esimdegi arip

    //3-task
    List<User> findBySurnameContaining(String task3);
    //task3=familiadagy arip

    //native query
    //4-task
    @Query(value = "select * from users order by id asc", nativeQuery = true)
    List<User> findUsersByCustomQuery();
    //id osu retimen

    //5-task
    @Query(value = "select * from users order by id desc limit 2", nativeQuery = true)
    List<User> findLastInsertedId();
    // kemu retimen tolka 2ey

    //6-task
    @Query(value = "select * from users order by name desc", nativeQuery = true)
    List<User> findUsersOrderByNameDesc();
    // name kemu retimen//

    //7-task
     @Query( value="select *from users where email not like'%narxoz%'", nativeQuery = true)
    List <User> findByEmailNotContaining(String task7);
     // narxoz joktar

    //8-task
    @Query(value = "select * from users where name=surname", nativeQuery = true)
    List<User> findByNameEqualsSurname();
    // name surname ten

    //9-task
    @Query(value = "select * from users where email like '%narxoz.kz' or email like '%gmail.com' or email like '%gmail.com'", nativeQuery = true)
    List<User> findByEmailContains();
    // narxoz ben gmail barlardy shygarady

    //10-task
    @Query(value = "select distinct on (name) * from users", nativeQuery = true)
    List<User> findDistinctByName();
    // 2polzovateldin 1 alyp tastaidy
}