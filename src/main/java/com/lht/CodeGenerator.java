package com.lht;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.TemplateConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

public class CodeGenerator {

	public static void main(String[] args) {
		CodeGenerator.gen("Dravid", "tb_user");
		CodeGenerator.gen("Dravid", "tbl_employee");
	}

	/**
	 * 生成代码
	 * 
	 * @param author    开发人员
	 * @param tableName 要生成表的名字
	 */
	private static void gen(String author, String tableName) {
		AutoGenerator mpg = new AutoGenerator()
				/**
				 * 数据源配置
				 */
				.setDataSource(new DataSourceConfig().setDbType(DbType.MYSQL)// 可以不写默认的数据库类型为MYSQL
						.setUsername("root")// 用户名
						.setPassword("123456")// 密码
						.setUrl("jdbc:mysql://localhost:3306/lht_mp?useSSL=false&useUnicode=true&characterEncoding=utf-8&zeroDateTimeBehavior=convertToNull&autoReconnect=true")// URL
						.setDriverName("com.mysql.cj.jdbc.Driver")// 驱动名
				)
				/**
				 * 全局配置
				 */
				.setGlobalConfig(new GlobalConfig().setOutputDir(System.getProperty("user.dir") + "/src/main/java")// 文件输出目录
						.setFileOverride(true)// 是否覆盖目录
						.setOpen(false)// 是否打开文件夹
						.setActiveRecord(false)// 开启 activeRecord模式 默认false
						.setEnableCache(false)// XML 二级缓存
						.setBaseResultMap(false)// XML resultmap
						.setBaseColumnList(true)// XML columList
						.setAuthor(author)// 开发人员
						.setEntityName("%s")// 实体类命名方式
						.setMapperName("I%sDao")// mapper命名方式
						.setXmlName("%sMapper")// Mapper xml命名方式
						.setServiceName("I%sServie")// service接口命名方式
						.setServiceImplName("%sServiceImpl")// service实现类命名方式
						.setControllerName("%sController")// controller类命名方式
						.setIdType(IdType.AUTO)// 指定生成主键ID的类型
				)
				/**
				 * 数据库表策略配置
				 */
				.setStrategy(new StrategyConfig().setCapitalMode(false)// 全局大写命名
						.setNaming(NamingStrategy.underline_to_camel)// 表名生成策略
						.setInclude(new String[] { tableName })// 需要生成的表
						.setEntityLombokModel(true)// 实体类是否开启lombok模式
						.setRestControllerStyle(false)// 是否开启RestController模式
						.setEntityBooleanColumnRemoveIsPrefix(true)// Boolean类型字段是否移除is前缀处理
				)
				/**
				 * 指定使用freemarker模版引擎（默认使用的是velocity）
				 */
				.setTemplateEngine(new FreemarkerTemplateEngine())
				/**
				 * 模板文件设置(自定义自己模板文件的位置)
				 */
				.setTemplate(new TemplateConfig().setController("/templates/controller.java")// controller模版的路径
						.setService("/templates/service.java")// service模版的路径
						.setServiceImpl("/templates/serviceImpl.java")// serviceImpl模版的路径
						.setMapper("/templates/dao.java")// dao模版的路径
						.setXml("/templates/mapper.xml")// mapper模版的路径
						.setEntity("/templates/pojo.java"))// 实体类模版的路径
				/**
				 * 包名配置
				 */
				.setPackageInfo(
						new PackageConfig().setModuleName(NamingStrategy.underlineToCamel(tableName).toLowerCase())
								.setParent("com.lht.bussiness")// 父包名
								.setEntity("pojo")// 实体类的包名
								.setMapper("dao")// mapper包名
								.setXml("mapper")// mapper xml包名
								.setService("service")// service包名
								.setServiceImpl("service.impl")// service实现类包名
								.setController("controller")// controller类包名
				)// end
		;
		mpg.execute();
	}
}