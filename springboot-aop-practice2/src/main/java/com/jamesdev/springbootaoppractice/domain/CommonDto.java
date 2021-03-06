package com.jamesdev.springbootaoppractice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonDto <T>{
    private int statusCode;
    private T data;
}
