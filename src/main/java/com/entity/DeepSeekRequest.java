package com.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor // 自动生成全参构造函数
@NoArgsConstructor  // 自动生成无参构造函数（可选）
public class DeepSeekRequest {
    private String model;
    private List<Message> messages;
    private double temperature;

    @Data
    @AllArgsConstructor // 自动生成全参构造函数
    @NoArgsConstructor  // 自动生成无参构造函数（可选）
    public static class Message {
        private String role;
        private String content;
    }
}