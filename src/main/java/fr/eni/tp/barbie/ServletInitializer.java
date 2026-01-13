package fr.eni.tp.barbie;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Classe d'initialisation de l'application pour un déploiement sous forme de WAR
 * dans un serveur de type Servlet (Tomcat, Jetty, etc.).
 * <p>
 * Elle permet de configurer le point d'entrée Spring Boot lors du déploiement
 * sur un serveur externe.
 */
public class ServletInitializer extends SpringBootServletInitializer {

    /**
     * Configure l'application Spring lors de son initialisation par le conteneur
     * de servlets.
     *
     * @param application le builder Spring
     * @return le builder configuré avec la classe principale {@link BarbieApplication}
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(BarbieApplication.class);
    }

}
