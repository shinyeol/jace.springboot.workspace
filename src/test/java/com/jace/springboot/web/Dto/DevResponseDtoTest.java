package com.jace.springboot.web.Dto;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class DevResponseDtoTest {
    @Test
    public void 롬복_기능_테스트() {
        String name = "test";
        int amount = 10000;

        DevResponseDto dto = new DevResponseDto(name, amount);

        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
