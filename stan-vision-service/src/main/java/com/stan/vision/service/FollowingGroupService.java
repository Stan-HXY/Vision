package com.stan.vision.service;

import com.stan.vision.dao.FollowingGroupDAO;
import com.stan.vision.domain.FollowingGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FollowingGroupService {

    @Autowired
    private FollowingGroupDAO followingGroupDAO;

    public FollowingGroup getByType(String type){
        return followingGroupDAO.getByType(type);
    }

    public FollowingGroup getByID(Long id){
        return followingGroupDAO.getByID(id);
    }

    public List<FollowingGroup> getByUserID(Long userID) {
        return followingGroupDAO.getByUserID(userID);
    }

    public void addFollowingGroup(FollowingGroup followingGroup) {
        followingGroupDAO.addFollowingGroup(followingGroup);
    }

    public List<FollowingGroup> getUserFollowingGroups(Long userID) {
        return followingGroupDAO.getUserFollowingGroups(userID);
    }
}
