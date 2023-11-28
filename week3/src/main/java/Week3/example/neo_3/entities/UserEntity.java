package Week3.example.neo_3.entities;

import Week3.example.neo_3.entities.enums.UserRole;
import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "User")
public class UserEntity {

    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String name;
    @Column(name = "telephone_number")
    private String telephoneNumber;
    @Enumerated(EnumType.STRING)
    private UserRole role;
    @Column
    private String username;
    @Column
    private String password;
    @Column
    private String status;

    public UserEntity(String name, String telephoneNumber, UserRole role, String username, String password, String status){
        this.name = name;
        this.telephoneNumber = telephoneNumber;
        this.role = role;
        this.username = username;
        this.password = password;
        this.status = status;

    }
}
