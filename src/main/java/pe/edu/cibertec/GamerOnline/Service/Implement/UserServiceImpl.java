package pe.edu.cibertec.GamerOnline.Service.Implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.GamerOnline.Models.User;
import pe.edu.cibertec.GamerOnline.Repository.UserRepository;
import pe.edu.cibertec.GamerOnline.Service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> listAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User listOneUser(Integer idUser) {
        return userRepository.findById(idUser).get();
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(Integer idUser) {
        userRepository.deleteById(idUser);
    }
}
