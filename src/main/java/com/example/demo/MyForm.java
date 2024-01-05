package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDate;

public class MyForm {
        Boolean the_checkbox;
        BigDecimal amount;
        LocalDate cash_date;

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

        public LocalDate getCash_date() {
            return cash_date;
        }

        public void setCash_date(LocalDate cash_date) {
            this.cash_date = cash_date;
        }

    }
