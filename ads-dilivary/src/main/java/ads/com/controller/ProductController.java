package ads.com.controller;

import ads.com.request.ProductRequest;
import ads.com.response.ProductResponse;
import ads.com.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    private ProductService productService;
    @PostMapping("/create")
    public ResponseEntity<ProductResponse> addProduct(@RequestBody ProductRequest productRequest)
    {
        return new ResponseEntity<>(productService.addProduct(productRequest), HttpStatus.CREATED);
    }
    @GetMapping("/findall")
    public ResponseEntity<List<ProductResponse>> getAllProducts(){
        return new ResponseEntity<List<ProductResponse>>(productService.findAllProducts(),HttpStatus.ACCEPTED);
    }
}
