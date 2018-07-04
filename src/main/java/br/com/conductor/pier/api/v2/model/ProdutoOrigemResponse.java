package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{produto_origem_response_description}}}
 **/
@ApiModel(description = "{{{produto_origem_response_description}}}")
public class ProdutoOrigemResponse  {
  
  @SerializedName("idProduto")
  private Long idProduto = null;

  
  /**
   * {{{produto_origem_response_id_produto_value}}}
   **/
  @ApiModelProperty(value = "{{{produto_origem_response_id_produto_value}}}")
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


