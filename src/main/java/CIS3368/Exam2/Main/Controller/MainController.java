package CIS3368.Exam2.Main.Controller;


import CIS3368.Exam2.Main.Models.VirusDepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @Autowired
    VirusDepo virusdepo;

    // create a homepage by mapping the list object from the index file and put all the elements in the model homepage
    @RequestMapping("/")
    public ModelAndView HOME(){
        ModelAndView home = new ModelAndView("index");
        home.addObject("list", virusdepo.findAll());

        return home;
    }
}
