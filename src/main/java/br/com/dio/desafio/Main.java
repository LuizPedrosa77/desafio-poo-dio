package br.com.dio.desafio;

import br.com.dio.desafio.dominio.*;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

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

        System.out.println();
        System.out.println("----- CONTEUDO -----");
        System.out.println();
        Conteudo conteudo1 = new Curso(); // Polimorfismo


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

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);


        Dev devGustavo = new Dev();
        devGustavo.setNome("Gustavo");
        devGustavo.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo Inscritos: "+devGustavo.getConteudoInscritos());
        devGustavo.progredir();
        devGustavo.progredir();
        devGustavo.progredir();
        System.out.println("-");
        System.out.println("Conteudo Inscritos: "+devGustavo.getConteudoInscritos());
        System.out.println("Conteudo Concluídos: "+devGustavo.getConteudoConcluidos());
        System.out.println("XP: "+devGustavo.calcularTotalXp());


        Dev devLuiz = new Dev();
        devLuiz.setNome("Luiz");
        devLuiz.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo Inscritos: "+devLuiz.getConteudoInscritos());
        devLuiz.progredir();
        devLuiz.progredir();
        devLuiz.progredir();
        System.out.println("-");
        System.out.println("Conteudo Inscritos: "+devLuiz.getConteudoInscritos());
        System.out.println("Conteudo Concluídos: "+devLuiz.getConteudoConcluidos());
        System.out.println("XP: "+devLuiz.calcularTotalXp());




    }
}