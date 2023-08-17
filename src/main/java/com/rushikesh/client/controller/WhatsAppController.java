package com.rushikesh.client.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.rushikesh.client.requesthandler.MessageRequest;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api/whatsapp")
public class WhatsAppController {
	
	 @PostMapping("/send")
	    public ResponseEntity<String> sendWhatsAppMessage(@RequestBody MessageRequest messageRequest) {
	        try {
	            HttpHeaders headers = new HttpHeaders();
	            headers.setContentType(MediaType.APPLICATION_JSON);
	            headers.set("Authorization", "Bearer EAAN5G2mjP1YBOx1SSL2ka9YPKePoXGKd9cbDnaq0D9FUXDFW0qTSK9ufwfE8IXXnDWbmJqOikfoTzf0JuORlx79ToPmkgzfY2CBPWUwOmtgTEwGZA8ATJjnWZA0ZC73696uLS4J4sZBFGUwKHhqUZBmAdjP80a9lEZCHvpsp9ksQ5oaezFJenNNBGABwbM74ptd8vFRNFA3A69iTYO3Ycw"); // Replace with your actual token
	            
	            String requestBody = "{ \"messaging_product\": \"whatsapp\", \"to\": \"919765595114\", \"type\": \"template\", \"template\": { \"name\": \"hello_world\", \"language\": { \"code\": \"en_US\" } } }";
	            
	            HttpEntity<String> entity = new HttpEntity<>(requestBody, headers);
	            
	            String url = "https://graph.facebook.com/v13.0/117411001446736/messages";
	            
	            RestTemplate restTemplate = new RestTemplate();
	            String response = restTemplate.postForObject(url, entity, String.class);
	            
	            return ResponseEntity.ok(response);
	        } catch (Exception e) {
	            return ResponseEntity.badRequest().body("Error sending message");
	        }
	    }
	

}
