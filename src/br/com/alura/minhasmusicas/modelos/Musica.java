package br.com.alura.minhasmusicas.modelos;

public class Musica extends Audio {
    private String album;
    private String artista;
    private String Genero;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    @Override
    public double getClassificacao() {
        if(getTotalCurtidas() > 1000) {
            return 10;
        } else {
            return 7;
        }
    }
}
