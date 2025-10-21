package com.senasoft.ferias.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senasoft.ferias.entity.Tipo_Documento;

@Repository
public interface Tipo_DocumentoRepository extends JpaRepository<Tipo_Documento, Long> {

}
