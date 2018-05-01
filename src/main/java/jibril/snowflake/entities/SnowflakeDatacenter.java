package jibril.snowflake.entities;

public interface SnowflakeDatacenter {
    long getDatacenterId();

    SnowflakeGenerator getGenerator();

    SnowflakeWorker getWorker(long worker);
}
