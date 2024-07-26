package com.manoel.os.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manoel.os.domain.OS;
import com.manoel.os.domain.Tecnico;

@Repository
public interface OSRepository extends JpaRepository<OS, Integer> {

}
