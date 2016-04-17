package com.company;

public class Main {

	public static void main(String[] args) {
		// Type variableName; null
		Animal cat = new Animal();
		cat.setName("I'm cat");

		//Animal dog = new Animal();
		//0000 0000 1100 1000 = 200 если привести в типу byte будут обрезаны первые нули и число 
		// станет с минусом
		//0111 1111 = 128
		byte k = (byte)200; // в скобках приведение типа. компилятор делает сам, писать не нужно
		byte i = k;
		System.out.println(i);
		
		long l =2L;
		System.out.println(l);
		
		double d = 2; // 2.0
		float f =5; // 5.0
		
		char c = 124; // номер числа в таблице символов
		c += 2; // c = c + 2  - c = (char)(c+2)
		System.out.println(c);
		
		int ost = 5 % 6; // остаток от деления
		double celoe = 5/3 ; // можно (double)5 / 3 или 5 / (double)3 = 1.666666667
		System.out.println(ost);
		System.out.println(celoe);
		
		System.out.println(2!=3);
		
		// инкремент и декремент (постфиксные и префексные инкременты)
		int y = 5;
		int r = y++ + ++y; // 12 = 6 + 6
		/**
		 * initial : i = 5
		 * before :  i = i+1 (++i) - i =6
		 * formula : 6(i++) + 6(++i)
		 * after : i = i+1 (i++) - i = 7 
		 */
		System.out.println(y);
		
		char g = 'a';
		System.out.println((int)g);
		System.out.println((int)(g += 3.6));
		
		Long lvalue = 9l;
		System.out.println(Long.toBinaryString(5));
		System.out.println(Long.parseLong("3232"));
	}

}
