package com.include.prac_distribuidos.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProviderController {
    @RequestMapping("/providers")
    public String show(Model model) {   /* Todo Cargar los proveedores */
        DatabaseController.selection = DatabaseController.PROVIDERS;
        model.addAttribute(DatabaseController.SELECTION, DatabaseController.PROVIDERS);
        return "explorer_database";
    }

    @RequestMapping("/new_provider")
    public String newProvider(Model model){
        model.addAttribute(DatabaseController.SELECTION, DatabaseController.PROVIDERS);
        return "input_form_database";
    }
}
