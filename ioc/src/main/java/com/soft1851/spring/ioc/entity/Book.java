package com.soft1851.spring.ioc.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description TODO
 * @Author jl_huang
 * @Date 2020-03-17
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Book {
    private String name;
    private Double price;
}