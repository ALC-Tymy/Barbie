package fr.eni.tp.barbie.controller;

import fr.eni.tp.barbie.service.ServiceBarbie;
import fr.eni.tp.barbie.service.ServiceType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    ServiceBarbie serviceBarbie;
    ServiceType serviceType;

    public HomeController(ServiceBarbie serviceBarbie, ServiceType serviceType) {
        this.serviceBarbie = serviceBarbie;
        this.serviceType = serviceType;
    }

    /*
     * @return la page d'acceuil
     */

    @GetMapping("/")
    public String index() {
        return "index";
    }

    /*
     * @return la page barbie et affiche toutes les barbies.
     */
    @GetMapping("/barbies")
    public String displayBarbies(Model model) {
        model.addAttribute("listBarbiesAll", this.serviceBarbie.getAll());
        return "barbies";
    }

    /*
     * @return retourne la vue le la page barbie détail en fonction de l'id.
     */

    @GetMapping("/barbie/details")
    public String displayBarbiesByID(@RequestParam(name = "id") long id, Model model) {
        model.addAttribute("listBarbiesByID", this.serviceBarbie.getBarbie(id));
        return "views_barbies_details";
    }

    /*
     * @return Supprime la barbie par l'id et retourne sur la page de la barbie
     */

    @GetMapping("/barbie/delete")
    public String deleteBarbieById(@RequestParam(name = "id") long id, Model model) {
        model.addAttribute("deleteBarbieByID", this.serviceBarbie.deleteBarbie(id));
        return "redirect:/barbies";
    }

    @GetMapping("/types")
    public String displayTypes(Model model) {
        model.addAttribute("listTypesAll", this.serviceType.getAll());
        return "redirect:/types";
    }









}
