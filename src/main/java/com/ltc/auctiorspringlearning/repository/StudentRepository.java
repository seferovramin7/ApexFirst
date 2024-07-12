package com.ltc.auctiorspringlearning.repository;

import com.ltc.auctiorspringlearning.dao.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
