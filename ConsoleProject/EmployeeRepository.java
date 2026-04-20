package ConsoleProject;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository {
    void save(Employee emp);
    Optional<Employee> findById(int id);
    List<Employee> findAll();
    void delete(int id);
}
