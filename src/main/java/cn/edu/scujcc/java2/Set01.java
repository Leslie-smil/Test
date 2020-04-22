package cn.edu.scujcc.java2;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Set01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List names = new ArrayList();
		for (int i = 0; i < 5; i++) {
			Scanner in = new Scanner(System.in);
			String s = in.next();
			names.add(s);
			
		}
		System.out.println(names);
		
		//删除重复元素
//		for (int std = 0; std < names.size(); std++) {
//			for (int j = 0; j < names.size(); j++) {
//				String standard = (String) names.get(std);
//				if (j==std) {
//					continue;
//				}
//				String cmp = (String) names.get(j);
//				if(cmp.equals(standard)) {
//					names.remove(j);
//				}
//			}
//		}
		Set names2 = new HashSet();
		for (int std = 0;std<names.size();std++) {
			names2.add(names.get(std));
		}
		System.out.println("删除重复元素后的样子：");
		System.out.println(names2);

	}
}