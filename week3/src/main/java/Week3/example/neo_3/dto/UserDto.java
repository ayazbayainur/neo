package Week3.example.neo_3.dto;

import Week3.example.neo_3.entities.enums.UserRole;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private long id;
    private String name;
    private String telephoneNumber;
    private UserRole role;
    private String username;
    private String password;
    private String status;
}
