package com.xpc.easyes.core.config;

import com.xpc.easyes.core.enums.FieldStrategy;
import com.xpc.easyes.core.enums.IdType;
import com.xpc.easyes.core.enums.ProcessIndexStrategyEnum;
import com.xpc.easyes.core.enums.RefreshPolicy;
import lombok.Data;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

import static com.xpc.easyes.core.constants.BaseEsConstants.EMPTY_STR;

/**
 * easy-es全局置项
 * <p>
 * Copyright © 2022 xpc1024 All Rights Reserved
 **/
@Data
public class GlobalConfig {
    /**
     * whether to print dsl log 是否打印执行的dsl语句
     */
    private boolean printDsl = true;
    /**
     * process index mode Smoothly by default 索引处理模式 默认开启平滑模式
     */
    private ProcessIndexStrategyEnum processIndexMode = ProcessIndexStrategyEnum.SMOOTHLY;
    /**
     * process index blocking main thread true by default 异步处理索引是否阻塞主线程 默认阻塞
     */
    private boolean asyncProcessIndexBlocking = true;
    /**
     * is distributed environment true by default 是否分布式环境 默认为是
     */
    private boolean distributed = true;

    /**
     * es db config 数据库配置
     */
    @NestedConfigurationProperty
    private DbConfig dbConfig = new DbConfig();

    /**
     * es db config 数据库配置
     */
    @Data
    public static class DbConfig {
        /**
         * index prefix eg:daily_, 索引前缀 可缺省
         */
        private String tablePrefix = EMPTY_STR;
        /**
         * enable underscore to camel case default false 是否开启下划线自动转驼峰 默认关闭
         */
        private boolean mapUnderscoreToCamelCase = false;
        /**
         * es id generate type. es id生成类型 默认由es自动生成
         */
        private IdType idType = IdType.NONE;
        /**
         * Field update strategy default nonNull 字段更新策略,默认非null
         */
        private FieldStrategy fieldStrategy = FieldStrategy.NOT_NULL;
        /**
         * enableTrackTotalHits default false,是否开启查询全部数据 默认关闭, 当指定size超过1万条时自动开启
         */
        private boolean enableTrackTotalHits = false;
        /**
         * data refresh policy 数据刷新策略,默认为NONE
         */
        private RefreshPolicy refreshPolicy = RefreshPolicy.NONE;
        /**
         * must convert to filter must by default, must 条件转filter 默认不转换
         */
        private boolean enableMust2Filter = false;
    }
}
