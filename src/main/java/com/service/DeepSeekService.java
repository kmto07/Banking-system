package com.service;

import com.entity.DeepSeekRequest;
import com.entity.DeepSeekResponse;

public interface DeepSeekService {
    /**
     * 调用DeepSeek API生成响应
     * @param request 请求参数
     * @return API响应结果
     */
    DeepSeekResponse getCompletion(DeepSeekRequest request);
}
