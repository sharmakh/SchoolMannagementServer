package SchoolMannagementRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
/*import schoolStructure.School;*/

import java.util.List;

@RestController
public class ControllerWebApp {

    @Autowired
    private SchoolServices schoolServices;

    @RequestMapping("/schools")
    public List<School> getAllSchools()
    {
        return schoolServices.getAllSchools();
    }

    @RequestMapping(method = RequestMethod.POST,value = "/school")
    public void addSchool(@RequestBody School school)
    {
        schoolServices.addSchool(school);
    }
    @DeleteMapping("schools/{id}")
    public void removeSchool(@PathVariable long id)
    {
        schoolServices.removeSchool(id);
    }
}
