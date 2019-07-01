package pe.edu.cibertec.GamerOnline.Service;

import pe.edu.cibertec.GamerOnline.Models.User;

import java.util.List;

public interface UserService {

    public List<User> listAllUsers();

    public User listOneUser(Integer idUser);

    public User saveUser(User user);

    public void deleteUser(Integer idUser);
}
