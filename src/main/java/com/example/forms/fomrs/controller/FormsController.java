package com.example.forms.fomrs.controller;

import com.example.forms.fomrs.entity.Forms;
import com.example.forms.fomrs.service.FormsService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FormsController {

    @Autowired
    private FormsService formsService;

    @PostMapping("/post-form")
    public Forms postForm(@Valid @RequestBody Forms form){
        return formsService.postForm(form);
    }

    @GetMapping("/get-forms")
    public List<Forms> getForm(){
        return formsService.getForms();
    }

    @GetMapping("/get-form/{name}")
    public Forms getFormById(@PathVariable String name){
        return formsService.getFormByName(name);
    }
}
