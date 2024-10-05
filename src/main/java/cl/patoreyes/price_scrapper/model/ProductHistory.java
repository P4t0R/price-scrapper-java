package cl.patoreyes.price_scrapper.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
// import lombok.Data;
// import lombok.AllArgsConstructor;
// import lombok.NoArgsConstructor;


// @Data
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
