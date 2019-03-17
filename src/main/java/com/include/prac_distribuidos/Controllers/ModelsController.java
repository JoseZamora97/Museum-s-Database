package com.include.prac_distribuidos.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ModelsController {
    @RequestMapping("/models")
    public String show(Model model) {   /* Todo Cargar los modelos */
        DatabaseController.selection = DatabaseController.MODELS;
        model.addAttribute(DatabaseController.SELECTION, DatabaseController.MODELS);
        return "explorer_database";
    }

    @RequestMapping("/new_model")
    public String newModel(Model model){
        model.addAttribute(DatabaseController.SELECTION, DatabaseController.MODELS);
        return "input_form_database";
    }
}
