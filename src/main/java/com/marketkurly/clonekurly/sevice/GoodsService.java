package com.marketkurly.clonekurly.sevice;

import com.marketkurly.clonekurly.controller.dto.goods.GoodsDto;
import com.marketkurly.clonekurly.domain.goods.Goods;
import com.marketkurly.clonekurly.repository.GoodsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GoodsService {

    private final GoodsRepository goodsRepository;

    public GoodsDto getGoods(Long goodsId) {
        Goods goods = goodsRepository.findById(goodsId).orElseThrow(() -> new RuntimeException("해당 상품을 찾을 수 없습니다. Id = " + goodsId));

        return GoodsDto.builder()
                .id(goods.getId())
                .name(goods.getName())
                .weight(goods.getWeight())
                .origin(goods.getOrigin())
                .expiration_date(goods.getExpiration_date())
                .original_price(goods.getOriginal_price())
                .discounted_price(goods.getDiscounted_price())
                .discount_percent(goods.getDiscount_percent())
                .main_image_url(goods.getMain_image_url())
                .build();
    }

    public GoodsDto getGoodsDetail(Long goodsId) {
        Goods product = goodsRepository.findById(goodsId).orElseThrow(() -> new RuntimeException("해당 상품을 찾을 수 없습니다. Id = " + goodsId));

        return GoodsDto.builder()
                .main_image_url(product.getMain_image_url())
                .detail_img_url(product.getDetail_img_url())
                .detail_context(product.getDetail_context())
                .build();
    }
}
