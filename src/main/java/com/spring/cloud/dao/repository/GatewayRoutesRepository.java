package com.spring.cloud.dao.repository;

import com.spring.cloud.entity.mongo.demo.GatewayRoutesMongoDb;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author XiongNeng
 * @version 1.0
 * @since 2018/3/3
 */
public interface GatewayRoutesRepository extends MongoRepository<GatewayRoutesMongoDb, String> {

}
