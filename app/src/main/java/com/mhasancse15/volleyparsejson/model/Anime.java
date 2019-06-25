package com.mhasancse15.volleyparsejson.model;

public class Anime {
    private String name ;
    private String description;
    private String rating ;
    private int nb_episode;
    private String image_url;
    private String categorie;
    private String studio;

    public Anime() {
    }

    public Anime(String name, String description, String rating, int nb_episode, String image_url, String categorie, String studio) {
        this.name = name;
        this.description = description;
        this.rating = rating;
        this.nb_episode = nb_episode;
        this.image_url = image_url;
        this.categorie = categorie;
        this.studio = studio;
    }


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getRating() {
        return rating;
    }

    public int getNb_episode() {
        return nb_episode;
    }

    public String getImage_url() {
        return image_url;
    }

    public String getCategorie() {
        return categorie;
    }

    public String getStudio() {
        return studio;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setNb_episode(int nb_episode) {
        this.nb_episode = nb_episode;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }
}

