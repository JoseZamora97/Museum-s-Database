package com.include.prac_distribuidos.Controllers;

import com.include.prac_distribuidos.Classes.Coin;
import com.include.prac_distribuidos.Classes.Provider;
import com.include.prac_distribuidos.Classes.Type;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class DatabaseController {

    String selection = "coins";

    List<Coin> coins;
    List<Provider> providers;
    List<Type> types;

    @RequestMapping("/")
    public String initializer (Model model){

        Type type = new Type(1, "euros",
                20, Arrays.asList("hierro","cobre"), "Moneda de prueba");
        Provider provider = new Provider("06632454J", "Jose", "Direccion",
                "@jose.com", "657 55 55 55");

        if (selection.equals("coins")){
            coins = new ArrayList<>();
            for(int i = 0; i < 7; i++)
                coins.add(new Coin(type, 1999, "Madrid", new Date(i),"Bueno",provider));
            model.addAttribute("coins" , coins);
        }
        else if(selection.equals("providers")){
            providers = new ArrayList<>();
            for(int i = 0; i < 8; i++)
                providers.add(provider);
            model.addAttribute("providers" , providers);
        }
        else if(selection.equals("models")){
            types = new ArrayList<>();
            for(int i = 0; i < 10; i++)
                types.add(type);
            model.addAttribute("types" , types);
        }
        else{
            return null;
        }



        model.addAttribute("selection", selection);


        return "explorer_database";
    }
}
