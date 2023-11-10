package DataBase;

import java.time.LocalDate;
import java.time.LocalTime;

public class Component extends Object{
    private Long idNumber;
    private LocalDate productionDate;
    private LocalTime productionTime;
    private String project;

    public Component(Long idNumber, LocalDate productionDate, LocalTime productionTime, String project) {
        this.idNumber = idNumber;
        this.productionDate = productionDate;
        this.productionTime = productionTime;
        this.project = project;

        if (idNumber == null || productionDate == null || productionTime == null || project == null) throw new IllegalArgumentException();
    }
}
