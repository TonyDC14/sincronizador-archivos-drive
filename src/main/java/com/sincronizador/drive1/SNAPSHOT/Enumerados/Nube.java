package com.sincronizador.drive1.SNAPSHOT.Enumerados;

public enum Nube {
    Drive("Google Drive"),
    Dropbox("Dropbox"),
    MSOnedrive("Microsoft Onedrive");

    private String nombre;

    private Nube(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
