package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReserveController {

    @PostMapping("/reserve")
    public String processReservation(@RequestParam String name, @RequestParam String room, Model model) {
        // ユーザーが入力した情報をモデルに追加
        model.addAttribute("name", name);
        model.addAttribute("room", room);

        // 確認ページを表示
        return "reservation-confirmation";
    }
}
