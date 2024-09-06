package potatoStudy.example.potatoStudy;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public void create(UserDTO userDTO) {
        UserEntity user = userDTO.toEntity();
        userRepository.save(user);
    }
}
