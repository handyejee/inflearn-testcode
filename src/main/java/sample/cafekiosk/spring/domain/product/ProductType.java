package sample.cafekiosk.spring.domain.product;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ProductType {

    HANDMADE("제조 음료"),
    BOTTLE("병 음료"),
    BAKERY("베이커리");

    private final String text;

    @Enumerated(EnumType.STRING) // enum 이름을 문자열로 저장
    private ProductType type;
}
