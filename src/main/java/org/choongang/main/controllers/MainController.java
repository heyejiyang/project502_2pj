package org.choongang.main.controllers;


import org.choongang.global.AbstractController;

/*
* 메인 컨트롤러
* 제일 처음 나오는 화면
* */
public class MainController extends AbstractController {
    @Override
    public void show() {
        System.out.println("메인 메뉴~~");
    }
}
