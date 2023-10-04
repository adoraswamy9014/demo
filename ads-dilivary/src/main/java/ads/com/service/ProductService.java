package ads.com.service;

import ads.com.model.Product;
import ads.com.repository.ProductRepository;
import ads.com.request.ProductRequest;
import ads.com.response.ProductResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public ProductResponse addProduct(ProductRequest productRequest)
    {
        Product product= Product.builder()
                .productName(productRequest.getProductName())
                .price(productRequest.getPrice())
                .quantity(productRequest.getQuantity())
                .build();
       Product productResp= productRepository.save(product);
       ProductResponse productResponse=new ProductResponse();

       return productResponse;
    }

}
