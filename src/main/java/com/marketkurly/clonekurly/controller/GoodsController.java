package com.marketkurly.clonekurly.controller;

import com.marketkurly.clonekurly.sevice.GoodsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/goods")
@RequiredArgsConstructor
public class GoodsController {
    private final GoodsService goodsService;

    @GetMapping("/{goodsId}")
    public ResponseEntity<?> getGoods(@PathVariable Long goodsId) {
        return ResponseEntity.ok(goodsService.getGoods(goodsId));
    }

    @GetMapping("{goodsId}/detail")
    public ResponseEntity<?> getGoodsDetail(@PathVariable Long goodsId) {
        return ResponseEntity.ok(goodsService.getGoodsDetail(goodsId));
    }

}
