package com.spring.cloud.entity.mysql.demo;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;

/**
 * <p>
 * 网关路由表
 * </p>
 *
 * @author shennanb
 * @since 2019-09-02
 */

@Data
public class GatewayRoutes implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 路由id
     */
    @TableField("route_id")
    private String routeId;

    /**
     * uri路径
     */
    @TableField("uri")
    private String uri;

    /**
     * 判定器
     */
    @TableField("predicates")
    private String predicates;

    /**
     * 过滤器
     */
    @TableField("filters")
    private String filters;

    /**
     * 排序
     */
    @TableField("orders")
    private Integer orders;

    /**
     * 描述
     */
    @TableField("description")
    private String description;

    /**
     * 状态：Y-有效，N-无效
     */
    @TableField("status")
    private String status;

    /**
     * 创建时间
     */
    @TableField("created_time")
    private Date createdTime;

    /**
     * 更新时间
     */
    @TableField("updated_time")
    private Date updatedTime;

    /**
     * 创建人
     */
    @TableField("created_by")
    private String createdBy;

    /**
     * 更新人
     */
    @TableField("updated_by")
    private String updatedBy;

}
