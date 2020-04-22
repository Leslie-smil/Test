package cn.edu.scujcc.java2;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Channel01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List names = new ArrayList();
//		for (int i = 0; i < 5; i++) {
//			Scanner in = new Scanner(System.in);
//			String s = in.next();
//			names.add(s);
//			
//		}
//		System.out.println(names);
//		
//		//删除重复元素
//		Set names2 = new HashSet();
//		for (int std = 0;std<names.size();std++) {
//			names2.add(names.get(std));
//		}
//		System.out.println("删除重复元素后的样子：");
//		System.out.println(names2);
		
		//使用自定义对象
		List<Channel> cs = new ArrayList<Channel>();
		Channel c1 = new Channel();c1.setId(111);c1.setTitle("中央5台");
		Channel c2 = new Channel();c2.setId(111);c2.setTitle("中央5台");
//		String c2 = "111";
		Channel c3 = new Channel();c3.setId(333);c3.setTitle("四川電視台");
		Channel c4 = new Channel();c4.setId(444);
		Channel c5 = new Channel();c5.setId(555);
		cs.add(c1);
		cs.add(c2);
		cs.add(c3);
		cs.add(c4);
		cs.add(c5);
		System.out.println(cs);
		
//		Set cs2 = new HashSet();
//		cs2.add(c1);
//		cs2.add(c2);
//		cs2.add(c3);
//		cs2.add(c4);
//		cs2.add(c5);
//		System.out.println(cs);
		
		Channel o1 = cs.get(0);
		Channel o2 =cs.get(1);
		if (o1.equals(o2)) {
			System.out.println("兩個頻道相同");
		}else {
			System.out.println("兩個平道不同");
		}
	}
}