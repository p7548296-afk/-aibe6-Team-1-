package com.ll.framework.ioc;

import com.ll.domain.testPost.testPost.repository.TestPostRepository;
import com.ll.domain.testPost.testPost.service.TestPostService;

public class ApplicationContext {
    private TestPostService testPostService;

    public ApplicationContext() {

    }

    @SuppressWarnings("unchecked")
    public <T> T genBean(String beanName) {
        if ("testPostService".equals(beanName)) {
            if (testPostService == null) {
                testPostService = new TestPostService(new TestPostRepository());
            }

            return (T) testPostService;
        }

        if ("testPostRepository".equals(beanName)) {
            return (T) new TestPostRepository();
        }

        return null;
    }
}
