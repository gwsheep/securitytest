package com.jproject.securitytest.controller;

import com.jproject.securitytest.dto.TestDto;
import com.jproject.securitytest.service.TestService;
import com.jproject.securitytest.vo.RequestVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;

    @GetMapping("/")
//    public ResponseEntity<?> test(@RequestBody RequestVO req) {
    public ResponseEntity<?> test(@RequestParam("name") String name,
                                  @RequestParam("msg") String msg) {

        log.info("==== test method 진입 ====");       //aop로 변경

        //일단 param으로 test
        RequestVO requestVO = new RequestVO();
        requestVO.setId(name);
        requestVO.setText(msg);
        TestDto testDto = testService.doTestBusinessLogic(requestVO);
        return ResponseEntity.status(HttpStatus.OK)
                .header("Content-Type", "application/json")
                .body(testDto);

    }

}
