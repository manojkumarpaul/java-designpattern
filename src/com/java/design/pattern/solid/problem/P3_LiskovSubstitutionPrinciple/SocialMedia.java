package com.java.design.pattern.solid.problem.P3_LiskovSubstitutionPrinciple;

abstract class SocialMedia {
    //supported facebook,instagram,watsapp,
    public abstract void chatWithFriends();
    //supported facebook,instagram,watsapp,
    public abstract void sendPhotosVideos();
    //supported facebook,watsapp
    public abstract void groupVideoCall(String... users);
    //supported facebook,instagram
    public abstract void publishPost(Object post);

}
