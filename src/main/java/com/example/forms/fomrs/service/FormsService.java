package com.example.forms.fomrs.service;

import com.example.forms.fomrs.entity.Forms;

import java.util.List;

public interface FormsService {
    public Forms postForm(Forms form);

    public List<Forms> getForms();

    public Forms getFormByName(String name);
}
