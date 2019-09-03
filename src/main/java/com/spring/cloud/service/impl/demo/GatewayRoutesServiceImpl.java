package com.spring.cloud.service.impl.demo;

import com.spring.cloud.entity.mysql.demo.GatewayRoutes;
import com.spring.cloud.dao.mapper.demo.GatewayRoutesMapper;
import com.spring.cloud.service.demo.IGatewayRoutesService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 网关路由表 服务实现类
 * </p>
 *
 * @author shennanb
 * @since 2019-09-02
 */
@Service
public class GatewayRoutesServiceImpl extends ServiceImpl<GatewayRoutesMapper, GatewayRoutes> implements IGatewayRoutesService {

}
