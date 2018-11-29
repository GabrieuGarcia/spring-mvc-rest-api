package br.com.springmvc.springmvcdois.repository;

import br.com.springmvc.springmvcdois.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
