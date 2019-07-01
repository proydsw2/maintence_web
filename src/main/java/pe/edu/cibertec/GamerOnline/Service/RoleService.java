package pe.edu.cibertec.GamerOnline.Service;

import pe.edu.cibertec.GamerOnline.Models.Role;

import java.util.List;

public interface RoleService {

    public List<Role> listAllRoles();

    public Role listOneRole(Integer idRole);

    public Role saveRole(Role role);

    public void deleteRole(Integer idRole);
}
