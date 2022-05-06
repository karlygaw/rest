package kz.narxoz.firstapp.rest.repository;


import kz.narxoz.firstapp.rest.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}