import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Enki
 * @version 1.0
 * @title MyBatisConfig
 * @description
 * @create 2024/7/16 16:56
 */
@Configuration
@MapperScan("com.enki.mbg.mapper")
public class MyBatisConfig {
}