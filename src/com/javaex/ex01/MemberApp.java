package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {

	/*
		Member user = new Member();
		Member user1 = new Member();
		Member user2 = new Member();
		
		
		user.setName("정우성");
		user.setId("jws");
		user.setPoint(5000);
		
		user1.setName("유재석");
		user1.setId("yjs");
		user1.setPoint(3000);
		
		
		user2.setName("이효리");
		user2.setId("lhr");
		user2.setPoint(4000);
		
		
		user.showInfo();
		user1.showInfo();
		user2.showInfo();
	*/
		
		Member user1 =new Member("정우성","jws",5000);
		
		Member user2 =new Member("유재석","yjs",3000);
		
		Member user3 =new Member("이효리","lhr",4000);
		
		
		user1.showInfo();
		user2.showInfo();
		user3.showInfo();
	}

}
