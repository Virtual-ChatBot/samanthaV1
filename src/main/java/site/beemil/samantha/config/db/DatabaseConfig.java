package site.beemil.samantha.config.db;

import javax.sql.DataSource;

import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import site.beemil.samantha.util.SshTunnelingUtil;

@Configuration
@RequiredArgsConstructor
public class DatabaseConfig {

	private final SshTunnelingUtil sshTunnelingUtil;

	@Bean
	@ConfigurationProperties(prefix = "spring.datasource.hikari")
	public HikariConfig hikariConfig() {
		return new HikariConfig();
	}

	@Bean
	public DataSource dataSource(HikariConfig hikariConfig) {
		// SSH 연결
		//sshTunnelingUtil.buildSshConnection();

		return new HikariDataSource(hikariConfig);
	}

	@Bean
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception{
		final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		sessionFactory.setDataSource(dataSource);
		PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();

		//mybatis-config 연결
		sessionFactory.setConfigLocation(resolver.getResource("mapper/mybatis-config.xml"));

		//mapper 직접 연결
		//sessionFactory.setMapperLocations(resolver.getResources("mapper/*.xml"));

		return sessionFactory.getObject();
	}

	@Bean
	public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) throws Exception{
        return new SqlSessionTemplate(sqlSessionFactory);
	}
}