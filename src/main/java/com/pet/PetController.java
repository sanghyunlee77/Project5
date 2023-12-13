package com.pet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PetController {
    @Autowired
    PetService petService;
    @RequestMapping(value = "/pet/list",method = RequestMethod.GET)
    public String petlist(Model model){
        model.addAttribute("list",petService.getPetList());
        return "list";
    }

}
