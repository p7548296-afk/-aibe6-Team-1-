package com.ll.framework.ioc;

import com.ll.domain.testPost.testPost.repository.TestPostRepository;
import com.ll.domain.testPost.testPost.service.TestPostService;

public class ApplicationContext {
    public ApplicationContext() {

    }

    @SuppressWarnings("unchecked")
    public <T> T genBean(String beanName) {
        if ("testPostService".equals(beanName)) {
            return (T) new TestPostService(new TestPostRepository());
        }

        return null;
    }
}
