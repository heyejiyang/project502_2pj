package org.choongang.member.controllers;

import org.choongang.global.AbstractController;

/*
* 회원가입 컨트롤러
*
* */
public class JoinController extends AbstractController {
    @Override
    public void show() { //모델과 뷰 연결 및 동작
        System.out.println("회원가입!"); //동작하는지 확인
    }
}
