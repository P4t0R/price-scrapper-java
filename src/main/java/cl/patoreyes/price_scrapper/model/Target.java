package cl.patoreyes.price_scrapper.model;

import java.time.LocalDateTime;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Data;


/**
 * Clase que representa productos objetivos en la base de datos.
 * 
 * Esta clase está mapeada a la tabla "targets" y contiene información
 * relevante sobre los objetivos, incluyendo un código único, el retail
 * asociado y la fecha de creación.
 * 
 * Ejemplo de una fila en la tabla "targets":
 * 
 * | targetId | targetCode | retail  | createdAt           |
 * |----------|------------|---------|---------------------|
 * | 1        | TGT001     | ONLINE  | 2024-10-05T10:00:00 |
 * 
 */

@Data
@Entity
@Table(name = "targets", uniqueConstraints = @UniqueConstraint(columnNames = {"target_code", "retail"}))
public class Target {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long targetId;

    @Column(name = "target_code")
    private String targetCode;

    @Column(name = "retail")
    private String retail;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

}
