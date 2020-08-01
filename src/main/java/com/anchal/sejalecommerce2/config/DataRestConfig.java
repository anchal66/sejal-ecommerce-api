package com.anchal.sejalecommerce2.config;


import com.anchal.sejalecommerce2.entity.Product;
import com.anchal.sejalecommerce2.entity.ProductCategory;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;

@Configuration
public class DataRestConfig implements RepositoryRestConfigurer {
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {

        HttpMethod[] unSupportedActions = {HttpMethod.DELETE, HttpMethod.PUT, HttpMethod.POST};

        // diable  HHTP method for Poduct :
        config.getExposureConfiguration()
                .forDomainType(Product.class)
                .withItemExposure((metdata, httpMethods) -> httpMethods.disable(unSupportedActions))
                .withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(unSupportedActions));

        // diable  HHTP method for Product Category :
        config.getExposureConfiguration()
                .forDomainType(ProductCategory.class)
                .withItemExposure((metdata, httpMethods) -> httpMethods.disable(unSupportedActions))
                .withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(unSupportedActions));
    }
}
