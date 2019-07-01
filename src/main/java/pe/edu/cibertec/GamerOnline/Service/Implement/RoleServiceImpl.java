package pe.edu.cibertec.GamerOnline.Service.Implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.GamerOnline.Models.Role;
import pe.edu.cibertec.GamerOnline.Repository.RoleRepository;
import pe.edu.cibertec.GamerOnline.Service.RoleService;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleRepository roleRepository;

    @Override
    public List<Role> listAllRoles() {
        return roleRepository.findAll();
    }

    @Override
    public Role listOneRole(Integer idRole) {
        return roleRepository.findById(idRole).get();
    }

    @Override
    public Role saveRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public void deleteRole(Integer idRole) {
        roleRepository.deleteById(idRole);
    }
}
