package cl.duoc.msintegraciondb.model.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Sucursal")

public class Sucursal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "id_Sucursal")
    private int id_Sucursal;


    @Basic
    @Column(name = "direccion_sucursal")
    private String direccion_sucursal;

    @Basic
    @Column(name = "manager_sucursal")
    private String manager_sucursal;

    
}
