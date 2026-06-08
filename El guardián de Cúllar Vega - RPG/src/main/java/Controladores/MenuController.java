package Controladores;

import javafx.fxml.FXML;
import org.App;

public class MenuController {

    @FXML
    public void jugar() throws Exception {
        App.setRoot("juego");
    }

    @FXML
    public void salir() {
        System.exit(0);
    }
}