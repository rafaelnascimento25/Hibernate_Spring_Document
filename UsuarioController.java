import model.*;
import java.util.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Rafael
 */

@Controller 
@RequestMapping(value="/usuario")
public class UsuarioController {
 
 @RequestMapping(value = "/tudo", method = RequestMethod.GET)
 public String VerTudo(Model m){
   UsuarioModel model = new UsuarioModel();  
   m.addAttribute("lst", model.VerTudo());
  
   
   return "index";  
    
    
 }
 
    /**
     *
     * @param a
     * @return
     */
    @RequestMapping(value = "/tudo", method = RequestMethod.POST )
 public String adiciona(@ModelAttribute(value ="/usuario") Usuario a){
   UsuarioModel model = new UsuarioModel();  
      model.create(a);
    
     return "create"; 
    
    
 }


 }
 
