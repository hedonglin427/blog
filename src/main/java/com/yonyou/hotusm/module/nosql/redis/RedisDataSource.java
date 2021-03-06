package com.yonyou.hotusm.module.nosql.redis;

import redis.clients.jedis.Jedis;

public interface RedisDataSource {
	
    public abstract Jedis getRedisClient();
    public void returnResource(Jedis shardedJedis);
    public void returnResource(Jedis shardedJedis,boolean broken);
}
