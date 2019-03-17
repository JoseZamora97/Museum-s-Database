package com.include.prac_distribuidos.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CoinsController {
    @RequestMapping("/coins")
    public String show(Model model) {   /* Todo Cargar las monedas */
        DatabaseController.selection = DatabaseController.COINS;
        model.addAttribute(DatabaseController.SELECTION, DatabaseController.COINS);
        return "explorer_database";
    }

    @RequestMapping("/new_coin")
    public String newCoin(Model model){
        model.addAttribute(DatabaseController.SELECTION, DatabaseController.COINS);
        return "input_form_database";
    }

}
