package com.java.design.pattern.solid.solution.P3_LiskovSubstitutionPrinciple;

//Bad programming as WatsappUsers doesn't support publishPost and cannot do everthing what SocialMedia can do.
public class WatsappUsers extends SocialMedia implements GroupVCI{
    @Override
    public void chatWithFriends() {

    }

    @Override
    public void sendPhotosVideos() {

    }

    @Override
    public void groupVideoCall(String... users) {

    }
}
