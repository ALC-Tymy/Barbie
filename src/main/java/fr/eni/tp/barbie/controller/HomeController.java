package fr.eni.tp.barbie.controller;

import fr.eni.tp.barbie.service.ServiceBarbieImpl;
import fr.eni.tp.barbie.service.ServiceTypeImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    ServiceBarbieImpl serviceBarbieImpl;
    ServiceTypeImpl serviceTypeImpl;

    public HomeController(ServiceBarbieImpl serviceBarbieImpl, ServiceTypeImpl serviceTypeImpl) {
        this.serviceBarbieImpl = serviceBarbieImpl;
        this.serviceTypeImpl = serviceTypeImpl;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }


}
