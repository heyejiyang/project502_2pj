package org.choongang.member.controllers;

import org.choongang.global.AbstractController;

/*
* 로그인 컨트롤러
* */
public class LoginController extends AbstractController {
    @Override
    public void show() { //모델과 뷰 연결 및 동작
        System.out.println("로그인!");
    }
}