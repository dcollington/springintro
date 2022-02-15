package oslomet.webprog.springintro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HeiController {
    public final List<kunde> kunder = new ArrayList<>();

    @GetMapping("/navn")
    public String hei(String navn){
        int antallBokstaver = navn.length();

        return "Hei verden " + navn + "!. Navnet ditt er " + antallBokstaver + " langt.";
    }

    @GetMapping("Kunde")
    public kunde returKunde(kunde innKunde){
        return innKunde;
    }

    /*//Ekstra kode
    @PostMapping("lagreKunde")
    public void kunde(kunde innKunde){
        kunder.add(innKunde);
    }

    @GetMapping("/hentAlleKunder")
    public List<kunde> hentKunder(){
        return kunder;
        }
     */


}
