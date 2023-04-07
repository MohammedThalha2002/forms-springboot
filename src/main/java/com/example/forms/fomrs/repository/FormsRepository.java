package com.example.forms.fomrs.repository;

import com.example.forms.fomrs.entity.Forms;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormsRepository extends JpaRepository<Forms, Integer> {

    public Forms findByName(String name);
}
