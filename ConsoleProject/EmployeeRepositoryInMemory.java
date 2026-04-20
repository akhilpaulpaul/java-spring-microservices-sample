package ConsoleProject;

import java.util.*;

public class EmployeeRepositoryInMemory implements EmployeeRepository {

    private Map<Integer, Employee> db = new HashMap<>();

    @Override
    public void save(Employee emp) {
        db.put(emp.getId(), emp);
    }

    @Override
    public Optional<Employee> findById(int id) {
        return Optional.ofNullable(db.get(id));
    }

    @Override
    public List<Employee> findAll() {
        return new ArrayList<>(db.values());
    }

    @Override
    public void delete(int id) {
        db.remove(id);
    }
}
