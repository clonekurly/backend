package com.marketkurly.clonekurly.repository;

import com.marketkurly.clonekurly.domain.goods.Goods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GoodsRepository extends JpaRepository<Goods, Long> {

    @Query(value = "select product_id, detail_image_url, sticker_image_url, name, original_price, discounted_price, discount_percent" +
            " from product order by rand() limit :limitCnt", nativeQuery = true)
    List<Goods> findAllRandom(int limitCnt);
}
