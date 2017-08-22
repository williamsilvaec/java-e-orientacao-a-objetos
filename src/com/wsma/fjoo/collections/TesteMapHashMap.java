package com.wsma.fjoo.collections;

import java.util.HashMap;

public class TesteMapHashMap {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("João");
        Aluno a2 = new Aluno("Maria");
        Aluno a3 = new Aluno("José");
        Aluno a4 = new Aluno("Mendonça");

        HashMap<String, Aluno> alunos = new HashMap<String, Aluno>();
        alunos.put("1", a1);
        alunos.put("2", a2);
        alunos.put("3", a3);
        alunos.put("4", a4);
        alunos.put("4", a4);

        imprimirAlunos(alunos);

        Aluno alunoRecuperado = alunos.get("3");
        System.out.println("Aluno recuperado: " + alunoRecuperado.getNome());
    }

    private static void imprimirAlunos(HashMap<String, Aluno> alunos) {
        for (Aluno a: alunos.values()) {
            System.out.println("Nome: " + a.getNome());
        }
    }

}
