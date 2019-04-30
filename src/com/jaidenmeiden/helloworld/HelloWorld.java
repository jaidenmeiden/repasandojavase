package com.jaidenmeiden.helloworld;

public class HelloWorld {

	public static void main(String[] args) {
		if (args.length > 0) {
			System.out.println("Hello " + args[0]);
		} else {
			System.out.println("Hello World!");
		}

		// Enteros
		byte age = 38;
		short year = 2021;
		int id_user = 1777;
		// Un compilador identifica un long como entero y si es muy largo hay que
		// colocar
		// la letra 'L' para que se sepa que es un tipo de dato 'long'
		long id_twitter = 123456789123456789L;

		// Punto flotante
		// Un compilador identifica un float como double y si esto pasa hay que colocar
		// la letra 'F' para que se sepa que es un tipo de dato 'float'
		float diameter = 34.57F;
		double price = 12345.2345678923456789;

		// Texto
		char gender = 'M';

		// Logico
		boolean isVisible = true;
		boolean isWorking = false;

		// Reglas para declaraciï¿½n de variables en Java
		int variable = 4;
		int Variable = 5;
		int _variable = 6;
		int $variable = 7;
		System.out.println();
		System.out.println("Reglas para declaracion de variables en Java");
		System.out.println("variable: " + variable);
		System.out.println("Variable: " + Variable);
		System.out.println("_variable: " + _variable);
		System.out.println("$variable: " + $variable);

		int VALOR = 10;
		int VALOR_MAXIMO = 100;

		// Lower Camel Case
		int minValor = 4;

		// Cast de variables
		byte b = 6;
		short s = b;

		b = (byte) s;// Sintaxis de un cast de 'short' a 'byte'

		// Cuando paso un valor de 'double' a 'int'
		System.out.println();
		System.out.println("Cuando paso un valor de 'double' a 'int'");
		int i = 1;
		double d = 2.8;
		i = (int) d;
		System.out.println("d: " + d);
		System.out.println("i: " + i);

		// Cuando paso un valor de 'int' a 'char'
		System.out.println();
		System.out.println("Cuando paso un valor de 'int' a 'char'");
		int codigo = 97;
		char codigoASCII = (char) codigo;
		i = (int) d;
		System.out.println("codigo: " + codigo);
		System.out.println("codigoASCII: " + codigoASCII);

		// Cuando el valor de 'short' sobrepasa a 'byte'
		System.out.println();
		System.out.println("Cuando el valor de 'short' sobrepasa a 'byte'");
		short datoShort = 259;
		byte datoByte = (byte) datoShort;
		System.out.println("datoShort: " + datoShort);
		System.out.println("datoByte: " + datoByte);

		// Arrays
		// Declaración de array (Una dimensión)
		int[] arregloInt = new int[2]; // 2 cupcakes
		double arregloDouble[];

		// Declaración de array (Dos dimensión)
		int[][] arregloInt2D = new int[2][3]; // 6 cupcakes
		char[][] days2D = { { 'M', 'T', 'W' }, { 'M', 'T', 'W' } };

		// Declaración de array (Dos dimensión)
		int[][][] arregloInt3D = new int[3][3][2]; // 18 cupcakes
		char[][][] days3D = { { { 'M', 'T', 'W' }, { 'M', 'T', 'W' }, { 'M', 'T', 'W' } },
				{ { 'M', 'T', 'W' }, { 'M', 'T', 'W' }, { 'M', 'T', 'W' } } };

		// Búsqueda de elementos en Arrays, Índices
		char[] message = new char[5];
		message[0] = 'D';
		message[1] = 'R';
		message[2] = 'A';
		message[3] = 'M';
		message[4] = 'A';
		System.out.println();
		System.out.println("Búsqueda de elementos en Arrays, Índices");
		System.out.println("Message: " + message[0]);
		System.out.println("Message: " + message[1]);
		System.out.println("Message: " + message[2]);
		System.out.println("Message: " + message[3]);
		System.out.println("Message: " + message[4]);

		char[][][][] monkey = new char[2][3][2][2];
		monkey[1][0][0][1] = 'M';
		System.out.println();
		System.out.println("I found a monkey: " + monkey[1][0][0][1]);

		// Tipos de operadores en Java
		System.out.println();
		System.out.println("Tipos de operadores en Java");
		int a = 1;
		int aa = a + a;
		System.out.println("Suma int: " + aa);

		double x = 2.56;
		int y = 9;
		float w = (float) (x + y);
		System.out.println("Suma tipos: " + w);
		System.out.println("Multiplicación: " + (w * 2));

		double k = 4 / 0.00002;
		System.out.println("División double: " + k);
		System.out.println("División int: " + ((float) 7 / 2));
		System.out.println("Modulo: " + (7 % 2));

		System.out.println();
		System.out.println("Operadores asignación");

		int f = 2;
		int g = 3;
		System.out.println("Asignación suma");
		System.out.println(f + g);
		//f = f + g
		f += g;
		System.out.println(f);
		System.out.println("Asignación resta");
		System.out.println(f - g);
		//f = f - g
		f -= g;
		System.out.println(f);
		System.out.println("Asignación multiplicación");
		System.out.println(f * g);
		//f = f * g
		f *= g;
		System.out.println(f);
		System.out.println("Asignación división");
		System.out.println(f / g);
		//f = f / g
		f /= g;
		System.out.println(f);
		System.out.println("Asignación modulo");
		System.out.println(f % g);
		//f = f % g
		f %= g;
		System.out.println(f);
		
		//Operadores de incremento ++ y decremento --
		System.out.println();
		System.out.println("Operadores de incremento ++ y decremento --");
		
		int xx = 2;
		int yy = 3;		
		//Incremento
		System.out.println("Incremento posfijo");
		//1. Asignar el valor a xx
		//2. Incrementa el valor xx + 1
		System.out.println("1ª momento: " + (xx++));
		System.out.println("2ª momento: " + xx);
		System.out.println("Incremento prefijo");
		//1. Incrementa el valor xx + 1
		//2. Asignar el valor a xx
		System.out.println("1ª momento: " + (++xx));
		System.out.println("2ª momento: " + xx);

		//Decremento
		System.out.println("Decremento posfijo");
		System.out.println("1ª momento: " + (yy--));
		System.out.println("2ª momento: " + yy);
		
		System.out.println("Decremento prefijo");
		System.out.println("1ª momento: " + (--yy));
		System.out.println("2ª momento: " + yy);
		
		System.out.println();
		System.out.println("Operadores de equidad");
		
		int q = 2;
		int p = 3;	
		System.out.println(p == q);
		System.out.println(p != q);
	}
}