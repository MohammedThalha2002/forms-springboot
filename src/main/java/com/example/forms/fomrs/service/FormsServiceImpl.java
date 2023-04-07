package com.example.forms.fomrs.service;

import com.example.forms.fomrs.entity.Forms;
import com.example.forms.fomrs.repository.FormsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FormsServiceImpl implements FormsService {

    @Autowired
    private FormsRepository formsRepository;

    @Override
    public Forms postForm(Forms form){
        return formsRepository.save(form);
    }

    @Override
    public List<Forms> getForms(){
        return formsRepository.findAll();
    }

    @Override
    public Forms getFormByName(String name) {
        return formsRepository.findByName(name);
    }

}
