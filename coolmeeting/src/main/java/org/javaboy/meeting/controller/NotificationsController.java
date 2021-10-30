package org.javaboy.meeting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author zyy
 * @微信 z17779287224
 * @GitHub https://github.com/HeroZyy
 */
@Controller
public class NotificationsController {
    @GetMapping("/notifications")
    public String notifications() {
        return "notifications";
    }
}
