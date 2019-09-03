package com.spring.cloud.service.impl.demo;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.spring.cloud.dao.mapper.demo.GatewayRoutesMapper;
import com.spring.cloud.dao.repository.GatewayRoutesRepository;
import com.spring.cloud.entity.mongo.demo.GatewayRoutesMongoDb;
import com.spring.cloud.entity.mysql.demo.GatewayRoutes;
import com.spring.cloud.service.demo.IGatewayRoutesService;
import org.springframework.beans.factory.annotation.Autowired;
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
public class GatewayRoutesMongoService{

    @Autowired
    private GatewayRoutesRepository repository;

    public GatewayRoutesMongoDb add(GatewayRoutesMongoDb gatewayRoutes){
        return repository.insert(gatewayRoutes);
    }

    /**
     * 删除所有的客户
     */
    public void deleteAll() {
        repository.deleteAll();
    }


    public Iterable<GatewayRoutesMongoDb> findAll() {
        return repository.findAll();
    }
}
