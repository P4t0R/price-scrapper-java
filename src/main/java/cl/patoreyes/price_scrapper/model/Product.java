package cl.patoreyes.price_scrapper.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


/**
 * Clase que representa un producto en la base de datos.
 * 
 * Esta clase está mapeada a la tabla "products" y contiene información
 * relevante sobre el producto, incluyendo su precio, nombre, código,
 * marca, categoría, imagen y otros detalles.
 * 
 * Ejemplo de una fila en la tabla "products":
 * 
 * | productId | productPrice | productName | productCode | productBrand | productCategory | productImg                           | retail | createdAt           | updatedAt           |
 * |-----------|--------------|-------------|-------------|--------------|-----------------|--------------------------------------|--------|---------------------|---------------------|
 * | 1         | 29.99        | T-Shirt     | TSH123      | BrandA       | Apparel         | http://example.com/images/tshirt.jpg | ONLINE | 2024-10-05T10:00:00 | 2024-10-05T12:00:00 |
 * 
 */

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    @Column(name = "product_price")
    private Double productPrice;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_code")
    private String productCode;

    @Column(name = "product_brand")
    private String productBrand;

    @Column(name = "product_category")
    private String productCategory;

    @Column(name = "product_img")
    private String productImg;

    @Column(name = "retail")
    @Enumerated(EnumType.STRING)
    private RetailEnum retail;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

}
