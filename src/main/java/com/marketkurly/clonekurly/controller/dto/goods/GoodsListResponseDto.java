package com.marketkurly.clonekurly.controller.dto.goods;

import com.marketkurly.clonekurly.domain.goods.Goods;
import lombok.Getter;

@Getter
public class GoodsListResponseDto {

    private Long goods_id;
    private String name;
    private String main_image_url;
    private int original_price;
    private int discounted_price;
    private int discount_percent;

    public GoodsListResponseDto(Goods entity){
        this.goods_id = entity.getId();
        this.name = entity.getName();
        this.main_image_url = entity.getMain_image_url();
        this.original_price = entity.getOriginal_price();
        this.discounted_price = entity.getDiscounted_price();
        this.discount_percent = entity.getDiscount_percent();
    }
}
