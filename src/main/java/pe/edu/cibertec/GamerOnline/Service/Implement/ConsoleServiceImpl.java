package pe.edu.cibertec.GamerOnline.Service.Implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.GamerOnline.Models.Console;
import pe.edu.cibertec.GamerOnline.Repository.ConsoleRepository;
import pe.edu.cibertec.GamerOnline.Service.ConsoleService;
import java.util.List;

@Service
public class ConsoleServiceImpl implements ConsoleService {

    @Autowired
    ConsoleRepository consoleRepository;

    @Override
    public List<Console> listAllConsoles() {
        return consoleRepository.findAll();
    }

    @Override
    public Console listOneConsole(Integer idConsole) {
        return consoleRepository.findById(idConsole).get();
    }

    @Override
    public Console saveConsole(Console console) {
        return consoleRepository.save(console);
    }

    @Override
    public void deleteConsole(Integer idConsole) {
        consoleRepository.deleteById(idConsole);
    }
}
