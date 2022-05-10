package com.java.design.pattern.solid.problem.P3_LiskovSubstitutionPrinciple;

//Bad programming as InstagramUsers doesn't support groupVideoCall and cannot do everthing what SocialMedia can do.
public class InstagramUsers extends SocialMedia {
    @Override
    public void chatWithFriends() {

    }

    @Override
    public void sendPhotosVideos() {

    }

    @Override
    public void groupVideoCall(String... users) {
        //Not applicable as it can't groupVideoCall
    }

    @Override
    public void publishPost(Object post) {

    }
}
