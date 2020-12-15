package com.javaex.ex01;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneApp {

	public static void main(String[] args) throws IOException{
		int menu, num;
		String name, hp, company;
		boolean a = true;
		List<Phone> plist = new ArrayList<Phone>(); 
		PhonenumberDB pdb=new PhonenumberDB();
		pdb.prdb(plist);
		Scanner sc=new Scanner(System.in);
		System.out.println("*********************************");
		System.out.println("*        전화번호 관리 프로그램             *");
		System.out.println("*********************************");
		System.out.println(" ");
		while(a) {	
			System.out.println("1.리스트|2.등록|3.삭제|4.검색|5.종료");
			System.out.println("---------------------------------");
			System.out.print(">메뉴번호: ");
			menu=sc.nextInt();
			switch (menu) {
			case 1:
				System.out.println("<1.리스트>");
				for (int i = 0; i < plist.size(); i++) {
					System.out.print(i+". ");
					plist.get(i).showInfo();
				}
				break;
			case 2:
				System.out.println("<2.등록>");
				System.out.print(">이름:");
				sc.nextLine(); 
				name = sc.nextLine();
				System.out.print(">휴대전화:");
				hp = sc.nextLine();
				System.out.print(">회사전화:");
				company = sc.nextLine();
				
				Phone person = new Phone(name, hp, company);
				
				plist.add(person);
				
				System.out.println("[등록되었습니다.]");
				break;
				
			case 3:
				System.out.println("<3.삭제>");
				System.out.print(">번호:");
				num = sc.nextInt();
				plist.remove(num-1);
				break;
				
			case 4:
				System.out.println("<4.검색>");
			case 5:
				System.out.println("******************************************");
				System.out.println("*               감사합니다               *");
				System.out.println("******************************************");
				a = false;
				break;
				
			default :
				System.out.println("[다시 입력해 주세요.]");
				break;
		}
	}
	}
}
