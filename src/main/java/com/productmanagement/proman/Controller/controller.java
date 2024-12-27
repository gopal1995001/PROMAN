
package com.productmanagement.proman.Controller;

import java.io.IOException;
// import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.productmanagement.proman.Entity.Address;
import com.productmanagement.proman.Entity.PaymentDetails;
import com.productmanagement.proman.Entity.Product;
import com.productmanagement.proman.Entity.ReturnRefund;
import com.productmanagement.proman.ProductRepository.AddressRepository;
import com.productmanagement.proman.ProductRepository.PaymentDetailsRepository;
import com.productmanagement.proman.ProductRepository.ProductRepository;
import com.productmanagement.proman.ProductRepository.ReturnAndRefundRepository;

@RestController
public class controller {

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private PaymentDetailsRepository paymentDetailsRepository ;
    @Autowired
    private ReturnAndRefundRepository returnAndRefundRepository ;

    @Autowired
    private Cloudinary cloudinary;

   @PostMapping("/save")
    public Product createProduct(@RequestPart("image") MultipartFile image,
                                 @RequestPart("product") String productJson) throws IOException {
        // Convert JSON string to Product object
        ObjectMapper objectMapper = new ObjectMapper();
        Product product = objectMapper.readValue(productJson, Product.class);

        // Upload image to Cloudinary
        Map uploadResult = cloudinary.uploader().upload(image.getBytes(), ObjectUtils.emptyMap());

        // Get URL of uploaded image
        String imageUrl = (String) uploadResult.get("url");
        product.setImage(imageUrl);

        // Save product in database
        return productRepository.save(product);
    }

     @GetMapping("/getall")
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
   
  
  @PostMapping("/addressreturn")
  public Address createAddress(@RequestBody Address address) {
    return addressRepository.save(address);
  }

  @PostMapping("/PayDetails")
  public PaymentDetails paymentdetails(@RequestBody PaymentDetails paymentDetails) {
    
      
      return paymentDetailsRepository.save(paymentDetails);
  }

  @PostMapping("/randf")
  public ReturnRefund retandref(@RequestBody ReturnRefund returnrefund) {
      
      
      return returnAndRefundRepository.save(returnrefund);
  }
  
}
