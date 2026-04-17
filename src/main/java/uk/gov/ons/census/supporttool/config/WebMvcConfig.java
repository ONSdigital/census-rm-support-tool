package uk.gov.ons.census.supporttool.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import uk.gov.ons.census.supporttool.security.AuthUser;
import uk.gov.ons.census.supporttool.security.UserIdentityInterceptor;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
  private final AuthUser authUser;

  public WebMvcConfig(AuthUser authUser) {
    this.authUser = authUser;
  }

  @Override
  public void addInterceptors(InterceptorRegistry registry) {
    registry.addInterceptor(new UserIdentityInterceptor(authUser));
  }
}
