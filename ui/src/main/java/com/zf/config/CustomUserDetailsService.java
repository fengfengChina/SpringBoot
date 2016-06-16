package com.zf.config;

import com.zf.dao.UserMapper;
import com.zf.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;

/**
 * CustomUserDetailsService
 *
 * @author zf
 * @date 16/6/14
 */
@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String phone) throws UsernameNotFoundException {
        User user = userMapper.selectByUserName(phone);
        if (user != null) {
            throw new UsernameNotFoundException(String.format("User %s does not exist",phone));
        }
        return new CurrentUser(user);
    }

    private final static class UserDetailsInfo extends User implements UserDetails{

        private static final long serialVersionUID = 1L;

        private UserDetailsInfo(User user) {
            super(user);
        }

        @Override
        public Collection<? extends GrantedAuthority> getAuthorities() {
            return Collections.singleton(new Role());
        }

        @Override
        public String getUsername() {
            return getUserName();
        }

        @Override
        public boolean isAccountNonExpired() {
            return true;
        }

        @Override
        public boolean isAccountNonLocked() {
            return true;
        }

        @Override
        public boolean isCredentialsNonExpired() {
            return true;
        }

        @Override
        public boolean isEnabled() {
            return true;
        }
    }

    static class Role implements GrantedAuthority{
        private String name = "user";
        @Override
        public String getAuthority() {
            return name;
        }
    }

}
