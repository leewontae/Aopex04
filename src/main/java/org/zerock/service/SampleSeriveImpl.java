package org.zerock.service;

import org.springframework.stereotype.Service;
// 서비스 계층 설계
@Service
//스프링 빈으로 사용 할수 있도록 한다. @controller , @repository는 기능은 넣어 주는게 아니라 명시적으로 구분하기위해 사용한다.
public class SampleSeriveImpl implements SampleService {
    @Override
    public Integer doAdd(String str1, String str2) throws Exception {


        return Integer.parseInt(str1) + Integer.parseInt(str2);
    }
}
