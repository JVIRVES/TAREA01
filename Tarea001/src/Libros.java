public class Libros {

    private String Titulo;
    private String Autor;
    private String Editorial;
    private int año_publicacion;
    private int numero_de_paginas;

    public String getTitulo() {
        return Titulo;
    }
    public String getAutor() {
        return Autor;
    }

    public String getEditorial() {
        return Editorial;
    }

    public int getAño_publicacion() {
        return año_publicacion;
    }

    public int getNumero_de_paginas() {
        return numero_de_paginas;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    public void setAño_publicacion(int año_publicacion) {
        this.año_publicacion = año_publicacion;
    }

    public void setNumero_de_paginas(int numero_de_paginas) {
        this.numero_de_paginas = numero_de_paginas;
    }

    public void greet(){

        System.out.println("\nLa información del libro es: "+ "\n " + "\nTitulo: " + Titulo + " " + "\nAutor: "+ Autor + " " + "\nEditorial: "+ Editorial + " " + "\nAño de publicación: "+ año_publicacion + " " + "\nNúmero de páginas:  "+ numero_de_paginas);
    }




}
