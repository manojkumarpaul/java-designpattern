package com.java.design.pattern.solid.problem.P3_LiskovSubstitutionPrinciple;

//Bad programming as WatsappUsers doesn't support publishPost and cannot do everthing what SocialMedia can do.
public class WatsappUsers extends SocialMedia {
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
        //Not applicable as it can't publishPost
    }
}
