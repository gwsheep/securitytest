package com.jproject.securitytest.service;

import com.jproject.securitytest.dto.TestDto;
import com.jproject.securitytest.repository.TestRepository;
import com.jproject.securitytest.vo.RequestVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TestService {

    private final TestRepository testRepository;

    public TestDto doTestBusinessLogic(RequestVO req) {

        String parsedMsg = testRepository.parse(req.getText());

        TestDto testDto = new TestDto();
        testDto.setName(req.getId());
        testDto.setText(parsedMsg);
        return testDto;

    }



}
