package com.gym.olympia.service;

import com.gym.olympia.entity.Office;
import com.gym.olympia.repository.OfficeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OfficeService {

    @Autowired
    OfficeRepository officeRepository;

    public List<Office> listarTodas() {
        return officeRepository.findAll();
    }

    public Optional<Office> buscarPorId(Long id) {
        return officeRepository.findById(id);
    }

}

