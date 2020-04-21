package com.zlkj.movement.app.service;

import com.zlkj.movement.app.dto.OssCallbackResult;
import com.zlkj.movement.app.dto.OssPolicyResult;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @Description oss上传管理Service
 * @Author HeZeMin
 * @Date 2020年04月20日 17:56
 */
public interface OssService {
    /**
     * oss上传策略生成
     */
    OssPolicyResult policy();
    /**
     * oss上传成功回调
     */
    OssCallbackResult callback(HttpServletRequest request);
}
