package potatoStudy.example.potatoStudy;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
@Tag(name = "User Controller", description = "유저 API")
public class UserController {

    private final UserService userService;

    @Operation(summary = "유저 생성 API")
    @PostMapping()
    public ResponseEntity<String> create(@RequestBody UserDTO userDTO) {
        userService.create(userDTO);
        return ResponseEntity.ok().body("유저 생성 완료");
    }

}
