package lt.viko.eif.atalalaite.webserviceclient.services;

import lt.viko.eif.atalalaite.webserviceclient.menu.UserMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunnerInput implements CommandLineRunner {
    @Autowired
    private UserMenu userMenu;

    @Override
    public void run(String... args) throws Exception{
        userMenu.showMenu();
    }
}
