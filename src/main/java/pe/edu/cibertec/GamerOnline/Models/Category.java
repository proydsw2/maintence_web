package pe.edu.cibertec.GamerOnline.Models;

import lombok.*;

import javax.persistence.*;

@Data
@SequenceGenerator(name="seq_category_id", allocationSize=1)
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_category_id")
    @Column(name = "num_category_id")
    private Integer num_category_id;

    @Column(name = "str_description")
    private String str_description;
}
