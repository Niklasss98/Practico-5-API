package com.nicolas.trabajo5.entidades;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "localidad")
public class Localidad extends BaseEntidad {

    @NotNull
    @Column(name = "denominacion")
    private String denominacion;

}
