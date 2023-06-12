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
@Table(name="ordenCompra")




public class OrdenCompra {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_ordenCompra")
    private int id_ordenCompra;

    @Basic
    @Column(name="direccion_ordenCompra")
    private String direccion_ordenCompra;

    @Basic
    @Column(name="producto_ordenCompra")
    private String producto_ordenCompra;

    @Basic
    @Column(name = "sucursal_ordenCompra")
    private String sucursal_ordenCompra;

    @Basic
    @Column(name = "manager_ordenCompra")
    private String manager_ordenCompra;

    @Basic
    @Column(name = "cliente_ordenCompra")
    private int cliente_ordenCompra;

    @Basic
    @Column(name = "vendedor_ordenCompra")
    private String vendedor_ordenCompra;
    
}
