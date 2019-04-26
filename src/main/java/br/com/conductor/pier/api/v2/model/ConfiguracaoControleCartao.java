package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto para persist\u00EAncia de Configuracao de Controle do Cartao
 **/
@ApiModel(description = "Objeto para persist\u00EAncia de Configuracao de Controle do Cartao")
public class ConfiguracaoControleCartao  {
  
  @SerializedName("permiteEcommerce")
  private Integer permiteEcommerce = null;
  @SerializedName("permiteSaque")
  private Integer permiteSaque = null;
  @SerializedName("permiteWallet")
  private Integer permiteWallet = null;

  
  /**
   * Flag para autoriza\u00E7\u00E3o de transa\u00E7\u00F5es ecommerce
   **/
  @ApiModelProperty(value = "Flag para autoriza\u00E7\u00E3o de transa\u00E7\u00F5es ecommerce")
  public Integer getPermiteEcommerce() {
    return permiteEcommerce;
  }
  public void setPermiteEcommerce(Integer permiteEcommerce) {
    this.permiteEcommerce = permiteEcommerce;
  }

  
  /**
   * Flag para autoriza\u00E7\u00E3o de transa\u00E7\u00F5es de saque
   **/
  @ApiModelProperty(value = "Flag para autoriza\u00E7\u00E3o de transa\u00E7\u00F5es de saque")
  public Integer getPermiteSaque() {
    return permiteSaque;
  }
  public void setPermiteSaque(Integer permiteSaque) {
    this.permiteSaque = permiteSaque;
  }

  
  /**
   * Flag para autoriza\u00E7\u00E3o de transa\u00E7\u00F5es por meio wallet
   **/
  @ApiModelProperty(value = "Flag para autoriza\u00E7\u00E3o de transa\u00E7\u00F5es por meio wallet")
  public Integer getPermiteWallet() {
    return permiteWallet;
  }
  public void setPermiteWallet(Integer permiteWallet) {
    this.permiteWallet = permiteWallet;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfiguracaoControleCartao {\n");
    
    sb.append("  permiteEcommerce: ").append(permiteEcommerce).append("\n");
    sb.append("  permiteSaque: ").append(permiteSaque).append("\n");
    sb.append("  permiteWallet: ").append(permiteWallet).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
