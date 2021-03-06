package pw.aru.libs.snowflake.snow64.entities;

import pw.aru.libs.snowflake.SnowflakeConfig;

import java.time.OffsetDateTime;

public interface Snow64Generator {
    SnowflakeConfig getConfig();

    Snow64Datacenter getDatacenter(long datacenter);

    default String generate(long datacenterId, long workerId) {
        return getWorker(datacenterId, workerId).generate();
    }

    default OffsetDateTime getCreationTime(long snowflake) {
        return getConfig().getCreationTime(snowflake);
    }

    default long getCreationTimeMillis(long snowflake) {
        return getConfig().getCreationTimeMillis(snowflake);
    }

    default Snow64Worker getWorker(long datacenterId, long workerId) {
        return getDatacenter(datacenterId).getWorker(workerId);
    }
}
