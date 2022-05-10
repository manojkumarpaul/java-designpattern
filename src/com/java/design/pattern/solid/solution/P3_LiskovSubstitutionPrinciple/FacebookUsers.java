package com.java.design.pattern.solid.solution.P3_LiskovSubstitutionPrinciple;

//All good since FacebookUsers can do what SocialMedia can do.
public class FacebookUsers extends SocialMedia implements PublishPostI, GroupVCI {
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
