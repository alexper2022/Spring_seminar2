package rf.aleksper.GBSpringDZ2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping()
public class StudentController {

    private StudentRepository repository;

    @Autowired
    public StudentController(StudentRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/student/{id}")
    public Student getById(@PathVariable long id) {
        return repository.getById(id);
    }

    @GetMapping("/student")
    public List<Student> getAll() {
        return repository.getAll();
    }

    @GetMapping("/student/search")
    public List<Student> getByName(@RequestParam String name) {
        return repository.getByName(name);
    }

    @GetMapping("/group/{group}/student")
    public List<Student> getByGroup(@PathVariable String group) {
        return repository.getByGroup(group);
    }
}
