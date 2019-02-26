package br.com.erivelto.restfulteste.core.config.jwt.filter;

import br.com.erivelto.restfulteste.core.config.jwt.service.TokenAuthenticationService;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.GenericFilterBean;
import org.springframework.security.core.Authentication;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;


/**
 * Create by erivelto on 25/02/19
 */
public class JWTAuthenticationFilter extends GenericFilterBean {

    public void doFilter(ServletRequest request,
                         ServletResponse response,
                         FilterChain filterChain
    ) throws IOException, ServletException {

        Authentication authentication = TokenAuthenticationService.getAuthentication((HttpServletRequest) request);

        SecurityContextHolder.getContext().setAuthentication(authentication);

        filterChain.doFilter(request, response);
    }

}