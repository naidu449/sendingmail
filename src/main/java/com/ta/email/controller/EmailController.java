package com.ta.email.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ta.email.service.SendEmailService;

@RestController
public class EmailController {

    @Autowired
    private SendEmailService sendEmailService;
    
    @GetMapping("/sendMail")
    public String sendEmail() {
        String recipient = "gtntpn@gmail.com";
        String subject = "Loan Repayment";

        String message = "<!DOCTYPE html>"
                        + "<html lang=\"en\">"
                        + "<head>"
                        + "    <meta charset=\"UTF-8\">"
                        + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">"
                        + "    <title>Document</title>"
                        + "    <style>"
                        + "        body {"
                        + "            font-family: Arial, sans-serif;"
                        + "            background-color: #f4f4f4;"
                        + "            margin: 0;"
                        + "            padding: 0;"
                        + "            color: #333333;"
                        + "        }"
                        + "        .container {"
                        + "            background-color: #ffffff;"
                        + "            max-width: 400px;"
                        + "            margin: 40px auto;"
                        + "            padding: 20px;"
                        + "            border-radius: 10px;"
                        + "            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);"
                        + "            border: 1px solid #dddddd;"
                        + "        }"
                        + "        .heading {"
                        + "            text-align: center;"
                        + "            padding: 10px;"
                        + "            background-color: #218838;"
                        + "            color: #ffffff;"
                        + "            border-radius: 10px 10px 0 0;"
                        + "        }"
                        + "        .sub-header {"
                        + "            max-width: 320px;"
                        + "            margin: auto;"
                        + "            padding: 10px;"
                        + "        }"
                        + "        .credentials {"
                        + "            background-color: #f9f9f9;"
                        + "            padding: 15px;"
                        + "            border-radius: 5px;"
                        + "            margin-bottom: 20px;"
                        + "            border: 1px solid #e0e0e0;"
                        + "        }"
                        + "        .credentials p {"
                        + "            margin: 8px 0;"
                        + "            font-size: 16px;"
                        + "        }"
                        + "        p {"
                        + "            font-size: 16px;"
                        + "            line-height: 1.6;"
                        + "        }"
                        + "        h5 {"
                        + "            margin: 0;"
                        + "            font-size: 22px;"
                        + "            font-weight: bold;"
                        + "        }"
                        + "        .login-button {"
                        + "            text-align: center;"
                        + "            margin-top: 20px;"
                        + "        }"
                        + "        .login-button a {"
                        + "            display: inline-block;"
                        + "            background-color: #28a745;"
                        + "            color: white;"
                        + "            padding: 12px 25px;"
                        + "            border-radius: 5px;"
                        + "            text-decoration: none;"
                        + "            font-size: 16px;"
                        + "        }"
                        + "        .login-button a:hover {"
                        + "            background-color: #218838;"
                        + "        }"
                        + "    </style>"
                        + "</head>"
                        + "<body>"
                        + "    <div class=\"container\">"
                        + "        <div class=\"heading\">"
                        + "            <div class=\"sub-header\">"
                        + "                <h5>Transaction Analysts</h5>"
                        + "            </div>"
                        + "        </div>"
                        + "        <div>"
                        + "            <p>Hello, <strong>Rajesh</strong></p>"
                        + "            <p>Thank you for regestering twallet. Bellow are the login credentials or click the button bellow</p>"
                        + "        </div>"
                        + "        <div class=\"credentials\">"
                        + "            <p><strong>Username:</strong> rajesh</p>"
                        + "            <p><strong>Password:</strong> yourpassword</p>"
                        + "        </div>"
                        + "        <div class=\"login-button\">"
                        + "            <a href=\"https://www.example.com/login\" target=\"_blank\">Click here for login</a>"
                        + "        </div>"
                        + "    </div>"
                        + "</body>"
                        + "</html>";

        sendEmailService.sendEmail(recipient, subject, message);
        return "Mail sent successfully. Check your email.";
    }
}
