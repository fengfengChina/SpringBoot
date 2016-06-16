package com.zf.config;

import com.zf.config.CustomUserDetailsService.Role;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;
import java.util.Collections;

/**
 * CurrentUser
 *
 * @author zf
 * @date 16/6/15
 */
public class CurrentUser extends User {

    private com.zf.domain.User user;

    public CurrentUser (com.zf.domain.User user){
        super(user.getUserName(),user.getPassword(),true,true,true,true, Collections.singleton(new Role()));
        this.user = user;
    }

    public CurrentUser(String username, String password, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);
    }

    public CurrentUser(String username, String password, boolean enabled, boolean accountNonExpired, boolean credentialsNonExpired, boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
    }
//    static class Role implements GrantedAuthority{
//        private String name = "user";
//        @Override
//        public String getAuthority() {
//            return name;
//        }
//    }
}
