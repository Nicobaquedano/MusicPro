package cl.duoc.msintegraciondb.model.entities;


import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;


@Data
@Entity
@Table(name="marca")


public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_Marca")
    private int id_marca;


    @Basic
    @Column(name="nombre_Marca")
    private String nombre_marca;
    

}
