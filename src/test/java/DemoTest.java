
import java.util.Date;
import java.util.concurrent.TimeUnit;

import com.DemoApplication;
import com.spring.cloud.dao.repository.GatewayRoutesRepository;
import com.spring.cloud.entity.mongo.demo.GatewayRoutesMongoDb;
import com.spring.cloud.redis.util.RedisHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author shennanb
 * @date 2019/9/2 19:04
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class DemoTest {

    @Autowired
    private GatewayRoutesRepository repository;

    @org.junit.Test
    public void testMongoDb() {
        GatewayRoutesMongoDb g = new GatewayRoutesMongoDb();
        g.setRouteId("");
        g.setUri("");
        g.setPredicates("");
        g.setFilters("");
        g.setOrders(0);
        g.setDescription("");
        g.setStatus("");
        g.setCreatedTime(new Date());
        g.setUpdatedTime(new Date());
        g.setCreatedBy("");
        g.setUpdatedBy("");
        repository.insert(g);
        System.out.println("insert success");
    }

    @Autowired
    private RedisTemplate redisTemplate;

    @org.junit.Test
    public void testRedis() {
        RedisHelper.set(redisTemplate,"set01","set01");
        RedisHelper.set(redisTemplate,"set02","set02");
        String set02 = RedisHelper.get(redisTemplate, "set02");
        System.out.println(set02);

        RedisHelper.delete(redisTemplate, "set02");
        String set021 = RedisHelper.get(redisTemplate, "set02");
        System.out.println(set021);

        RedisHelper.set(redisTemplate,"set03","set03",60l, TimeUnit.MINUTES);

        boolean b = RedisHelper.setNX(redisTemplate, "set03", "set031");
        System.out.println(b);

        boolean b1 = RedisHelper.setNX(redisTemplate, "set04", "set04");
        System.out.println(b1);


        RedisHelper.addSet(redisTemplate,"setKey01","setValue01","setValue02","setValue03");
    }

}
