package boot.examples.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class Concept1Controller {

    @RequestMapping("concept1")
    public String hello() {
        return "This is the Concept1";
    }
    
    @RequestMapping(value="/conceptRedirect2",method = RequestMethod.GET)
    public  ModelAndView gotoNextPage(HttpServletRequest request, HttpServletResponse response){
        System.out.println("Inside gotoNextPage!!!!!!");

        ModelMap model = new ModelMap();
        return new ModelAndView(
           new RedirectView("/concept2", true)
           //or new RedirectView("/nextpage.html", true),
           //model
        );
    }
    
}
