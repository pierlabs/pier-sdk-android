package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00E7\u00E3o para resposta de dados de Configuracao de Controle do Cartao
 **/
@ApiModel(description = "Representa\u00E7\u00E3o para resposta de dados de Configuracao de Controle do Cartao")
public class ConfiguracaoControleCartaoResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idCartao")
  private Long idCartao = null;
  @SerializedName("permiteEcommerce")
  private Integer permiteEcommerce = null;
  @SerializedName("permiteSaque")
  private Integer permiteSaque = null;
  @SerializedName("permiteWallet")
  private Integer permiteWallet = null;

  
  /**
   * C\u00F3digo Identificador da configura\u00E7\u00E3o na base (id)
   **/
  @ApiModelProperty(value = "C\u00F3digo Identificador da configura\u00E7\u00E3o na base (id)")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00F3digo Identificador do cart\u00E3o na base (id)
   **/
  @ApiModelProperty(value = "C\u00F3digo Identificador do cart\u00E3o na base (id)")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
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
   * Flag para autoriza\u00E7\u00E3o de transa\u00E7\u00F5es por wallet
   **/
  @ApiModelProperty(value = "Flag para autoriza\u00E7\u00E3o de transa\u00E7\u00F5es por wallet")
  public Integer getPermiteWallet() {
    return permiteWallet;
  }
  public void setPermiteWallet(Integer permiteWallet) {
    this.permiteWallet = permiteWallet;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfiguracaoControleCartaoResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idCartao: ").append(idCartao).append("\n");
    sb.append("  permiteEcommerce: ").append(permiteEcommerce).append("\n");
    sb.append("  permiteSaque: ").append(permiteSaque).append("\n");
    sb.append("  permiteWallet: ").append(permiteWallet).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
