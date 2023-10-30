package com.weshare.mbg;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.Collections;

/**
 * @author Moncoder
 * @version 1.0
 * @description TODO MBG代码生成工具
 * @date 2023/10/30 18:28
 */
public class MyBatisPlusGenerator {
    public static void main(String[] args) {
        // 建立数据库连接 url username password
        FastAutoGenerator.create("jdbc:mysql://127.0.0.1:3306/weshare?characterEncoding=UTF-8" +
                "&useUnicode=true&useSSL=false","root","root")
                // 全局配置
                .globalConfig(builder -> {
                    builder.author("Moncoder")// 设置作者
                            //.enableSwagger()
                            .commentDate("yyyy-MM-dd HH:mm:ss")// 注释日期
                            .outputDir("weshare-mbg/src/main/java")// 指定输出目录
                            .disableOpenDir();// 禁止打开输出目录，默认打开
                })
                // 包配置
                .packageConfig(builder -> {
                    builder.parent("com.weshare.mbg")// 设置父包名
                            .pathInfo(Collections.singletonMap(OutputFile.xml, System.getProperty("user.dir") +
                                    "/weshare-mbg/src/main/resources/com/weshare/mbg/mapper"));// 设置mapperXml生成路径
                })
                // 策略配置
                .strategyConfig(builder -> {
                    // 设置需要生成的表名(所有表)
                    builder.addTablePrefix("sys_")// 设置过滤表前缀
                            // Entity 策略配置
                            .entityBuilder()
                            .enableLombok() // 开启 Lombok
                            .enableFileOverride()// 覆盖已生成文件
                            // 数据库表映射到实体的命名策略：下划线转驼峰命
                            .naming(NamingStrategy.underline_to_camel)
                            // 数据库表字段映射到实体的命名策略：下划线转驼峰命
                            .columnNaming(NamingStrategy.underline_to_camel)
                            // Mapper 策略配置
                            .mapperBuilder()
                            .enableFileOverride() // 覆盖已生成文件
                            // Service 策略配置
                            .serviceBuilder()
                            .enableFileOverride() // 覆盖已生成文件
                            // 格式化 service 接口文件名称，%s进行匹配表名，如 UserService
                            .formatServiceFileName("I%sService")
                            // 格式化 service 实现类文件名称，%s进行匹配表名，如 UserServiceImpl
                            .formatServiceImplFileName("%sServiceImpl")
                            // Controller 策略配置
                            .controllerBuilder()
                            .enableRestStyle()// 开启生成 @RestController 控制器
                            .enableFileOverride()// 覆盖已生成文件
                    ;
                })
                .execute();
    }
}
