package com.udacity.jwdnd.c1.review.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {

    @GetMapping
    public String getHomePage(Model model) {
        return "home";
    }

//    @PostMapping
//    public String postChatMessage(Authentication authentication, ChatForm chatForm, Model model) {
//        chatForm.setUsername(authentication.getName());
//        this.messageService.addMessage(chatForm);
//        chatForm.setMessageText("");
//        model.addAttribute("chatMessages", this.messageService.getChatMessages());
//        return "chat";
//    }
//
//    @ModelAttribute("allMessageTypes")
//    public String[] allMessageTypes () {
//        return new String[] { "Say", "Shout", "Whisper" };
//    }
    

}

