package SchoolMannagementRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import schoolStructure.School;

import java.util.ArrayList;
import java.util.List;

@Service
public class SchoolServices {
    @Autowired
    private SchoolRepository schoolRepository;

    public List<School> getAllSchools()
    {
        List<School>schools=new ArrayList<>();
        schoolRepository.findAll().forEach(schools::add);
        return schools;
    }
    public void addSchool(School school)
    {
        schoolRepository.save(school);
    }
    public void removeSchool(long id)
    {
        schoolRepository.deleteById(id);
    }

}
