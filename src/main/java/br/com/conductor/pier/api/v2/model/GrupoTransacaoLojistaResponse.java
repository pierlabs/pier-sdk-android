package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Descri\u00E7\u00E3o do objeto de resposta do grupo de transa\u00E7\u00E3o lojista
 **/
@ApiModel(description = "Descri\u00E7\u00E3o do objeto de resposta do grupo de transa\u00E7\u00E3o lojista")
public class GrupoTransacaoLojistaResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("descricao")
  private String descricao = null;
  @SerializedName("flagCompra")
  private Boolean flagCompra = null;
  @SerializedName("flagSaque")
  private Boolean flagSaque = null;
  @SerializedName("flagComissao")
  private Boolean flagComissao = null;
  @SerializedName("flagChargeBack")
  private Boolean flagChargeBack = null;
  @SerializedName("flagOutrosDebitos")
  private Boolean flagOutrosDebitos = null;
  @SerializedName("flagPagamento")
  private Boolean flagPagamento = null;
  @SerializedName("flagOutrosCreditos")
  private Boolean flagOutrosCreditos = null;

  
  /**
   * C\u00F3digo identificador do grupo de transa\u00E7\u00E3o lojista
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador do grupo de transa\u00E7\u00E3o lojista")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Descri\u00E7\u00E3o do grupo de transa\u00E7\u00E3o lojista
   **/
  @ApiModelProperty(value = "Descri\u00E7\u00E3o do grupo de transa\u00E7\u00E3o lojista")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Indica se permite compra
   **/
  @ApiModelProperty(value = "Indica se permite compra")
  public Boolean getFlagCompra() {
    return flagCompra;
  }
  public void setFlagCompra(Boolean flagCompra) {
    this.flagCompra = flagCompra;
  }

  
  /**
   * Indica se permite saque
   **/
  @ApiModelProperty(value = "Indica se permite saque")
  public Boolean getFlagSaque() {
    return flagSaque;
  }
  public void setFlagSaque(Boolean flagSaque) {
    this.flagSaque = flagSaque;
  }

  
  /**
   * Indica se recebe comiss\u00E3o
   **/
  @ApiModelProperty(value = "Indica se recebe comiss\u00E3o")
  public Boolean getFlagComissao() {
    return flagComissao;
  }
  public void setFlagComissao(Boolean flagComissao) {
    this.flagComissao = flagComissao;
  }

  
  /**
   * Indica se permite chargeback
   **/
  @ApiModelProperty(value = "Indica se permite chargeback")
  public Boolean getFlagChargeBack() {
    return flagChargeBack;
  }
  public void setFlagChargeBack(Boolean flagChargeBack) {
    this.flagChargeBack = flagChargeBack;
  }

  
  /**
   * Indica se recebe outros d\u00E9bitos
   **/
  @ApiModelProperty(value = "Indica se recebe outros d\u00E9bitos")
  public Boolean getFlagOutrosDebitos() {
    return flagOutrosDebitos;
  }
  public void setFlagOutrosDebitos(Boolean flagOutrosDebitos) {
    this.flagOutrosDebitos = flagOutrosDebitos;
  }

  
  /**
   * Indica pagamento
   **/
  @ApiModelProperty(value = "Indica pagamento")
  public Boolean getFlagPagamento() {
    return flagPagamento;
  }
  public void setFlagPagamento(Boolean flagPagamento) {
    this.flagPagamento = flagPagamento;
  }

  
  /**
   * Indica se recebe outros cr\u00E9ditos
   **/
  @ApiModelProperty(value = "Indica se recebe outros cr\u00E9ditos")
  public Boolean getFlagOutrosCreditos() {
    return flagOutrosCreditos;
  }
  public void setFlagOutrosCreditos(Boolean flagOutrosCreditos) {
    this.flagOutrosCreditos = flagOutrosCreditos;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GrupoTransacaoLojistaResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("  flagCompra: ").append(flagCompra).append("\n");
    sb.append("  flagSaque: ").append(flagSaque).append("\n");
    sb.append("  flagComissao: ").append(flagComissao).append("\n");
    sb.append("  flagChargeBack: ").append(flagChargeBack).append("\n");
    sb.append("  flagOutrosDebitos: ").append(flagOutrosDebitos).append("\n");
    sb.append("  flagPagamento: ").append(flagPagamento).append("\n");
    sb.append("  flagOutrosCreditos: ").append(flagOutrosCreditos).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
