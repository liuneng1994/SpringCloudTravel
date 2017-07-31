package spring.cloud.travel.auth.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.redis.connection.RedisConnectionFactory
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer
import org.springframework.security.oauth2.provider.approval.TokenApprovalStore
import org.springframework.security.oauth2.provider.token.TokenStore
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore
import org.springframework.security.oauth2.provider.token.store.redis.RedisTokenStore

/**
 * Created by neng.liu@hand-china.com on 2017/7/31.
 */
@Configuration
class AuthConfiguration: AuthorizationServerConfigurerAdapter(){
    override fun configure(security: AuthorizationServerSecurityConfigurer?) {
        super.configure(security)

    }

    @Bean
    fun tokenStore(redisConnectionFactory: RedisConnectionFactory): TokenStore {
        val tokenStore = JwtTokenStore(JwtAccessTokenConverter())
        val tokenApprovalStore = TokenApprovalStore()
        val redisStore = RedisTokenStore(redisConnectionFactory)
        tokenApprovalStore.setTokenStore(redisStore)
        tokenStore.setApprovalStore(tokenApprovalStore)
        return tokenStore
    }
}