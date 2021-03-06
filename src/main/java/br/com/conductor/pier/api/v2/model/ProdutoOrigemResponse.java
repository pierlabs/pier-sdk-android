package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00E7\u00E3o da resposta dos produtosOrigem do recurso de Origem Comercial
 **/
@ApiModel(description = "Representa\u00E7\u00E3o da resposta dos produtosOrigem do recurso de Origem Comercial")
public class ProdutoOrigemResponse  {
  
  @SerializedName("idProduto")
  private Long idProduto = null;

  
  /**
   * C\u00F3digo identificador do produto
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador do produto")
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
