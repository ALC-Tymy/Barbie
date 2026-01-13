package fr.eni.tp.barbie.controller;

import fr.eni.tp.barbie.service.ServiceBarbie;
import fr.eni.tp.barbie.service.ServiceType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    private ServiceBarbie serviceBarbie;
    private ServiceType serviceType;

    /**
     * Constructeur du contrôleur.
     *
     * @param serviceBarbie service de gestion des barbies
     * @param serviceType   service de gestion des types
     */
    public HomeController(ServiceBarbie serviceBarbie, ServiceType serviceType) {
        this.serviceBarbie = serviceBarbie;
        this.serviceType = serviceType;
    }

    /**
     * Affiche la page d'accueil.
     *
     * @return le nom de la vue "index"
     */
    @GetMapping("/")
    public String index() {
        return "index";
    }

    /**
     * Affiche la liste de toutes les barbies.
     *
     * @param model objet permettant de transmettre les données à la vue
     * @return la vue "barbies"
     */
    @GetMapping("/barbies")
    public String displayBarbies(Model model) {
        model.addAttribute("listBarbiesAll", this.serviceBarbie.getAll());
        return "barbies";
    }

    /**
     * Affiche le détail d'une barbie en fonction de son identifiant.
     *
     * @param id    identifiant de la barbie
     * @param model objet permettant de transmettre les données à la vue
     * @return la vue de détail de la barbie
     */
    @GetMapping("/barbie/details")
    public String displayBarbiesByID(@RequestParam(name = "id") long id, Model model) {
        model.addAttribute("listBarbiesByID", this.serviceBarbie.getBarbie(id));
        return "views_barbies_details";
    }

    /**
     * Supprime une barbie à partir de son identifiant.
     *
     * @param id    identifiant de la barbie à supprimer
     * @param model objet permettant de transmettre les données à la vue
     * @return redirection vers la page listant toutes les barbies
     */
    @GetMapping("/barbie/delete")
    public String deleteBarbieById(@RequestParam(name = "id") long id, Model model) {
        model.addAttribute("deleteBarbieByID", this.serviceBarbie.deleteBarbie(id));
        return "redirect:/barbies";
    }

    /**
     * Affiche la liste de tous les types de barbies.
     *
     * @param model objet permettant de transmettre les données à la vue
     * @return la vue "types"
     */
    @GetMapping("/types")
    public String displayTypes(Model model) {
        model.addAttribute("listTypesAll", this.serviceType.getAll());
        return "types";
    }

    /**
     * Supprime une barbie à partir de son identifiant
     *
     * @param id    identifiant de la barbie à supprimer
     * @param model objet permettant de transmettre les données à la vue
     * @return redirection vers la page listant  tous les types de barbies
     */

    @GetMapping("/types/delete")
    public String deleteTypeById(@RequestParam(name = "id") long id, Model model) {
        model.addAttribute("deleteTypesById", this.serviceType.deleteType(id));
        return "redirect:/types";
    }

    @PostMapping("/barbie/add")
    public String addBarbies(){
        return "redirect:/barbies";
    }

    @PostMapping("/types/add")
    public String addTypes(){
        return "redirect:/types";
    }


}
