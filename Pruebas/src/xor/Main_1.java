package xor;



import java.util.Scanner;

public class Main_1 {

	public static void main(String[] args) {
		
		a_binario(1);
		a_binario(2);
		a_binario(4);
		a_binario(8);
		a_binario(16);
		a_binario(32);
		a_binario(64);
		a_binario(128);
		
		System.out.println("");
		/*
		int num =128+16+4;
		a_binario(num);
		
		num -=4;
		a_binario(num);
		
		num +=32;
		a_binario(num);
		
		num -=32;
		num +=64;
		a_binario(num);
		*/
	}
	
	public static void a_binario(int num) {
		int dec = num;
		String num_s = Integer.toBinaryString(num);
		num = Integer.parseInt(num_s);
		System.out.printf("%3d: %08d\n",dec, num);
	}
	
}
