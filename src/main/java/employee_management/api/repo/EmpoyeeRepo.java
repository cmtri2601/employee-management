package employee_management.api.repo;

import employee_management.api.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmpoyeeRepo extends JpaRepository<Employee, Long> {

    void deleteEmployeeById(Long id) ;

    Optional<Employee> findEmployeeById(Long id);
}
