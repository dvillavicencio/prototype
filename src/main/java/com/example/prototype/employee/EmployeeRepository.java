package com.example.prototype.employee;

import org.springframework.data.jpa.repository.JpaRepository;

interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Employee getFirst(Long id);

}

