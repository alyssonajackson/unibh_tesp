package br.ajackson;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author: Alysson Ajackson
 * @date: 2015-02-24 Esse algoritmo imprime 10 vezes o texto "Alô mundo" na
 *        saída padrão
 */

public class Que01 {

	public static void main(String[] args) {

		Aluno a1 = new Aluno(1234L, "João", "9191919191", new Date());
		Aluno a2 = new Aluno(5678L, "Maria", "12812128128");
		Aluno a3 = new Aluno(5678L, "Maria");

		Professor p1 = new Professor("Pollyanna", "1212121", new BigDecimal(
				"999999999"));

		System.out.println(a1);
		System.out.println(a2);
		System.out.println(p1);

		// for(int i = 0; i < 10; i++)
		// System.out.println("Alô mundo");
	}

}