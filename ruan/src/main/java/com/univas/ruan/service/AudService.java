package com.univas.ruan.service;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.univas.ruan.dao.AuditingDAO;
import com.univas.ruan.exceptions.ObjectNotFoundException;
import com.univas.ruan.model.Auditing;

@Service
public class AudService {
	@Autowired
    private AuditingDAO auditingDAO;

    public List<Auditing> getAllAuds() {
        return auditingDAO.findAll();
    }

    public Auditing getAudById(Long id) {
        Optional<Auditing> obj = auditingDAO.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("not found."));
    }

    public void createAuditing(Auditing auditing) {
        auditingDAO.save(auditing);
    }
}