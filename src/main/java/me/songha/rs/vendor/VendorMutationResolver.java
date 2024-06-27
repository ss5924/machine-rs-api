package me.songha.rs.vendor;

import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

@RequiredArgsConstructor
@Controller
public class VendorMutationResolver {

    private final VendorService vendorService;

    @MutationMapping
    public VendorDto create(@Argument VendorInput input) {
        VendorDto vendorDto = VendorDto.builder()
                .vendorAddress(input.getVendorAddress())
                .vendorFax(input.getVendorFax())
                .vendorName(input.getVendorName())
                .build();
        return vendorService.save(vendorDto);
    }

}