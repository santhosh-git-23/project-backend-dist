package com.exam.examportal.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exam.examportal.model.Role;


public interface RoleRepository extends JpaRepository<Role, Long>{

}
