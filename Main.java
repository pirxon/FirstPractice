package com.company;

public class Main {

	public static void main(String[] args) {
		// Type variableName; null
		Animal cat = new Animal();
		cat.setName("I'm cat");

		//Animal dog = new Animal();
		//0000 0000 1100 1000 = 200 ���� �������� � ���� byte ����� �������� ������ ���� � ����� 
		// ������ � �������
		//0111 1111 = 128
		byte k = (byte)200; // � ������� ���������� ����. ���������� ������ ���, ������ �� �����
		byte i = k;
		System.out.println(i);
		
		long l =2L;
		System.out.println(l);
		
		double d = 2; // 2.0
		float f =5; // 5.0
		
		char c = 124; // ����� ����� � ������� ��������
		c += 2; // c = c + 2  - c = (char)(c+2)
		System.out.println(c);
		
		int ost = 5 % 6; // ������� �� �������
		double celoe = 5/3 ; // ����� (double)5 / 3 ��� 5 / (double)3 = 1.666666667
		System.out.println(ost);
		System.out.println(celoe);
		
		System.out.println(2!=3);
		
		// ��������� � ��������� (����������� � ���������� ����������)
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
