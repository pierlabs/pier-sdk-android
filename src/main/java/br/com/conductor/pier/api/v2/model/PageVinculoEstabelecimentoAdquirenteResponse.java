package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.VinculoEstabelecimentoAdquirenteResponse;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * List of the LinkMerchantAcquirer
 **/
@ApiModel(description = "List of the LinkMerchantAcquirer")
public class PageVinculoEstabelecimentoAdquirenteResponse  {
  
  @SerializedName("content")
  private List<VinculoEstabelecimentoAdquirenteResponse> content = null;
  @SerializedName("first")
  private Boolean first = null;
  @SerializedName("firstPage")
  private Boolean firstPage = null;
  @SerializedName("hasContent")
  private Boolean hasContent = null;
  @SerializedName("hasNextPage")
  private Boolean hasNextPage = null;
  @SerializedName("hasPreviousPage")
  private Boolean hasPreviousPage = null;
  @SerializedName("last")
  private Boolean last = null;
  @SerializedName("nextPage")
  private Integer nextPage = null;
  @SerializedName("number")
  private Integer number = null;
  @SerializedName("numberOfElements")
  private Integer numberOfElements = null;
  @SerializedName("previousPage")
  private Integer previousPage = null;
  @SerializedName("size")
  private Integer size = null;
  @SerializedName("totalElements")
  private Long totalElements = null;
  @SerializedName("totalPages")
  private Integer totalPages = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public List<VinculoEstabelecimentoAdquirenteResponse> getContent() {
    return content;
  }
  public void setContent(List<VinculoEstabelecimentoAdquirenteResponse> content) {
    this.content = content;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getFirst() {
    return first;
  }
  public void setFirst(Boolean first) {
    this.first = first;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getFirstPage() {
    return firstPage;
  }
  public void setFirstPage(Boolean firstPage) {
    this.firstPage = firstPage;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getHasContent() {
    return hasContent;
  }
  public void setHasContent(Boolean hasContent) {
    this.hasContent = hasContent;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getHasNextPage() {
    return hasNextPage;
  }
  public void setHasNextPage(Boolean hasNextPage) {
    this.hasNextPage = hasNextPage;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getHasPreviousPage() {
    return hasPreviousPage;
  }
  public void setHasPreviousPage(Boolean hasPreviousPage) {
    this.hasPreviousPage = hasPreviousPage;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getLast() {
    return last;
  }
  public void setLast(Boolean last) {
    this.last = last;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getNextPage() {
    return nextPage;
  }
  public void setNextPage(Integer nextPage) {
    this.nextPage = nextPage;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getNumber() {
    return number;
  }
  public void setNumber(Integer number) {
    this.number = number;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getNumberOfElements() {
    return numberOfElements;
  }
  public void setNumberOfElements(Integer numberOfElements) {
    this.numberOfElements = numberOfElements;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getPreviousPage() {
    return previousPage;
  }
  public void setPreviousPage(Integer previousPage) {
    this.previousPage = previousPage;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getSize() {
    return size;
  }
  public void setSize(Integer size) {
    this.size = size;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getTotalElements() {
    return totalElements;
  }
  public void setTotalElements(Long totalElements) {
    this.totalElements = totalElements;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getTotalPages() {
    return totalPages;
  }
  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageVinculoEstabelecimentoAdquirenteResponse {\n");
    
    sb.append("  content: ").append(content).append("\n");
    sb.append("  first: ").append(first).append("\n");
    sb.append("  firstPage: ").append(firstPage).append("\n");
    sb.append("  hasContent: ").append(hasContent).append("\n");
    sb.append("  hasNextPage: ").append(hasNextPage).append("\n");
    sb.append("  hasPreviousPage: ").append(hasPreviousPage).append("\n");
    sb.append("  last: ").append(last).append("\n");
    sb.append("  nextPage: ").append(nextPage).append("\n");
    sb.append("  number: ").append(number).append("\n");
    sb.append("  numberOfElements: ").append(numberOfElements).append("\n");
    sb.append("  previousPage: ").append(previousPage).append("\n");
    sb.append("  size: ").append(size).append("\n");
    sb.append("  totalElements: ").append(totalElements).append("\n");
    sb.append("  totalPages: ").append(totalPages).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
