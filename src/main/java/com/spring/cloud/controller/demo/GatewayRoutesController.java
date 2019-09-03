package com.spring.cloud.controller.demo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.netflix.discovery.converters.Auto;
import com.spring.cloud.api.demo.GatewayRoutesApi;
import com.spring.cloud.entity.mysql.demo.GatewayRoutes;
import com.spring.cloud.service.demo.IGatewayRoutesService;
import core.entity.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 网关路由表 前端控制器
 * </p>
 *
 * @author shennanb
 * @since 2019-09-02
 */

@RestController
@RequestMapping("/gateway")
public class GatewayRoutesController implements GatewayRoutesApi {

    @Autowired
    private IGatewayRoutesService gatewayRoutesService;

    @PostMapping
    public Result add(@RequestBody GatewayRoutes gatewayRoutes){
        gatewayRoutesService.save(gatewayRoutes);
        return Result.success(gatewayRoutes);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable(name = "id") Long id){
        boolean save = gatewayRoutesService.removeById(id);
        return Result.success();
    }

    @PutMapping("/{id}")
    public Result update(@PathVariable(name = "id") Long id ,@RequestBody GatewayRoutes gatewayRoutes){
        boolean rId = gatewayRoutesService.update(gatewayRoutes, new QueryWrapper<GatewayRoutes>().eq("id", id));
        GatewayRoutes byId = gatewayRoutesService.getById(rId);
        return Result.success(byId);
    }

    @GetMapping("/{id}")
    public Result get(@PathVariable(name = "id") Long id ){
        GatewayRoutes byId = gatewayRoutesService.getById(id);
        return Result.success(byId);
    }
}
