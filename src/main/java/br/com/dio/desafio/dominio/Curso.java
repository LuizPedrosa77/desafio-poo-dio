package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    private int cargaHoraria;

    public Curso() {
    }

    /**
    public Curso() {
        titulo = "";
        descricao = "";
        cargaHoraria = 0;
    }

    public Curso(String titulo, String descricao, int cargaHoraria) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
    }
    */
    // Get e Set
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + cargaHoraria;
    }
}
