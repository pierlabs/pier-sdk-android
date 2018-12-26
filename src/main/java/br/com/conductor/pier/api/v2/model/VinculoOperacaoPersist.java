package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto VinculoOperacao
 **/
@ApiModel(description = "Objeto VinculoOperacao")
public class VinculoOperacaoPersist  {
  
  @SerializedName("idProduto")
  private Long idProduto = null;
  @SerializedName("idOperacao")
  private Long idOperacao = null;
  @SerializedName("codigoMCC")
  private Integer codigoMCC = null;

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do Produto (id)
   **/
  @ApiModelProperty(value = "C\u00F3digo de Identifica\u00E7\u00E3o do Produto (id)")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o da Opera\u00E7\u00E3o (id)
   **/
  @ApiModelProperty(value = "C\u00F3digo de Identifica\u00E7\u00E3o da Opera\u00E7\u00E3o (id)")
  public Long getIdOperacao() {
    return idOperacao;
  }
  public void setIdOperacao(Long idOperacao) {
    this.idOperacao = idOperacao;
  }

  
  /**
   * C\u00F3digo MCC
   **/
  @ApiModelProperty(value = "C\u00F3digo MCC")
  public Integer getCodigoMCC() {
    return codigoMCC;
  }
  public void setCodigoMCC(Integer codigoMCC) {
    this.codigoMCC = codigoMCC;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class VinculoOperacaoPersist {\n");
    
    sb.append("  idProduto: ").append(idProduto).append("\n");
    sb.append("  idOperacao: ").append(idOperacao).append("\n");
    sb.append("  codigoMCC: ").append(codigoMCC).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
