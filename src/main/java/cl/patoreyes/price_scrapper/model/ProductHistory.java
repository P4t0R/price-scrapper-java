package cl.patoreyes.price_scrapper.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
// import lombok.AllArgsConstructor;
// import lombok.NoArgsConstructor;


/**
 * Clase que representa el historial de cambios de un producto en la base de datos.
 * 
 * Esta clase está mapeada a la tabla "product_history" y contiene información
 * sobre las modificaciones realizadas en los productos, incluyendo el precio,
 * nombre, código y la fecha de la última actualización.
 * 
 * Ejemplo de una fila en la tabla "product_history":
 * 
 * | id | productPrice | productName | productCode | updatedAt           |
 * |----|--------------|-------------|-------------|---------------------|
 * | 1  | 29.99        | T-Shirt     | TSH123      | 2024-10-05T12:00:00 |
 * 
 */

@Data
// @NoArgsConstructor
// @AllArgsConstructor
@Entity
@Table(name = "product_history")
public class ProductHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product_price")
    private Double productPrice;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_code")
    private String productCode;
    
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

}
