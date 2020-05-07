package com.jace.springboot.web.Dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class DevResponseDto {

    private final String name;
    private final int amount;
}
