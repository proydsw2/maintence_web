package pe.edu.cibertec.GamerOnline.Service;

import pe.edu.cibertec.GamerOnline.Models.Console;

import java.util.List;

public interface ConsoleService {

    public List<Console> listAllConsoles();

    public Console listOneConsole(Integer idConsole);

    public Console saveConsole(Console console);

    public void deleteConsole(Integer idConsole);
}
