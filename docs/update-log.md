~~0.9.0 初次发布至Maven中央仓库,由于缺乏经验,导致项目虽然正常推至中央仓库,但无法通过IDE下载(会报错)~~

~~0.9.1 调整了项目分层结构,修复了上一版本无法通过IDE下载的问题.~~

~~0.9.2 修复了上一版本由fastjson(~~[~~1.2.62~~](https://github.com/alibaba/fastjson/issues/2780)~~)本身的缺陷带来的查询报错问题.~~

~~0.9.3 重命名了启动模块,启动模块原名称英文单词打错了,新增了英文文档.~~

~~0.9.4 修复用户提出的issue,配置项新增Es性能配置参数等更多配置项~~

~~0.9.5~~
~~集成了GEO相关API~~~~~~索引分词器创建/更新等~~~~~~升级FastJson至最新版本~~

~~0.9.6~~
~~1.修复群内用户反馈的物理分页指定分页参数后无效的问题~~
~~2.更新/批量更新相关api字段获取添加本地缓存,进一步提升性能,优化后和原生查询性能相当.~~
~~3.新增支持用户自定义ID功能,ID值可由用户传入,insert/batchInsert接口 当ID不存在时,新增该数据,当ID在es中已存在时,则自动更新该数据.~~
~~4.新增性能测试模块,代码和测试数据在sample.test.performanceTest中,经过代码实测,印证了我顾虑粉碎模块中的理论分析,经实测,CURD中仅查询会比直接使用RestHighLevelClient慢10-15毫秒,其它无明显差异,且从第二次查询后,字段缓存生效,基本没有差异,大可放心使用.~~
~~5.新增混合查询文档,帮助各位完美解决近期碰到的EE功能不支持问题~~

~~0.9.7~~
~~1.新增插件模块,用户可在此模块自定义插件,目前已有人贡献拦截器插件供大家使用~~
~~2.新增高亮自定义绑定实体字段功能,无需使用半原生接口查询,进一步简化使用~~
~~3.优化了对自定义Id的数类型支持,支持所有数据类型(此前仅支持String)~~
~~4.新增排序自定义功能,用户可自定义SortBuilder,使用起来更加灵活和简单.~~
~~5.新增对地理位置排除的功能,针对geoBoundingBox,geoDistance,geoPloygen,geoShape皆有支持~~
~~6.新增控制台DSL日志打印功能 可帮助用户更快定位问题~~
~~7.排序可直接传入字符串,可以像MySQL那样直接把排序字段和规则托管给前端,更加方便和低码~~
~~8.新增对查询超过1W条的支持,查询超1w条时trackTotalHits自动开启~~
~~9.修复1处日志打印format异常的小缺陷~~
~~10.新增得分排序功能~~
~~11.优化了selectOne方法查询超过1条数据时的提示文案,并解决了添加limit(1)不生效的缺陷.~~

~~0.9.8~~
~~1.新增下划线自动转驼峰功能~~
~~2.新增自定义字段名称功能~~
~~3.分页参数增加对0及负数等无意义入参的兼容~~
~~4.分页总页数参数返回 @idefined 贡献~~
~~5.重构和优化了大量代码 进一步提升了代码复用度和性能~~
~~6.新增了索引名称传入字符串功能,可支持更多灵活场景~~
~~7.修复1处删除数据时自定义主键为自定义类型无法删除数据的缺陷~~

~~0.9.9~~
~~1.跳过此版本,因为网络问题,丢失了一部分依赖,致使此版本无法正常下载,可直接选用0.9.10版本~~

~~0.9.10~~
~~1.新增索引托管模式-平滑模式~~
~~1.新增索引托管模式-非平滑模式~~
~~1.新增索引托管模式-手动模式~~

~~0.9.11~~
~~1.自动创建索引日志打印优化,打印更多各种级别的日志 便于用于定位当前处理到哪一步~~
~~1.自动创建索引新增了通过注解对分片及副本数的配置~~
~~1.优化了配置项,使用时有默认值及提示信息 提升用户体验~~
~~1.优化了配置项的载入方式,将不再被用户自己配置的RestHighLevelClient覆盖,以此支撑用户同时使用Easy-Es和SpringData-Es的场景~~
~~1.引入了日期format注解配置及api方式创建索引日期格式化,以支撑日期格式化功能~~
~~1.重构了璐先生贡献的拦截器链链中部分不合理代码,提高代码可读性.~~
~~1.修复一处geoAPI下划线自动转驼峰未生效缺陷.~~
~~1.修复一处非String类型在NOT_EMPTY字段策略下,执行Insert时未赋值的情况~~

~~[v0.9.12](https://gitee.com/dromara/easy-es/releases/V0.9.12)~~

持续更新中...

> **Tip**
> 已发布的版本会被用删除线标记

