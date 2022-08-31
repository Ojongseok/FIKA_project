package com.example.fika_project.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\tJ\r\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\fJ\r\u0010\r\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\fJ\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fJ\b\u0010\u0011\u001a\u0004\u0018\u00010\u000fJ\u0006\u0010\u0012\u001a\u00020\u000fJ\b\u0010\u0013\u001a\u0004\u0018\u00010\u000fJ\r\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\fJ\r\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\fJ\u0010\u0010\u0016\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000fJ\u000e\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u000bJ\u000e\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u000bJ\u000e\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u000fJ\u000e\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u000fJ\u0010\u0010 \u001a\u00020\t2\b\u0010!\u001a\u0004\u0018\u00010\u000fJ\u000e\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\u000fJ\u000e\u0010$\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u000bJ\u000e\u0010&\u001a\u00020\t2\u0006\u0010\'\u001a\u00020\u000bR\u0019\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006("}, d2 = {"Lcom/example/fika_project/utils/spfManager;", "", "()V", "editor", "Landroid/content/SharedPreferences$Editor;", "kotlin.jvm.PlatformType", "getEditor", "()Landroid/content/SharedPreferences$Editor;", "ClearJwt", "", "getCourseId", "", "()Ljava/lang/Integer;", "getDramaId", "getEmail", "", "getImgUrl", "getJwt", "getKakaoJwt", "getNickname", "getReviewId", "getSpotId", "saveKakaoJwt", "kakaoToken", "setCourseId", "courseId", "setDramaId", "dramaId", "setEmail", "email", "setImgUrl", "imgUrl", "setJwt", "jwtToken", "setNickname", "nickname", "setReviewId", "reviewId", "setSpotId", "spotId", "app_debug"})
public final class spfManager {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.fika_project.utils.spfManager INSTANCE = null;
    private static final android.content.SharedPreferences.Editor editor = null;
    
    private spfManager() {
        super();
    }
    
    public final android.content.SharedPreferences.Editor getEditor() {
        return null;
    }
    
    public final void saveKakaoJwt(@org.jetbrains.annotations.Nullable()
    java.lang.String kakaoToken) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getKakaoJwt() {
        return null;
    }
    
    public final void ClearJwt() {
    }
    
    public final void setJwt(@org.jetbrains.annotations.Nullable()
    java.lang.String jwtToken) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getJwt() {
        return null;
    }
    
    public final void setDramaId(int dramaId) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getDramaId() {
        return null;
    }
    
    public final void setEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String email) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEmail() {
        return null;
    }
    
    public final void setNickname(@org.jetbrains.annotations.NotNull()
    java.lang.String nickname) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNickname() {
        return null;
    }
    
    public final void setCourseId(int courseId) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getCourseId() {
        return null;
    }
    
    public final void setSpotId(int spotId) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getSpotId() {
        return null;
    }
    
    public final void setReviewId(int reviewId) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getReviewId() {
        return null;
    }
    
    public final void setImgUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String imgUrl) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getImgUrl() {
        return null;
    }
}