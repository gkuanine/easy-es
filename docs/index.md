> EE索引模块提供了如下API,供用户进行便捷调用
> - indexName需要用户手动指定
> - 对象 Wrapper 为 条件构造器

```java
	// 是否存在索引
    Boolean existsIndex(String indexName);
	// 创建索引
    Boolean createIndex(LambdaEsIndexWrapper<T> wrapper);
	// 更新索引
    Boolean updateIndex(LambdaEsIndexWrapper<T> wrapper);
	// 删除指定索引
    Boolean deleteIndex(String indexName);
```
接口对应代码演示请根据名称点击大纲进入具体页面查看