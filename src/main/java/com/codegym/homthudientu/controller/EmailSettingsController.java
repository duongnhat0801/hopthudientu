package com.codegym.homthudientu.controller;


import com.codegym.homthudientu.model.EmailSettings;
import com.codegym.homthudientu.repository.IEmailSettingsRepo;
import com.codegym.homthudientu.service.EmailSettingsService;
import com.codegym.homthudientu.service.IEmailSettingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/email")
public class EmailSettingsController {

    @Autowired
    private IEmailSettingsService emailSettingsService;

    @GetMapping
    public String index(Model model) {
        EmailSettings emailSettings = emailSettingsService.getAll();
        model.addAttribute("emailSettings", emailSettings);
        return "/home";
    }

    @GetMapping("/update")
    public String showUpdateForm(Model model) {
        EmailSettings emailSettings = emailSettingsService.getAll();
        String[] languages = new String[] {"English", "Vietnamese", "Japanese", "Chinese"};
        int[] sizes = new int[] {5, 10, 15, 25, 50, 100};
        model.addAttribute("emailSettings", emailSettings);
        model.addAttribute("languages", languages);
        model.addAttribute("sizes", sizes);
        return "update";
    }

    @PostMapping("/update")
    public String updateMailSettings(@ModelAttribute("mail") EmailSettings emailSetting) {
        emailSettingsService.save(emailSetting);
        return "redirect:/mailbox";
    }
}
