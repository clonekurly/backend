package com.marketkurly.clonekurly.domain.goods;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Goods {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="goods_id")
    private Long id;

    @Column(length = 45, nullable = false)
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
