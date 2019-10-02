package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class TipoProdutoPersist  {
  
  @SerializedName("descricao")
  private String descricao = null;
  @SerializedName("flagAntecipacao")
  private Integer flagAntecipacao = null;
  @SerializedName("flagConsignada")
  private Integer flagConsignada = null;
  @SerializedName("flagCreditoBeneficio")
  private Integer flagCreditoBeneficio = null;
  @SerializedName("flagPrePago")
  private Integer flagPrePago = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getFlagAntecipacao() {
    return flagAntecipacao;
  }
  public void setFlagAntecipacao(Integer flagAntecipacao) {
    this.flagAntecipacao = flagAntecipacao;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getFlagConsignada() {
    return flagConsignada;
  }
  public void setFlagConsignada(Integer flagConsignada) {
    this.flagConsignada = flagConsignada;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getFlagCreditoBeneficio() {
    return flagCreditoBeneficio;
  }
  public void setFlagCreditoBeneficio(Integer flagCreditoBeneficio) {
    this.flagCreditoBeneficio = flagCreditoBeneficio;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getFlagPrePago() {
    return flagPrePago;
  }
  public void setFlagPrePago(Integer flagPrePago) {
    this.flagPrePago = flagPrePago;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoProdutoPersist {\n");
    
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("  flagAntecipacao: ").append(flagAntecipacao).append("\n");
    sb.append("  flagConsignada: ").append(flagConsignada).append("\n");
    sb.append("  flagCreditoBeneficio: ").append(flagCreditoBeneficio).append("\n");
    sb.append("  flagPrePago: ").append(flagPrePago).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
