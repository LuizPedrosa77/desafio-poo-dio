package br.com.dio.desafio;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        System.out.println("-----  CURSO -----");
        System.out.println();
        //Instanciando um objeto Curso
        Curso curso1 = new Curso();
        // Objetos criados
        curso1.setTitulo("Curso 1");
        curso1.setDescricao("Descrição curso de Java");
        curso1.setCargaHoraria(8);

        System.out.println(curso1);

        //Instanciando um objeto Curso
        Curso curso2 = new Curso();
        // Objetos criados
        curso2.setTitulo("Curso 2");
        curso2.setDescricao("Descrição curso de JS");
        curso2.setCargaHoraria(8);

        System.out.println(curso2);
        System.out.println();
        System.out.println("-----  MENTORIA -----");
        System.out.println();
        // Instanciando objeto Mentoria
        Mentoria  mentoria1 = new Mentoria();

        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição mentoria Java");
        mentoria1.setData(LocalDate.now());
        DateTimeFormatter dataMentoriaFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println(mentoria1);
        //System.out.println(mentoria1.getData().format(dataMentoriaFormatada));



    }
}