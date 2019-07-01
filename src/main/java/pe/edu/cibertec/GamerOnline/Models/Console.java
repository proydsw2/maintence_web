package pe.edu.cibertec.GamerOnline.Models;

import lombok.*;
import javax.persistence.*;

@Data
@SequenceGenerator(name="seq_console_id", allocationSize=1)
@Entity
public class Console {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_console_id")
    @Column(name = "num_console_id")
    private Integer num_console_id;

    @Column(name = "str_description")
    private String str_description;
}
