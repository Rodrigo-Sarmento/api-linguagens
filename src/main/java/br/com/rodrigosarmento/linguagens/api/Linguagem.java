package br.com.rodrigosarmento.linguagens.api;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "principaisLinguagens")
public class Linguagem {

    @Id
    private String id;
    private String name;
    private String image;
    private int ranking;

    public Linguagem() {

    }

    public Linguagem(String name, String image, int ranking) {
        this.name = name;
        this.image = image;
        this.ranking = ranking;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public String getImage() {
        return image;
    }
    public int getRanking() {
        return ranking;
    }


}