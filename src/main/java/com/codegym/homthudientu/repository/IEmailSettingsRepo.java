package com.codegym.homthudientu.repository;

import com.codegym.homthudientu.model.EmailSettings;

public interface IEmailSettingsRepo {
    EmailSettings getAll();

    void save(EmailSettings emailSetting);
}
