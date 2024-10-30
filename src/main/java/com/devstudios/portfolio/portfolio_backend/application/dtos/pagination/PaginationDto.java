package com.devstudios.portfolio.portfolio_backend.application.dtos.pagination;


import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public class PaginationDto {

    @Min(value=0)
    @NotNull
    private int page;

    @Min(value=1)
    @NotNull
    private int elements;


    public int getPage() {
        return page;
    }
    public void setPage(int page) {
        this.page = page;
    }
    public int getElements() {
        return elements;
    }
    public void setElements(int elements) {
        this.elements = elements;
    }
}
