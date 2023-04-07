package com.example.forms.fomrs.controller;

import com.example.forms.fomrs.entity.Forms;
import com.example.forms.fomrs.service.FormsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class IndexController {

    @Autowired
    private FormsService formsService;

    @GetMapping("/")
    public String home(){
        return "index.html";
    }

    @PostMapping("/post-form-html")
    public String postFormHTML(@ModelAttribute Forms form){
        System.out.println(form.toString());
//        formsService.postForm(form);
        return "index.html";
    }
}
