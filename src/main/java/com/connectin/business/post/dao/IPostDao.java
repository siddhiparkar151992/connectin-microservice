package com.connectin.business.post.dao;

import com.connectin.domain.post.PostDTO;
import com.connectin.exceptions.ConnectinBaseException;

import java.util.List;

public interface IPostDao {
    List<PostDTO> getPostsByUser(int userId) throws ConnectinBaseException;

    List<PostDTO> getPostsByFeed(int[] connections) throws ConnectinBaseException;

}
