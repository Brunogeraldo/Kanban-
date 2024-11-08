import org.springframework.web.bind.annotation.*;

@RestController
public class AuthController {

    @PostMapping("/login")
    public String login(@RequestBody AuthRequest authRequest) {
        // Autenticar o usuário e gerar o token JWT
        // Retornar o token JWT
    }
}