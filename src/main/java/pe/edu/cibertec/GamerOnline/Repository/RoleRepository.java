package pe.edu.cibertec.GamerOnline.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.GamerOnline.Models.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
}
