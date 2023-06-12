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
@Table(name = "accesorio")
public class Accesorio{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Accesorio")
    private int idAccesorio;

    @Basic
    @Column(name = "nombre_Accesorio")
    private String nombre_Accesorio;

   

    @Basic
    @Column(name = "precio_Accesorio")
    private int precio_Accesorio;

    @Basic
    @Column(name = "descripcion_Accesorio")
    private String descripcion_Accesorio;


}


