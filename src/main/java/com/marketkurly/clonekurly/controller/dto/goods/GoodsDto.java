package com.marketkurly.clonekurly.controller.dto.goods;

import lombok.Builder;
import lombok.Getter;

import javax.persistence.Column;

@Getter
@Builder
public class GoodsDto {
    private Long id;

    private String name;

    private int original_price;

    private int discounted_price;

    private int discount_percent;

    private String sales_unit;

    private String weight;

    private String origin;

    private String expiration_date;

    private String main_image_url;

    private String detail_img_url;

    private String detail_context;

    private String detail_title;
}
