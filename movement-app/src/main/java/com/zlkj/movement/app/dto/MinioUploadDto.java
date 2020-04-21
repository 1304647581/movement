package com.zlkj.movement.app.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 *
 * @Description 文件上传返回结果
 * @Author HeZeMin
 * @Date 2020年04月20日 11:11
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class MinioUploadDto {
    private String url;
    private String name;
}
