package com.ohgiraffers.section02.lifecycle;

import org.junit.jupiter.api.*;

public class LifecycleAnnotationTests {

    /*
    * 모든 테스트 메소드와 라이프 사이클 관련 메소드는 abstract 이면 안되고, void 형으로 작성해야한다.
    * 또한 접근 제한자는 사용하지 않아도 되지만 (default), private 이면 안된다.
    * */

    @BeforeAll // 테스트가 시행되기 전 딱 한 번만 실행되는 코드
    public static void beforeAll() {
        System.out.println("beforeAll");
    }

    @BeforeEach // 각 테스트 파일 이전에 실행되는 코드
    public void beforeEach() {
        System.out.println("beforeEach");
    }

    @Test
    public void test1() {
        System.out.println("test1");
    }

    @Test
    public void test2() {
        System.out.println("test2");
    }

    /*
    * 각각의 테스트 메소드가 동작한 직후 동작한다.
    * @Test, @RepeatedTest, @ParameterizedTest, @testFactory 가 실행된 이후 동작한다.
    * 주로 단위 테스트 들이 수행된 이후 사용한 자원을 해체할 목적으로 사용한다.
    * */

    @AfterEach
    public void afterEach() {
        System.out.println("afterEach");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("afterAll");
    }

}
