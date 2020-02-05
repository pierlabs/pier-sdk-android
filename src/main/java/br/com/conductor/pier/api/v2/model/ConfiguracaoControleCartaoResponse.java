package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

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
  private Boolean permiteEcommerce = null;
  @SerializedName("permiteSaque")
  private Boolean permiteSaque = null;
  @SerializedName("permiteWallet")
  private Boolean permiteWallet = null;
  @SerializedName("permiteControleMCC")
  private Boolean permiteControleMCC = null;
  @SerializedName("permiteCompraInternacional")
  private Boolean permiteCompraInternacional = null;
  @SerializedName("permiteTarjaMagnetica")
  private Boolean permiteTarjaMagnetica = null;
  @SerializedName("permiteContactless")
  private Boolean permiteContactless = null;
  @SerializedName("limiteContactlessSemSenha")
  private BigDecimal limiteContactlessSemSenha = null;

  
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

  
  /**
   * Indica se o cart\u00E3o est\u00E1 habilitado/desabilitado para transa\u00E7\u00F5es por tarja magnetica
   **/
  @ApiModelProperty(value = "Indica se o cart\u00E3o est\u00E1 habilitado/desabilitado para transa\u00E7\u00F5es por tarja magnetica")
  public Boolean getPermiteTarjaMagnetica() {
    return permiteTarjaMagnetica;
  }
  public void setPermiteTarjaMagnetica(Boolean permiteTarjaMagnetica) {
    this.permiteTarjaMagnetica = permiteTarjaMagnetica;
  }

  
  /**
   * Indica se o cart\u00E3o est\u00E1 habilitado/desabilitado para transa\u00E7\u00F5es via contactless
   **/
  @ApiModelProperty(value = "Indica se o cart\u00E3o est\u00E1 habilitado/desabilitado para transa\u00E7\u00F5es via contactless")
  public Boolean getPermiteContactless() {
    return permiteContactless;
  }
  public void setPermiteContactless(Boolean permiteContactless) {
    this.permiteContactless = permiteContactless;
  }

  
  /**
   * Indica o limite usado em transa\u00E7\u00F5es com a fun\u00E7\u00E3o contactless sem senha. O valor m\u00E1ximo \u00E9 50 e o m\u00EDnimo \u00E9 1.
   **/
  @ApiModelProperty(value = "Indica o limite usado em transa\u00E7\u00F5es com a fun\u00E7\u00E3o contactless sem senha. O valor m\u00E1ximo \u00E9 50 e o m\u00EDnimo \u00E9 1.")
  public BigDecimal getLimiteContactlessSemSenha() {
    return limiteContactlessSemSenha;
  }
  public void setLimiteContactlessSemSenha(BigDecimal limiteContactlessSemSenha) {
    this.limiteContactlessSemSenha = limiteContactlessSemSenha;
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
    sb.append("  permiteControleMCC: ").append(permiteControleMCC).append("\n");
    sb.append("  permiteCompraInternacional: ").append(permiteCompraInternacional).append("\n");
    sb.append("  permiteTarjaMagnetica: ").append(permiteTarjaMagnetica).append("\n");
    sb.append("  permiteContactless: ").append(permiteContactless).append("\n");
    sb.append("  limiteContactlessSemSenha: ").append(limiteContactlessSemSenha).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
