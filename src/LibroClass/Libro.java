package LibroClass;

public class Libro {
    private String autor;
    private String titulo;
    private int num_paginas;
    private int año_publlicacion;
    private double costo;

    //Constructor sin parametros
    public Libro(){
    }

    //Constructor con los parametros
    public Libro(String autor, String titulo, int num_paginas, int año_publlicacion, double precio) {
        this.autor = autor;
        this.titulo = titulo;
        this.num_paginas = num_paginas;
        this.año_publlicacion = año_publlicacion;
        this.costo = costo;
    }

    //Métodos

    //Método para mostrar los detalles del objeto libro
    public void mostrarDetalles(){
        System.out.println("Autor: " + autor);
        System.out.println("Titulo: " + titulo);
        System.out.println("Número de paginas: " + num_paginas);
        System.out.println("Año de publicación: " + año_publlicacion);
        System.out.println("Costo: Q" + costo);
    }

    //Método para actualizar el costo del libro
    public void actualizarCosto(double nuevoCosto) {
        this.costo = nuevoCosto;
        System.out.println("El costo actualizado del libro " + titulo + " es: Q" + nuevoCosto);
    }

    //Getters y setters
    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNum_paginas() {
        return num_paginas;
    }

    public int getAño_publlicacion() {
        return año_publlicacion;
    }

    public double getCosto() {
        return costo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNum_paginas(int num_paginas) {
        this.num_paginas = num_paginas;
    }

    public void setAño_publlicacion(int año_publlicacion) {
        this.año_publlicacion = año_publlicacion;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

}



