package me.songha.rs.vendor;

import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@RequiredArgsConstructor
@Controller
public class VendorQueryResolver {

    private final VendorService vendorService;

    @QueryMapping
    public VendorDto getVendorById(@Argument Long id) {
        return vendorService.getVendor(id);
    }

}