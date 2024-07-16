package com.codegym.homthudientu.service;

import com.codegym.homthudientu.model.EmailSettings;
import com.codegym.homthudientu.repository.EmailSettingsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmailSettingsService implements IEmailSettingsService {
    @Autowired
    private EmailSettingsRepo repository;


    @Override
    public EmailSettings getAll() {
        return repository.getAll();
    }

    @Override
    public void save(EmailSettings emailSetting) {
        repository.save(emailSetting);
    }
}
