package com.example.relation;

import com.example.relation.Agenda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendaRepository extends JpaRepository<Agenda, Integer>{

//List<Agenda> findByDate(String date);
}