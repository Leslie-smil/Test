package cn.edu.scujcc.java2;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int time1,time2,hours,mins;
		time1 = in.nextInt();
		time2 = in.nextInt();
		
		time1 = (time1 / 100) * 60 + time1 % 100;
		time2 = (time1 / 100) * 60 + time2 % 100;
		hours = (time2-time1) / 60;
		mins = (time2-time1)-hours+60;
		System.out.println("The train journey time is"+hours+"hrs"+mins+"mins");

	}

}
