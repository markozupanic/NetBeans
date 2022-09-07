/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author X
 */
@Entity
public class Mjesto {
    
    @Id
    private Long id;
    
    private String naziv;
    private BigDecimal cijena;
    private Boolean glavniGrad;
    private Date datumGodišnjice;
    
    
    
}
