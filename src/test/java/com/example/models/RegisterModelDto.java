package com.example.models;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class RegisterModelDto {

    @Getter
    @Setter
    private String name, job;

}
