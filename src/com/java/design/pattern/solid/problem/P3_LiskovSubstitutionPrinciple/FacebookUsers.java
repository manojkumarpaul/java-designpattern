package com.java.design.pattern.solid.problem.P3_LiskovSubstitutionPrinciple;

//All good since FacebookUsers can do what SocialMedia can do.
public class FacebookUsers extends SocialMedia {
    @Override
    public void chatWithFriends() {

    }

    @Override
    public void sendPhotosVideos() {

    }

    @Override
    public void groupVideoCall(String... users) {

    }

    @Override
    public void publishPost(Object post) {

    }
}
