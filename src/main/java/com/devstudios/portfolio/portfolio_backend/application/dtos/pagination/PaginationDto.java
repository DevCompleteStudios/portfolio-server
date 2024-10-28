package com.devstudios.portfolio.portfolio_backend.application.dtos.pagination;


import jakarta.validation.constraints.Min;

public class PaginationDto {

    @Min(value=0)
    private Long page;

    @Min(value=1)
    private Long elements;


    public Long getPage() {
        return page;
    }
    public void setPage(Long page) {
        this.page = page;
    }
    public Long getElements() {
        return elements;
    }
    public void setElements(Long elements) {
        this.elements = elements;
    }
}
