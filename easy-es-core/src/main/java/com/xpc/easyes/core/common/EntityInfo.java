package com.xpc.easyes.core.common;

import com.xpc.easyes.core.enums.IdType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * 实体类信息
 *
 * @ProjectName: easy-es
 * @Package: com.xpc.easyes.core.config
 * @Description: 实体类信息
 * @Author: xpc
 * @Version: 1.0
 * <p>
 * Copyright © 2021 xpc1024 All Rights Reserved
 **/
@Data
@Accessors(chain = true)
public class EntityInfo {

    /**
     * 表主键ID 类型
     */
    private IdType idType = IdType.NONE;
    /**
     * 索引名称
     */
    private String indexName;
    /**
     * 表映射结果集
     */
    private String resultMap;
    /**
     * 表主键ID 属性名
     */
    private String keyProperty;
    /**
     * 表主键ID 字段名
     */
    private String keyColumn;
    /**
     * 表字段信息列表
     */
    private List<EntityFieldInfo> fieldList;
    /**
     * 标记该字段属于哪个类
     */
    private Class<?> clazz;
    /**
     * 是否有id注解
     */
    private Boolean hasIdAnnotation;


    /**
     * 获取需要进行查询的字段列表
     *
     * @param predicate 过滤条件
     * @return sql 片段
     */
    public List<String> chooseSelect(Predicate<EntityFieldInfo> predicate) {
        return fieldList.stream()
                .filter(predicate)
                .map(EntityFieldInfo::getColumn)
                .collect(Collectors.toList());
    }

    /**
     * 获取需要进行查询的字段列表
     *
     * @return sql 片段
     */
    public List<String> chooseSelect() {
        return fieldList.stream()
                .map(EntityFieldInfo::getColumn)
                .collect(Collectors.toList());
    }

    /**
     * 获取不需要进行查询的字段列表
     *
     * @return
     */
    public List<String> notChooseSelect() {
        return fieldList.stream()
                .map(EntityFieldInfo::getIgnoreColumn)
                .collect(Collectors.toList());
    }

    public String getId() {
        return keyColumn;
    }
}
