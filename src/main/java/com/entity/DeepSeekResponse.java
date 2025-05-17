package com.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor // 自动生成全参构造函数
@NoArgsConstructor  // 自动生成无参构造函数（可选）
public class DeepSeekResponse {
    private String id;
    private String object;
    private long created;
    private List<Choice> choices;

    @Data
    @AllArgsConstructor // 自动生成全参构造函数
    @NoArgsConstructor  // 自动生成无参构造函数（可选）
    public static class Choice {
        private int index;
        private Message message;
        private String finish_reason;
    }

    @Data
    @AllArgsConstructor // 自动生成全参构造函数
    @NoArgsConstructor  // 自动生成无参构造函数（可选）
    public static class Message {
        private String role;
        private String content;
    }
}