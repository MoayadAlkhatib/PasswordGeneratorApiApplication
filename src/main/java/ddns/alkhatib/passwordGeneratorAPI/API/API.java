package ddns.alkhatib.passwordGeneratorAPI.API;
import ddns.alkhatib.passwordGeneratorAPI.service.PasswordGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class API {

    @Autowired
    private PasswordGenerator pg;


    @GetMapping
    @RequestMapping(path = "password-gen")
    public String getPassword(){
        return pg.getPass();
    }
}
