package com.austral.jibberjabberusers.services;

import com.austral.jibberjabberusers.dto.CreateUserDto;
import com.austral.jibberjabberusers.dto.ReducedUserDto;
import com.austral.jibberjabberusers.dto.UserListingDto;

public interface UserService {

    ReducedUserDto createUser(CreateUserDto createUserDto);

    ReducedUserDto getUserById(String userId);

    UserListingDto getAllUsers();

    ReducedUserDto editUser(ReducedUserDto updatedUser, String userId);

    ReducedUserDto findByUsername(String username);

}
