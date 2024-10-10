package com.miltonoscarflores.starwars;

import com.google.gson.annotations.SerializedName;

public class Pelicula {
    @SerializedName("title")
    private String title;

    @SerializedName("episode_id")
    private int episodeId;

    @SerializedName("release_date")
    private String releaseDate;

    @SerializedName("director")
    private String director;

}
