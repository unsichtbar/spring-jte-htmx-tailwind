
package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.servlet.http.HttpServletResponse;

@Controller
public class TestController {

    @Autowired
    private ObjectMapper om;


    @GetMapping("/")
    public String getMethodName(Model model, HttpServletResponse response) {
        return "demo";
    }

    @RequestMapping(value = "/form-submit", method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String submit(MyForm form,
            BindingResult result, ModelMap model) throws JsonProcessingException {
        if (form.amount == null) {
            model.addAttribute("formJson", "amount cannot be ");
        } else {
            model.addAttribute("formJson", this.om.writeValueAsString(form));
        }
        return "employeeView";
    }

}