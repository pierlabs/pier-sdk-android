package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * response Representation of the Commercial Origin productsOrigin resource
 **/
@ApiModel(description = "response Representation of the Commercial Origin productsOrigin resource")
public class ProdutoOrigemResponse  {
  
  @SerializedName("idProduto")
  private Long idProduto = null;

  
  /**
   * Identifier Code of the Product
   **/
  @ApiModelProperty(value = "Identifier Code of the Product")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProdutoOrigemResponse {\n");
    
    sb.append("  idProduto: ").append(idProduto).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
