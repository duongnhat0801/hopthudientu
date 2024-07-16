package com.codegym.homthudientu.service;

import com.codegym.homthudientu.model.EmailSettings;

public interface IEmailSettingsService {

    EmailSettings getAll();

    void save(EmailSettings emailSetting);
}
