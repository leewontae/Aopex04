package org.zerock.service;

import lombok.Setter;
import lombok.extern.log4j.Log4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@Log4j
@ContextConfiguration({"file:webapp/WEB-INF/applicationContext.xml"})
public class SampleServiceTests {

    @Setter(onMethod_= @Autowired)
    private SampleService service;

    @Test
    public void testClass(){
        log.info(service);
        log.info(service.getClass().getName());
        //AOP 설정을 한 Target에 대해서 Proxy 객체가 정상적으로 만들어져 있는지 확인 하는 것이다.
        //여기서 test 하는것은 SampleServiceImpl의 인스턴스가 아닌 생성된 Proxy 클래스의 인스턴스가 된다.
    }
    @Test
    public void testAdd() throws Exception{
        log.info(service.doAdd("1234","345"));
    }

    @Test
    public void testAddError() throws Exception{
        log.info(service.doAdd("123","ABC"));
    }
    //이 코드는 test를 위해 임의적으로 오류 코드 실행 한거다


}
