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
@Table(name="usuario")

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_usuario")
    private int id_usuario;

    @Basic
    @Column(name="nombre_usuario")
    private String nombre_usuario;

    @Basic
    @Column(name="correo_usuario")
    private String correo_usuario;

    @Basic
    @Column(name = "tipo_usuario")
    private String tipo_usuario;
    
}
