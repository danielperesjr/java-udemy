package com.udemy.java.secao06;

//Seção 06 - Tipos de Dados em Java
//Aula 06 - Operações Matemáticas

public class Secao06Aula06 {
	public static void main(String[] args) {
		int num1 = 5, num2 = 9, res;
		float res2;
		
		//Soma
		res = num1 + num2;
		System.out.println("A soma de " + num1 + " + " + num2 + " é = " + res);
		
		//Subtração
		res = num2 - num1;
		System.out.println("A subtração de " + num2 + " - " + num1 + " é = " + res);
		
		//Multiplicação
		res = num1 * num2;
		System.out.println("A multiplicação de " + num1 + " * " + num2 + " é = " + res);
		
		//Divisão - resultado inteiro
		res = num2 / num1;
		System.out.println("A divisão de " + num2 + " / " + num1 + " é = " + res);
		
		//Divisão - resultado real
		res2 = (float)num2 / (float)num1; //CAST
		System.out.println("A divisão de " + num2 + " / " + num1 + " é = " + res2);
		
		//Módulo
		/*
		 * Se o resto do módulo da variável por 2 = 0, a variável é par.
		 * Se o resto do módulo da variável por 2 = 1, a variável é ímpar.
		 */
		res = num1 % 2;
		System.out.println("O resto da divisão de " + num1 + " por 2 é " + res);
		
		res = num2 % 3;
		
		if (res == 0) {
			System.out.println(num2 + " é divisível por 3 (resultado par).");
		}else {
			System.out.println(num2 + " não é divisível por 3 (resultado ímpar).");
		}
	}
}
