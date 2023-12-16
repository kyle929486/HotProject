/**
 * #민호
 */

package com.lec.spring.service;

import com.lec.spring.domain.User;
import com.lec.spring.domain.role;

import java.util.List;

public interface UserService {








    // username(회원 아이디) 의 User 정보 읽어오기




    // 특정 username(회원 아이디) 의 회원이 존재하는지 확인

    boolean isExist(String username);
    boolean isExistNick(String nickname);
    boolean isExistEmail(String email);




    // 신규 회원 등록
   int signup(User user);


    // 특정 사용자(id)의 authority(들)
    List<role> selectAuthoritiesById(Long id);

    User findByUsername(String username);

    User findByNickname(String nickname);

    User findByEmail(String email);


    Long findByuid(String username);

    void likeTour(Long userId, Long tourId);

    void unlikeTour(Long uid, Long id);
}
