package com.zlkj.movement.app.domain;

import lombok.Getter;

/**
 *
 * @Description 消息队列枚举配置
 * @Author HeZeMin
 * @Date 2020年04月17日 18:20
 */
@Getter
public enum QueueEnum {
    /**
     * 消息通知队列
     */
    QUEUE_ORDER_CANCEL("movement.order.direct", "movement.order.cancel", "movement.order.cancel"),
    /**
     * 消息通知ttl队列
     */
    QUEUE_TTL_ORDER_CANCEL("movement.order.direct.ttl", "movement.order.cancel.ttl", "movement.order.cancel.ttl");

    /**
     * 交换名称
     */
    private String exchange;
    /**
     * 队列名称
     */
    private String name;
    /**
     * 路由键
     */
    private String routeKey;

    QueueEnum(String exchange, String name, String routeKey) {
        this.exchange = exchange;
        this.name = name;
        this.routeKey = routeKey;
    }
}
