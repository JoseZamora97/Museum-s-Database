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

    static final String SELECTION = "selection";
    static final String COINS = "coins";
    static final String PROVIDERS = "providers";
    static final String MODELS = "types";

    static String selection;

    static List<Coin> coins;
    static List<Provider> providers;
    static List<Type> types;

    @RequestMapping("/") /* TODO: aqui inicializaria la pagina de inicio */
    public String initializer (Model model){

        initBD();

        if (selection == null)
            selection = COINS;

        switch (selection) {
            case COINS:
                model.addAttribute(COINS, coins);
                break;
            case PROVIDERS:
                model.addAttribute(PROVIDERS, providers);
                break;
            case MODELS:
                model.addAttribute(MODELS, types);
                break;
            default:
                return null;
        }

        model.addAttribute(SELECTION, selection);
        return "explorer_database";
    }

    public static void initBD(){

        Type type = new Type(1, "euros",
                20, Arrays.asList("hierro","cobre"), "Moneda de prueba");
        Provider provider = new Provider("06632454J", "Jose", "Direccion",
                "@jose.com", "657 55 55 55");

        coins = new ArrayList<>();
        for (int i = 0; i < 7; i++)
            coins.add(new Coin(type, 1999, "Madrid", new Date(i), "Bueno", provider));
        providers = new ArrayList<>();
        for (int i = 0; i < 8; i++)
            providers.add(provider);
        types = new ArrayList<>();
        for(int i =0; i<6; i++)
            types.add(type);
    }
}
