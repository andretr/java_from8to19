package function;

import lombok.*;

import java.time.LocalDate;
import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Client {

    @EqualsAndHashCode.Include
    @ToString.Include
    private Integer idClient;

    //@ToString.Include
    private String name;

    @ToString.Include
    private String job;
    private LocalDate birthDate;
    private double salary;
    private String country;


}
