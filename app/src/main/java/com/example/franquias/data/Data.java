package com.example.franquias.data;

import com.example.franquias.R;
import com.example.franquias.model.Franchise;
import com.example.franquias.model.Restaurant;

import java.util.ArrayList;

public class Data {
    public static ArrayList<Franchise> initialLoad() {
        ArrayList<Franchise> franchises = new ArrayList<>();


        ArrayList<Restaurant> restaurant1 = new ArrayList<>();
        restaurant1.add(new Restaurant(
                "KFC",
                "Rua 25 de Março, 859",
                "São Paulo",
                R.drawable.kfc
        ));
        restaurant1.add(new Restaurant(
                "KFC",
                "AEROPORTO INTERNACIONAL DE GUARULHOS",
                "São Paulo",
                R.drawable.kfc
        ));
        restaurant1.add(new Restaurant(
                "KFC",
                "Av. Pres. Kennedy, 425",
                "Rio de Janeiro",
                R.drawable.kfc
        ));

        ArrayList<Restaurant> restaurant2 = new ArrayList<>();
        restaurant2.add(new Restaurant(
                "McDonald's",
                "Av. Me. Benvenuta, 687",
                "Florianópolis",
                R.drawable.mcdonalds
        ));
        restaurant2.add(new Restaurant(
                "McDonald's",
                "Rodovia BR 101 / s/n - Km 211 Cont. Park Shopping",
                "São José",
                R.drawable.mcdonalds
        ));
        restaurant2.add(new Restaurant(
                "McDonald's",
                "Av. Nereu Ramos, 4409",
                "Itapema",
                R.drawable.mcdonalds
        ));

        ArrayList<Restaurant> restaurant3 = new ArrayList<>();
        restaurant3.add(new Restaurant(
                "Subway",
                "Servidão Sinfronio José Silveira, 2",
                "Florianópolis",
                R.drawable.subway
        ));
        restaurant3.add(new Restaurant(
                "Subway",
                "R. Nunes Machado, 93",
                "Florianópolis",
                R.drawable.subway
        ));
        restaurant3.add(new Restaurant(
                "Subway",
                "R. Victor Carlos Nauck, 920",
                "Garopaba",
                R.drawable.subway
        ));

        ArrayList<Restaurant> restaurant4 = new ArrayList<>();
        restaurant4.add(new Restaurant(
                "Cacau Show",
                "Av. Pequeno Príncipe, 1853",
                "Florianópolis",
                R.drawable.cacaushow
        ));
        restaurant4.add(new Restaurant(
                "Cacau Show",
                "Av. Pequeno Príncipe, 1853",
                "Florianópolis",
                R.drawable.cacaushow
        ));
        restaurant4.add(new Restaurant(
                "Cacau Show",
                "Av. Rio Branco, 533",
                "Florianópolis",
                R.drawable.cacaushow
        ));

        ArrayList<Restaurant> restaurant5 = new ArrayList<>();
        restaurant4.add(new Restaurant(
                "Cacau Show",
                "Av. Pequeno Príncipe, 1853",
                "Florianópolis",
                R.drawable.cacaushow
        ));
        restaurant4.add(new Restaurant(
                "Cacau Show",
                "Av. Pequeno Príncipe, 1853",
                "Florianópolis",
                R.drawable.cacaushow
        ));
        restaurant4.add(new Restaurant(
                "Cacau Show",
                "Av. Rio Branco, 533",
                "Florianópolis",
                R.drawable.cacaushow
        ));

        franchises.add(new Franchise(
                "KFC",
                "O KFC é uma rede de restaurantes de fast-food estadunidense, que explora a antiga receita de frango frito do Kentucky",
                R.drawable.kfc,
                restaurant1
        ));
        franchises.add(new Franchise(
                "McDonald's",
                "McDonald's Corporation é a maior cadeia mundial de restaurantes de fast food de hambúrguer",
                R.drawable.mcdonalds,
                restaurant2
        ));
        franchises.add(new Franchise(
                "SUBWAY",
                "Subway é uma rede norte-americana de restaurantes fast food, com especialidade em vendas de sanduíches e saladas",
                R.drawable.subway,
                restaurant3
        ));
        franchises.add(new Franchise(
                "CACAU SHOW ",
                "Cacau Show é uma empresa alimentícia brasileira. A Cacau Show é a maior rede de Chocolates Finos do mundo",
                R.drawable.cacaushow,
                restaurant4
        ));franchises.add(new Franchise(
                "CACAU SHOW ",
                "Cacau Show é uma empresa alimentícia brasileira. A Cacau Show é a maior rede de Chocolates Finos do mundo",
                R.drawable.cacaushow,
                restaurant5
        ));

        return franchises;
    }

}
