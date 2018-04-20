package com.aavdeev.fimspluswatch;

public class GenerFilm {
    private String name;
    private String description;
    private int id;

    public static final GenerFilm[] generList = {
            new GenerFilm("Comedy", "Коме́дия (др.-греч. κωμ-ῳδία, от κῶμος «праздник в честь Диониса» + ἀοιδή / ᾠδή, ᾠδά «песня; ода») — жанр художественного произведения, характеризующийся юмористическим или сатирическим подходом, и также вид драмы, в котором специфически разрешается момент действенного конфликта или ...", R.drawable.comedy),
            new GenerFilm("Drama", "Дра́ма (др.-греч. δρᾶμα — деяние, действие) — литературный (драматический), сценический и кинематографический жанр. Получил особое распространение в литературе XVIII—XXI веков, постепенно вытеснив другой жанр драматургии — трагедию, противопоставив ему преимущественно бытовой ...", R.drawable.drama),
            new GenerFilm("Fantastic", "Фанта́стика — жанр и творческий метод в художественной литературе, кино, изобразительном и других формах искусства, характеризуемый использованием фантастического допущения, «элемента необычайного», нарушением границ реальности, принятых условностей. ..",R.drawable.fantastic)
    };

    public GenerFilm(String name, String description, int id) {
        this.name = name;
        this.description = description;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
