package com.amayadream.webchat.core.dao;

import com.amayadream.webchat.core.model.GroupMember;

import java.util.List;

/**
 * @author : Amayadream
 * @date :   2017-05-23 14:05
 */
public interface IGroupMemberDao {

    List<GroupMember> list(Long groupId);

}