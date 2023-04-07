package com.example.forms.fomrs.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Forms {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @NotBlank(message = "NAME SHOULD NOT BE EMPTY")
    private String name;
    @Email(message = "ENTER THE CORRECT EMAIL")
    private String email;
    @NotBlank(message = "PHONE NUMBER SHOULD NOT BE EMPTY")
    @Length(min = 10, max = 10, message = "ENTER CORRECT PHONE NUMBER")
    private String phone;
}