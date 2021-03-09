package com.example.developercrud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeveloperController {
    @Autowired
    DeveloperService developerService;

    @RequestMapping("/developers")
    public List<Developer> getAllDeveloper(){
        return developerService.getAllDeveloper();
    }

    @RequestMapping(method= RequestMethod.POST,value="/addDevelopers")
    public String addDeveloper(@RequestBody Developer developer){
            developerService.addDeveloper(developer);
            return "Developer added successfully";
    }

    @RequestMapping(method= RequestMethod.PUT,value="/updateDevelopers/{developerId}")
    public String updateDeveloper(@RequestBody Developer developer,@PathVariable Integer developerId){
        developerService.updateDeveloper(developer, developerId);
        return "Data updated successfully";
    }

    @RequestMapping(method= RequestMethod.DELETE,value="/deleteDevelopers/{developerId}")
    public String deleteDeveloper(@PathVariable Integer developerId){
        developerService.deleteDeveloper(developerId);
        return "Data deleted successfully";
    }
}
