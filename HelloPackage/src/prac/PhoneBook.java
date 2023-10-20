package prac;

import java.util.Scanner;

class Person {
	private String name, phoneNumber;

	public Person(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
}


public class PhoneBook {
	private static Person[] phoneBook;
	private static int size = 0;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Number of Person >> ");
		int num = scanner.nextInt();  // 사람 수 입력받기	
		scanner.nextLine();
		
		phoneBook = new Person[num];
		
		int i;
		for(i=0; i<num; i++) {
			System.out.print("Name and Phonenumber (ex. 홍길동 010-1234-5678) >> ");
			String newPerson = scanner.nextLine();
			String[] s = newPerson.split(" ");    // 띄어쓰기를 기준으로 분리하여 배열에 저장
			if (s.length == 2) {    
				String name = s[0];
				String phoneNumber = s[1];
				Person person = new Person(name, phoneNumber);
				phoneBook[size] = person;
				size++;
			}
		}
		
		System.out.println("Store Done");
				
		while(true) {
			System.out.print("Name to search >> ");
			String who = scanner.next();    // 검색할 이름 입력받기
			
			if(who.equals("Stop"))
				break;
			
			boolean found = false;
			for (int k=0; k<size; k++) {    // 검색한 이름의 전화번호 출력하기
				if(phoneBook[k] != null && phoneBook[k].getName().equals(who)) {
					System.out.println(who + "'s number is " + phoneBook[k].getPhoneNumber());
					found = true;
					break;
				}
			}
			
			if(!found)
				System.out.println(who + " not found");
		}		
	}
}
