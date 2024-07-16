package com.codegym.homthudientu.repository;

import com.codegym.homthudientu.model.EmailSettings;

public class EmailSettingsRepo implements IEmailSettingsRepo {
    private static EmailSettings emailSettings = new EmailSettings("Vietnamese", 15, true, "A");

    @Override
    public EmailSettings getAll() {
        return emailSettings;
    }
    @Override
    public void save(EmailSettings emailSetting) {
        emailSettings.setLanguage(emailSetting.getLanguage());
        emailSettings.setSize(emailSetting.getSize());
        emailSettings.setSpam(emailSetting.isSpam());
        emailSettings.setSignature(emailSetting.getSignature());
    }
}
