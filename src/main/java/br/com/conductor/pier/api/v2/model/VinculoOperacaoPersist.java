package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Object LinkOperation
 **/
@ApiModel(description = "Object LinkOperation")
public class VinculoOperacaoPersist  {
  
  @SerializedName("idProduto")
  private Long idProduto = null;
  @SerializedName("idOperacao")
  private Long idOperacao = null;
  @SerializedName("codigoMCC")
  private Integer codigoMCC = null;

  
  /**
   * Identification Code of the Product (id)
   **/
  @ApiModelProperty(value = "Identification Code of the Product (id)")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * Identification Code of the Operation (id)
   **/
  @ApiModelProperty(value = "Identification Code of the Operation (id)")
  public Long getIdOperacao() {
    return idOperacao;
  }
  public void setIdOperacao(Long idOperacao) {
    this.idOperacao = idOperacao;
  }

  
  /**
   * Code MCC
   **/
  @ApiModelProperty(value = "Code MCC")
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
