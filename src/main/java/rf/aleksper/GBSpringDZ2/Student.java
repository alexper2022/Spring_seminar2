package rf.aleksper.GBSpringDZ2;

import lombok.Data;

@Data
public class Student {
    private static long curentId;
    private final long id;
    private final String name;
    private final String group;

    public Student(String name, String group) {
        this.id = curentId++;
        this.name = name;
        this.group = group;
    }
}
