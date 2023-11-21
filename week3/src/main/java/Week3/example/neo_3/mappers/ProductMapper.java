package Week3.example.neo_3.mappers;

import Week3.example.neo_3.dto.ProductDto;
import Week3.example.neo_3.entities.ProductEntity;

public class ProductMapper {
    public static ProductDto mapToProductDto(ProductEntity product){
        ProductDto productDto = new ProductDto(
                product.getId(),
                product.getType(),
                product.getProduction(),
                product.getInitialPrice(),
                product.getQuantity()
        );
                return productDto;
    }
    public static ProductEntity mapToProductEntity(ProductDto productDto){
        ProductEntity productEntity = new ProductEntity(
                productDto.getId(),
                productDto.getType(),
                productDto.getProduction(),
                productDto.getInitialPrice(),
                productDto.getQuantity()
                );
        return productEntity;
    }
}
