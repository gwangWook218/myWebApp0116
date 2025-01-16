package com.ex.akw.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {
	@GetMapping("/")
	public String hello() {
		return "hello Docker 00";
	}
	@GetMapping("/1")
	public String hello1() {
		return "hello Docker 11";
	}
	@GetMapping("/2")
	public String hello2() {
		return "hello Docker 22";
	}
}
