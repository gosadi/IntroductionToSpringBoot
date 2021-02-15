/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gosadi.controller;

import gosadi.dto.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author alkinoos
 */
@RequestMapping("/")
@Controller
public class HomeController {
    
    @ResponseBody//tells the controller to serialize the object into JSON and send it back to the client dld(HttpResponse object)
    @RequestMapping
    public String showMessage(){
        return "Hello from Spring Boot";
    }
    
    //edo efige to ResponseBody opote den tha girisioume JSON arxeio
    @RequestMapping("/home")
    public String showShome(){
        return "home";
    }
    
    
    @ResponseBody//tells the controller to serialize the object into JSON and send it back to the client dld(HttpResponse object)
    @RequestMapping("/person")
    public Person showPerson(){
        Person p = new Person(1, "Jack", 30);
        return p;
    }
    
}
