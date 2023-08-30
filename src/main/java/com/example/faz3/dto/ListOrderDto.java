package com.example.faz3.dto;

import lombok.*;

import java.util.List;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ListOrderDto {
    List<OrderDto> list;
}
