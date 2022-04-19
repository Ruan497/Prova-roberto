package com.univas.ruan.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.univas.ruan.model.Auditing;

@Repository
public interface AuditingDAO extends JpaRepository<Auditing, Long> {

}
