package com.rushikesh.client.requesthandler;

public class MessageRequest {

	 private String to;
	    private String type;
	    private Template template;

	    // Getters and setters

	    public String getTo() {
	        return to;
	    }

	    public void setTo(String to) {
	        this.to = to;
	    }

	    public String getType() {
	        return type;
	    }

	    public void setType(String type) {
	        this.type = type;
	    }

	    public Template getTemplate() {
	        return template;
	    }

	    public void setTemplate(Template template) {
	        this.template = template;
	    }

	    public static class Template {
	        private String name;
	        private Language language;

	        // Getters and setters

	        public String getName() {
	            return name;
	        }

	        public void setName(String name) {
	            this.name = name;
	        }

	        public Language getLanguage() {
	            return language;
	        }

	        public void setLanguage(Language language) {
	            this.language = language;
	        }
	    }

	    public static class Language {
	        private String code;

	        // Getters and setters

	        public String getCode() {
	            return code;
	        }

	        public void setCode(String code) {
	            this.code = code;
	        }
	    }
	}