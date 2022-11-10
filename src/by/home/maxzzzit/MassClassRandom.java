package by.home.maxzzzit;

import java.util.Random;

public class MassClassRandom {
	public static void main(String[]args) {
		byte []mass=new byte [8];
		Random rm=new Random();
		rm.nextBytes(mass);
		for (byte s:mass) {
			System.out.print(s+" ");
		}
	}
}
