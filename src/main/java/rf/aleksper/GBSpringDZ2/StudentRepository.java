package rf.aleksper.GBSpringDZ2;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {
    private final List<Student> list;

    public StudentRepository() {
        list = new ArrayList<>();
        list.add(new Student("Alex", "IOS"));
        list.add(new Student("Boris", "Android"));
        list.add(new Student("Carolin", "WEB"));
        list.add(new Student("Natali", "IOS"));
        list.add(new Student("Oleg", "Android"));
        list.add(new Student("Alexander", "WEB"));
        list.add(new Student("Georgiy", "WEB"));
        list.add(new Student("Mary", "IOS"));
        list.add(new Student("Anton", "Android"));
        list.add(new Student("Vasily", "WEB"));
    }

    public Student getById(long id) {
        return list.stream()
                .filter(result -> result.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public List<Student> getByName(String name) {
        return list.stream().filter(e -> e.getName().contains(name)).toList();
    }

    public List<Student> getByGroup(String group) {
        return list.stream()
                .filter(result -> result.getGroup().equals(group))
                .toList();
    }

    public List<Student> getAll() {
        return List.copyOf(list);
    }
}
