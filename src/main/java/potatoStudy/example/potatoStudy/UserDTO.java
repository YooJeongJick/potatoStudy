package potatoStudy.example.potatoStudy;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class UserDTO {
    private String name;
    private String email;

    public UserEntity toEntity() {
        UserEntity user = UserEntity.builder()
                .name(this.name)
                .email(this.email)
                .build();
        return user;
    }
}
