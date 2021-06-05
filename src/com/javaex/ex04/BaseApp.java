package com.javaex.ex04;

public class BaseApp {

	//이 클래스의 코드는 수정하지 않습니다.
    public static void main(String args[]) {
        Base base = new Base();          //생성자 만듬 ? 호출 ?
        //베이스란 클래스 에 서비스라는 메소드 호출
        base.service("낮");
        base.service("밤");
        base.service("오후");
    }

}
