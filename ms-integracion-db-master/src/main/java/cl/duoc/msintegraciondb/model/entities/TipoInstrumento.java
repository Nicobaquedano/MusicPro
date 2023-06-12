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
@Table(name = "tipoInstrumento")

public class TipoInstrumento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipoInstrumento")
    private int id_tipoInstrumento;

    @Basic
    @Column(name = "nombre_tipoInstrumento")
    private String nombre_tipoInstrumento;

    
}
