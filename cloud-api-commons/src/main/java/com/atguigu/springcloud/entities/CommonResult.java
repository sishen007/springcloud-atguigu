package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 返回类
 *
 * @author wangyh2
 * @version v1.0
 * @since 2020-12-03 17:29
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    Integer code;
    String message;
    T data;

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }
}
