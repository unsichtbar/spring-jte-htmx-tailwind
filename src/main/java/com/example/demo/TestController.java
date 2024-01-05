

package com.example.demo;

import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.websocket.server.PathParam;

import java.math.BigDecimal;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.util.MultiValueMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class TestController {

    @Autowired
    private ObjectMapper om;

    
    public static class MyForm {
        Boolean the_checkbox;
        BigDecimal amount;
        public Boolean getThe_checkbox() {
            return the_checkbox;
        }
        public void setThe_checkbox(Boolean the_checkbox) {
            this.the_checkbox = the_checkbox;
        }
        public BigDecimal getAmount() {
            return amount;
        }
        public void setAmount(BigDecimal amount) {
            this.amount = amount;
        }

        
    }

    @GetMapping("/")
    public String getMethodName( Model model, HttpServletResponse response) {
        return "demo";
    }

    @RequestMapping(value = "/form-submit", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public String submit( @RequestBody Map form, 
      BindingResult result, ModelMap model) throws JsonProcessingException {
        model.addAttribute("formJson", this.om.writeValueAsString(form));
        return "employeeView";
    }
    

}