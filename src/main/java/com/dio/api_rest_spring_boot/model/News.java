package com.dio.api_rest_spring_boot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_news")
public class News extends BaseItem {

}
