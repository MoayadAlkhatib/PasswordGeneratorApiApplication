package ddns.alkhatib.passwordGeneratorAPI.API;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "password-gen")
public class API {

    @GetMapping
    public String getPass(){
        return "password";
    }
}
