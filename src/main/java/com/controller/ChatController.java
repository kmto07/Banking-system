package com.controller;

import com.entity.DeepSeekRequest;
import com.entity.DeepSeekResponse;
import com.service.DeepSeekService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController  // 标记为REST控制器
@RequestMapping("/api/chat")  // 统一接口前缀
public class ChatController {

    private final DeepSeekService deepSeekService;

    // 构造函数注入服务
    public ChatController(DeepSeekService deepSeekService) {
        this.deepSeekService = deepSeekService;
    }

    @PostMapping  // 处理POST请求
    public ResponseEntity<DeepSeekResponse> chat(@RequestBody String userMessage) {
        // 构造请求体
        DeepSeekRequest request = new DeepSeekRequest();
        request.setModel("deepseek-chat");
        request.setTemperature(0.8);

        List<DeepSeekRequest.Message> messages = new ArrayList<>();
        messages.add(new DeepSeekRequest.Message("user", userMessage));
        request.setMessages(messages);

        try {
            DeepSeekResponse response = deepSeekService.getCompletion(request);
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            // 通用写法，兼容所有版本
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
