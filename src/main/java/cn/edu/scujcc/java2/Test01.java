package cn.edu.scujcc.java2;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,a,b,sum;
		Scanner in = new Scanner(System.in);//导入快捷键ctrl 1
		n = in.nextInt();
		for(int i = 1; i<=n; i++) {
			a = in.nextInt();
			b = in.nextInt();
			sum = a+b;
			System.out.println("和是："+sum);//syso+alt+/
		}

	}
	//排版格式化快捷键ctrl shift F

}
