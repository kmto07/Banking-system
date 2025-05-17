package com.service.impl;

import com.entity.DeepSeekRequest;
import com.entity.DeepSeekResponse;
import com.service.DeepSeekService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service  // 标记为Spring管理的Bean
public class DeepSeekServiceImpl implements DeepSeekService {

    private final String apiUrl;
    private final RestTemplate restTemplate;

    // 通过构造器注入依赖
    public DeepSeekServiceImpl(
            @Value("${deepseek.api.url}") String apiUrl,
            RestTemplate restTemplate
    ) {
        this.apiUrl = apiUrl;
        this.restTemplate = restTemplate;
    }

    @Override
    public DeepSeekResponse getCompletion(DeepSeekRequest request) {
        return restTemplate.postForObject(apiUrl, request, DeepSeekResponse.class);
    }
}
