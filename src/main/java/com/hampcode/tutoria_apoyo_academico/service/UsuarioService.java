package com.hampcode.tutoria_apoyo_academico.service;

public class UsuarioService {
    List<UsuarioResponseDTO> getAllUsers();

    User createUser(UserRequestDTO userRequestDTO);
    User updateUser(Integer userId, UserRequestDTO userDTO);
    User getUserbyId(Integer userId);
    Optional<User> findByEmail(String email);
    void deleteUser(Integer userId);
    boolean authenticateUser(String email, String password);
    User associateProfileWithUser(int userId, String profileId);
    User dessasociateProfileWithUser(int userId);
    void followUser(Integer userId, Integer followerId);
    void removeFollowUser(Integer userId, Integer followedUserId);
}
