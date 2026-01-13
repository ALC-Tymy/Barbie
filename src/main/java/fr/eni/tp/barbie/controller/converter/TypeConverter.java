package fr.eni.tp.barbie.controller.converter;

import fr.eni.tp.barbie.bo.Type;
import fr.eni.tp.barbie.service.ServiceType;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;


/**
 * Convertisseur Spring permettant de transformer une chaîne de caractères
 * contenant l'identifiant d'un {@link Type} en objet {@link Type}.
 * <p>
 * Utilisé lors du binding des paramètres de formulaire ou d'URL
 * vers des objets métier.
 */
@Component
public class TypeConverter implements Converter<String, Type> {

    private ServiceType serviceType;

    /**
     * Constructeur avec injection du service métier.
     *
     * @param serviceType le service permettant d'accéder aux types en base de données
     */
    public TypeConverter(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    /**
     * Convertit une chaîne représentant un identifiant en objet {@link Type}.
     *
     * @param source l'identifiant du type sous forme de chaîne
     * @return le Type correspondant à l'identifiant
     * @throws NumberFormatException si la chaîne ne contient pas un nombre valide
     */
    @Override
    public Type convert(String source) {
        long id = Long.parseLong(source);
        return serviceType.getType(id);
    }
}








