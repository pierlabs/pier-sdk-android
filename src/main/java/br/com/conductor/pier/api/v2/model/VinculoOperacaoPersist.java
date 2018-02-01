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
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Produto (id).
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Produto (id).")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Opera\u00C3\u00A7\u00C3\u00A3o (id).
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Opera\u00C3\u00A7\u00C3\u00A3o (id).")
  public Long getIdOperacao() {
    return idOperacao;
  }
  public void setIdOperacao(Long idOperacao) {
    this.idOperacao = idOperacao;
  }

  
  /**
   * C\u00C3\u00B3digo MCC.
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo MCC.")
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
