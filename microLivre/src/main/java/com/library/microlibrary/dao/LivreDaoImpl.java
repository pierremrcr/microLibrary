package com.library.microlibrary.dao;
/*

import com.library.microlibrary.model.Livre;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class LivreDaoImpl implements LivreDao {



    public static List<Livre> livres = new ArrayList<>();

    static {

        livres.add(new Livre(1, "Et j'ai suivi le vent", "Anne-France Dautheville", "Récit Voyage", "01/02/1975", "C’était en 1972. Seule femme sur 92 pilotes, Anne-France Dautheville, 28 ans, participe à un raid moto entre Paris et Ispahan. Depuis l’Iran, elle poursuit en Afghanistan avec onze motards, puis au Pakistan avec quatre. Trois mois plus tard, à son retour en France, des rumeurs circulent : elle serait lesbienne, nymphomane, et surtout n’aurait suivi le raid qu’en camion. Furieuse, elle débarque à la rédaction du magazine Champion et déclare : « Je repars, toute seule ! » Canada, Alaska, Japon, Inde, Afghanistan... au cours de son périple autour du monde sur une fragile Kawasaki 100cc, les rencontres vont se succéder et prendre le pas sur les paysages. La fureur de vivre de cette icône biker au franc-parler nous fait rêver aujourd’hui, avec nostalgie, à une époque où l’on pouvait encore être joyeux, libre, et où la Terre était un espace ouvert."));
        livres.add(new Livre(2, "Berezina", "Sylvain Tesson", "Récit Voyage", "01/07/2015", "En 2012, pour les 200 ans de la retraite de Russie, Sylvain fait le trajet Moscou-Paris dans un side-car russe de 1930 avec deux Français et deux Russes. À la douane lituanienne, 600 camions font la queue sur 18 km. À Antakalnis (en), ils voient une plaque indiquant : « Ici reposent les restes des soldats des 20 nations... »Note 1 À Vilnius, ils suivent la piste de Napoléon et pas celle des troupes. Sylvain et ses compagnons arrivent à Paris 13 jours après leur départ, en ayant voyagé 4 000 km."));
        livres.add(new Livre(3, "Ecosystème", "Rachel Vanier", "Roman", "07/07/2017", "Marianne et Lucas sont les anti-héros de l'entrepreneuriat. Ils ont sauté le pas de la création d'entreprise, rêve de toute une génération de banquiers fatigués et de consultants blasés qui espèrent trouver dans les start-up le sens perdu dans leurs études à rallonge. Mais pendant que leurs idoles gagnent des millions dans la Silicon Valley, eux peinent à faire décoller leur projet. Ils s'envolent donc pour San Francisco chasser des licornes dans cet eldorado technologique."));
    }

    @Override
    public List<Livre> findAll() {
        return livres;
    }

    @Override
    public Livre findById(int id) {

        for(Livre livre : livres){
            if(livre.getId() == id){
                return livre;
            }
        }
        return null;
    }

    @Override
    public Livre save(Livre livre) {

        livres.add(livre);
        return livre;
    }


}

*/