package com.hourtracker.HourTracker.security;

import com.hourtracker.HourTracker.domain.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class CustomSecurityUser extends User implements UserDetails {

    private static final long serialVersionUID = -1773705251828015574L;

    public CustomSecurityUser() {}

    public CustomSecurityUser(User user){
        this.setAuthorities(user.getAuthorities());
        this.setId(user.getId());
        this.setName(user.getName());
        this.setEmployer(user.getEmployer());
        this.setUsername(user.getUsername());
        this.setPassword(user.getPassword());
        this.setPayScale(user.getPayScale());
    }

    Set<Authority> authorities = new HashSet<>();

    @Override
    public Set<Authority> getAuthorities() {
        return this.getAuthorities();
    }

    @Override
    public String getPassword() {
        return this.getPassword();
    }

    @Override
    public String getUsername() {
        return this.getUsername();
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
