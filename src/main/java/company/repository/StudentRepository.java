package company.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import company.beans.Student;
import company.beans.*;

/**
 * Arda Rugji - arugji
 *  CIS171 
 * 1 April
 */
public interface StudentRepository extends JpaRepository<Student, Long>{
	void save(School d);

}
