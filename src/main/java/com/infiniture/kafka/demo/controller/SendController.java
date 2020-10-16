package com.infiniture.kafka.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infiniture.kafka.demo.producer.Producer;

@RestController
@RequestMapping("/kafka")
public class SendController {

        @Autowired
        private Producer producer;

        @RequestMapping(value = "/send")
        public String send() {
            producer.send();
            return "{\"code\":0}";
        }
}
