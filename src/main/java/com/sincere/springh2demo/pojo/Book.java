package com.sincere.springh2demo.pojo;

import org.springframework.data.annotation.Id;

public record Book(@Id Integer id, String title, Integer pages, String author) {
}
