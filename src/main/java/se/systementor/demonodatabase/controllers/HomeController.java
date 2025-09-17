package se.systementor.demonodatabase.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(Model model) {
        // TODO nu ska vi generera HTMLK för startsidan
        List<String> players = new ArrayList<>();
        players.add("John Doe");
        players.add("Jane Doe");
        players.add("Jack Doe");

        model.addAttribute("players", players);

        return "startpage";
    }
    @GetMapping("/profile")
    public String profile() {
        // TODO nu ska vi generera HTMLK för profile
        return "profile";
    }
}
