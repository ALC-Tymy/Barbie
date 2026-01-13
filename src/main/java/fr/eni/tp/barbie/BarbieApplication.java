package fr.eni.tp.barbie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Classe principale de démarrage de l'application Spring Boot Barbie.
 * <p>
 * Elle contient la méthode {@code main} qui lance le contexte Spring
 * et initialise l'ensemble des composants de l'application.
 */
@SpringBootApplication
public class BarbieApplication {

    /**
     * Point d'entrée de l'application.
     *
     * @param args arguments passés au lancement de l'application
     */
    public static void main(String[] args) {
        SpringApplication.run(BarbieApplication.class, args);
    }

}
