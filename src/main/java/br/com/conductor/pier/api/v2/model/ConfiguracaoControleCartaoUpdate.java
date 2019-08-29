package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00E7\u00E3o de objeto para altera\u00E7\u00E3o de dados de Configuracao de Controle do Cartao
 **/
@ApiModel(description = "Representa\u00E7\u00E3o de objeto para altera\u00E7\u00E3o de dados de Configuracao de Controle do Cartao")
public class ConfiguracaoControleCartaoUpdate  {
  
  @SerializedName("permiteEcommerce")
  private Boolean permiteEcommerce = null;
  @SerializedName("permiteSaque")
  private Boolean permiteSaque = null;
  @SerializedName("permiteWallet")
  private Boolean permiteWallet = null;
  @SerializedName("permiteControleMCC")
  private Boolean permiteControleMCC = null;
  @SerializedName("permiteCompraInternacional")
  private Boolean permiteCompraInternacional = null;

  
  /**
   * Flag para autoriza\u00E7\u00E3o de transa\u00E7\u00F5es ecommerce
   **/
  @ApiModelProperty(value = "Flag para autoriza\u00E7\u00E3o de transa\u00E7\u00F5es ecommerce")
  public Boolean getPermiteEcommerce() {
    return permiteEcommerce;
  }
  public void setPermiteEcommerce(Boolean permiteEcommerce) {
    this.permiteEcommerce = permiteEcommerce;
  }

  
  /**
   * Flag para autoriza\u00E7\u00E3o de transa\u00E7\u00F5es de saque
   **/
  @ApiModelProperty(value = "Flag para autoriza\u00E7\u00E3o de transa\u00E7\u00F5es de saque")
  public Boolean getPermiteSaque() {
    return permiteSaque;
  }
  public void setPermiteSaque(Boolean permiteSaque) {
    this.permiteSaque = permiteSaque;
  }

  
  /**
   * Flag para autoriza\u00E7\u00E3o de transa\u00E7\u00F5es por wallet
   **/
  @ApiModelProperty(value = "Flag para autoriza\u00E7\u00E3o de transa\u00E7\u00F5es por wallet")
  public Boolean getPermiteWallet() {
    return permiteWallet;
  }
  public void setPermiteWallet(Boolean permiteWallet) {
    this.permiteWallet = permiteWallet;
  }

  
  /**
   * Indica se o cart\u00E3o est\u00E1 ativo para controle por grupos de MCCs
   **/
  @ApiModelProperty(value = "Indica se o cart\u00E3o est\u00E1 ativo para controle por grupos de MCCs")
  public Boolean getPermiteControleMCC() {
    return permiteControleMCC;
  }
  public void setPermiteControleMCC(Boolean permiteControleMCC) {
    this.permiteControleMCC = permiteControleMCC;
  }

  
  /**
   * Indica se o cart\u00E3o est\u00E1 habilitado/desabilitado para transa\u00E7\u00F5es internacionais
   **/
  @ApiModelProperty(value = "Indica se o cart\u00E3o est\u00E1 habilitado/desabilitado para transa\u00E7\u00F5es internacionais")
  public Boolean getPermiteCompraInternacional() {
    return permiteCompraInternacional;
  }
  public void setPermiteCompraInternacional(Boolean permiteCompraInternacional) {
    this.permiteCompraInternacional = permiteCompraInternacional;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfiguracaoControleCartaoUpdate {\n");
    
    sb.append("  permiteEcommerce: ").append(permiteEcommerce).append("\n");
    sb.append("  permiteSaque: ").append(permiteSaque).append("\n");
    sb.append("  permiteWallet: ").append(permiteWallet).append("\n");
    sb.append("  permiteControleMCC: ").append(permiteControleMCC).append("\n");
    sb.append("  permiteCompraInternacional: ").append(permiteCompraInternacional).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
