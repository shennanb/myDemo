package com.spring.cloud.entity.mongo.demo;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 网关路由表
 * </p>
 *
 * @author shennanb
 * @since 2019-09-02
 */

@Data
@Document(collection = "gatewayRoutes")
public class GatewayRoutesMongoDb implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * id
     */
    @Id
    private String id;

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
