package pe.edu.cibertec.GamerOnline.Models;

import lombok.*;
import javax.persistence.*;

@Data
@SequenceGenerator(name="seq_product_id", allocationSize=1)
@Entity
public class Product {

   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_product_id")
   @Column(name = "num_product_id")
   private Integer num_product_id;

   @Column(name = "str_description")
   private String str_description;

   @Column(name = "num_price")
   private double num_price;

   @Column(name = "num_stock")
   private int num_stock;

   @Column(name = "chr_status")
   private String chr_status;

   @Column(name = "num_console_id")
   private int num_console_id;

}
