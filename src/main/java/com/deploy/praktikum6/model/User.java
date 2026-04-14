package com.deploy.praktikum6.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String nama;
    private String nim;
    private String jenisKelamin;
}
