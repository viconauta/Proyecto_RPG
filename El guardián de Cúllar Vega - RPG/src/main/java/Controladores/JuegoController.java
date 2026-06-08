package Controladores;

import Clases.*;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class JuegoController {

    private Jugador jugador;
    private Historia historia;
    private int salaIndex = 0;

    private Sala salaActual;
    private Enemigo enemigoActual;

    @FXML private TextArea txtHistoria;
    @FXML private TextArea txtLog;

    @FXML private Label lblVidaJugador;
    @FXML private Label lblAtaqueJugador;

    @FXML private Label lblNombreEnemigo;
    @FXML private Label lblVidaEnemigo;
    @FXML private Label lblAtaqueEnemigo;
    @FXML private ImageView imgEnemigo;

    @FXML private Button btnAtacar; // <-- Añadido
    @FXML private Button btnDefender; // <-- Añadido
    @FXML private Button btnContinuar; // <-- Añadido para controlarlo
    @FXML private Button btnFinalizar;


    @FXML
    public void initialize() {
        jugador = new Jugador("Antonio");

        try {
            historia = new Historia(
                    Ruta.RUTA_RESOURCES + Ruta.RUTA_SALAS,
                    Ruta.RUTA_RESOURCES + Ruta.RUTA_JEFES,
                    Ruta.RUTA_RESOURCES + Ruta.RUTA_ENEMIGO
            );
        } catch (Exception e) {
            txtLog.appendText("Error cargando historia\n");
        }

        cargarSala(0);
    }

    private void cargarSala(int index) {
        salaIndex = index;
        jugador.setVida(100 + (jugador.getNivel() * 5));


        if (salaIndex >= historia.getSalas().size()) {
            txtHistoria.setText("¡Has completado TODAS las salas!\nEres un campeón.");
            btnAtacar.setDisable(true); // Desactivar botones si el juego termina
            btnDefender.setDisable(true);
            btnContinuar.setDisable(true);
            btnFinalizar.setVisible(true);
            return;
        }

        salaActual = historia.getSalas().get(salaIndex);
        enemigoActual = salaActual.getEnemigo();

        txtHistoria.setText(
                "Sala " + salaActual.getId_sala() + "\n\n" +
                        salaActual.getDescripcion() + "\n\n" +
                        salaActual.getHistoria()
        );

        txtLog.clear();
        actualizarUI();

        // Habilitar botones de combate al cargar una nueva sala
        btnAtacar.setDisable(false);
        btnDefender.setDisable(false);
        btnContinuar.setDisable(true); // Continuar deshabilitado hasta derrotar al enemigo
        btnFinalizar.setVisible(false);
    }

    private void actualizarUI() {
        lblVidaJugador.setText("Vida: " + jugador.getVida());
        lblAtaqueJugador.setText("Ataque: " + jugador.getAtaque());

        lblNombreEnemigo.setText(enemigoActual.getNombre());
        lblVidaEnemigo.setText("Vida: " + enemigoActual.getVida());
        lblAtaqueEnemigo.setText("Ataque: " + enemigoActual.getAtaque());

        // Cargar la imagen del enemigo
        try {
            Image enemyImage = new Image(getClass().getResourceAsStream("/" + Ruta.RUTA_IMAGENES_ENEMIGOS + enemigoActual.getId() + ".png"));
            imgEnemigo.setImage(enemyImage);
        } catch (Exception e) {
            System.err.println("Error cargando imagen del enemigo: " + enemigoActual.getId() + ".png" + e.getMessage());
            // Puedes poner una imagen por defecto si falla la carga
            // imgEnemigo.setImage(new Image(getClass().getResourceAsStream("/img/default_enemy.png")));
        }
    }

    @FXML
    public void atacar() {
        if (!jugador.estaVivo()) {
            txtLog.appendText("Has muerto. Fin del juego.\n");
            btnAtacar.setDisable(true);
            btnDefender.setDisable(true);
            btnContinuar.setDisable(true);
            btnFinalizar.setVisible(true);
            return;
        }


        jugador.atacar(enemigoActual);
        txtLog.appendText("Atacaste a " + enemigoActual.getNombre() + "\n");

        if (!enemigoActual.estaVivo()) {
            txtLog.appendText("¡Has derrotado al enemigo!\n");
            salaActual.setCompletada(true);

            jugador.ganarExp(salaActual.getRecompensa());
            txtLog.appendText("Ganaste " + salaActual.getRecompensa() + " EXP.\n");

            // Desactivar botones de combate y activar continuar
            btnAtacar.setDisable(true);
            btnDefender.setDisable(true);
            btnContinuar.setDisable(false);

            return;
        }

        enemigoActual.atacar(jugador);
        txtLog.appendText(enemigoActual.getNombre() + " te atacó.\n");

        if (!jugador.estaVivo()) {
            txtLog.appendText("Has muerto. Fin del juego.\n");
            btnAtacar.setDisable(true);
            btnDefender.setDisable(true);
            btnContinuar.setDisable(true);
            btnFinalizar.setVisible(true);
        }

        actualizarUI();
    }

    @FXML
    public void defender() {
        if (!jugador.estaVivo()) {
            txtLog.appendText("Has muerto. Fin del juego.\n");
            btnAtacar.setDisable(true);
            btnDefender.setDisable(true);
            btnContinuar.setDisable(true);
            btnFinalizar.setVisible(true);
            return;
        }


        jugador.defender();
        txtLog.appendText("Te pones en posición defensiva.\n");

        enemigoActual.atacar(jugador);
        txtLog.appendText(enemigoActual.getNombre() + " te atacó.\n");

        if (!jugador.estaVivo()) {
            txtLog.appendText("Has muerto. Fin del juego.\n");
            btnAtacar.setDisable(true);
            btnDefender.setDisable(true);
            btnContinuar.setDisable(true);
            btnFinalizar.setVisible(true);
        }

        actualizarUI();
    }

    @FXML
    public void continuar() {
        if (!salaActual.getCompletada()) {
            txtLog.appendText("No puedes avanzar. El enemigo sigue vivo.\n");
            return;
        }

        cargarSala(salaIndex + 1);
    }

    @FXML
    public void finalizar() {
        try {
            org.App.setRoot("menu");
        } catch (Exception e) {
            txtLog.appendText("Error al volver al menú.\n");
        }
    }

}