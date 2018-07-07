package com.zhixiang.zhixiangmanage.common;

import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * <p>
 * 数据库连接池-Druid自带sql监控系统配置---访问地址  域名+/druid/index.html  用户名：kaka  密码：Kaka1234
 * </P>
 *
 * @author 张文旭
 * @since 2017年4月27日 下午5:56:22
 */
@Configuration
public class DruidConfiguration {

  private static final Logger log = LoggerFactory.getLogger(DruidConfiguration.class);

  @Bean
  public ServletRegistrationBean druidServlet() {
    log.info("init Druid Servlet Configuration ");
    ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean();
    servletRegistrationBean.setServlet(new StatViewServlet());
    servletRegistrationBean.addUrlMappings("/druid/*");
    Map<String, String> initParameters = new HashMap<String, String>();
    initParameters.put("loginUsername", "kaka");// 用户名
    initParameters.put("loginPassword", "Kaka1234");// 密码
    initParameters.put("resetEnable", "false");// 禁用HTML页面上的“Reset All”功能
    initParameters.put("allow", ""); // IP白名单 (没有配置或者为空，则允许所有访问)
    //initParameters.put("deny", "192.168.20.38");// IP黑名单 (存在共同时，deny优先于allow)
    servletRegistrationBean.setInitParameters(initParameters);
    return servletRegistrationBean;
  }

  @Bean
  public FilterRegistrationBean filterRegistrationBean() {
    FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
    filterRegistrationBean.setFilter(new WebStatFilter());
    filterRegistrationBean.addUrlPatterns("/*");
    filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*,*.html");
    return filterRegistrationBean;
  }

}