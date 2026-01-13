package fr.eni.tp.barbie.controller.converter;

import fr.eni.tp.barbie.bo.Barbie;
import fr.eni.tp.barbie.service.ServiceBarbie;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * Convertisseur Spring permettant de transformer une chaîne de caractères
 * contenant l'identifiant d'une Barbie en objet {@link Barbie}.
 * <p>
 * Ce convertisseur est utilisé notamment lors du binding des paramètres
 * de formulaire ou d'URL vers des objets métier.
 */
@Component
public class BarbieConverter implements Converter<String, Barbie> {

    private ServiceBarbie serviceBarbie;

    /**
     * Constructeur avec injection du service métier.
     *
     * @param serviceBarbie le service permettant d'accéder aux Barbies en base de données
     */
    public BarbieConverter(ServiceBarbie serviceBarbie) {
        this.serviceBarbie = serviceBarbie;
    }

    /**
     * Convertit une chaîne représentant un identifiant en objet {@link Barbie}.
     *
     * @param source l'identifiant de la Barbie sous forme de chaîne
     * @return la Barbie correspondant à l'identifiant
     * @throws NumberFormatException si la chaîne ne contient pas un nombre valide
     */
    @Override
    public Barbie convert(String source) {
        long id = Long.parseLong(source);
        return serviceBarbie.getBarbie(id);
    }
}
