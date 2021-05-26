package ddns.alkhatib.passwordGeneratorAPI.API;
import ddns.alkhatib.passwordGeneratorAPI.service.PasswordGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class API {

    @Autowired
    private final PasswordGenerator pg;

    public API(PasswordGenerator pg) {
        this.pg = pg;
    }


    @GetMapping
    @RequestMapping(path = "password-gen")
    public String getPassword(){
            return pg.getPass();
    }

    @GetMapping("password-gen/{id}")
    public String getPassword(@PathVariable int id){
        return pg.getPass(id);
    }
}
