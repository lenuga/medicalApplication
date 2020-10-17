//package com.medi.MedicalApplication.model;
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//import com.sun.istack.NotNull;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Transient;
//
//
//@Entity
//@Data
//@AllArgsConstructor
//public class User{
//
//    @Id
//    private Long id;
//
//    @NotNull
//    @Column(unique = true)
//    private String username;
//    @NotNull
//    private String password;
//
//    @Transient
//    private String confirmPassword;
//
//    public User() {
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    @Override
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    @Override
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getConfirmPassword() {
//        return confirmPassword;
//    }
//
//    public void setConfirmPassword(String cofirmPassword) {
//        this.confirmPassword = cofirmPassword;
//    }
//
//    /* UserDetails Interface */
//
//    @Override
//    @JsonIgnore
//    public Collection<? extends GrantedAuthority> getAuthorities() { return null; }
//
//    @Override
//    @JsonIgnore
//    public boolean isAccountNonExpired() { return true; }
//
//    @Override
//    @JsonIgnore
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    @JsonIgnore
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    @JsonIgnore
//    public boolean isEnabled() {
//        return true;
//    }
//
//    public void setConfirmPassword(String s) {
//    }
//}
