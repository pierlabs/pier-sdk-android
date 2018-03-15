package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00E7\u00E3o da requisi\u00E7\u00E3o do  recurso Dispositivo
 **/
@ApiModel(description = "Representa\u00E7\u00E3o da requisi\u00E7\u00E3o do  recurso Dispositivo")
public class AlterarProdutoRequest  {
  
  @SerializedName("idProduto")
  private Long idProduto = null;
  @SerializedName("idOrigemComercial")
  private Long idOrigemComercial = null;
  @SerializedName("idEstabelecimento")
  private Long idEstabelecimento = null;
  @SerializedName("idPromotor")
  private Long idPromotor = null;

  
  /**
   * C\u00F3digo identificador do produto.
   **/
  @ApiModelProperty(required = true, value = "C\u00F3digo identificador do produto.")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * C\u00F3digo identificador da origem comercial.
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador da origem comercial.")
  public Long getIdOrigemComercial() {
    return idOrigemComercial;
  }
  public void setIdOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
  }

  
  /**
   * Deve ser preenchido com o idEstabelecimento onde o Grade foi realizado. Quando n\u00E3o informado, \u00E9 gravado com o idEstabelecimento associado a Origem Comercial que capturou o cadastro inicial da Conta.
   **/
  @ApiModelProperty(value = "Deve ser preenchido com o idEstabelecimento onde o Grade foi realizado. Quando n\u00E3o informado, \u00E9 gravado com o idEstabelecimento associado a Origem Comercial que capturou o cadastro inicial da Conta.")
  public Long getIdEstabelecimento() {
    return idEstabelecimento;
  }
  public void setIdEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
  }

  
  /**
   * Deve ser preenchido com o C\u00F3digo de identifica\u00E7\u00E3o do Promotor que realizou o Grade. Quando n\u00E3o informado, ser\u00E1 gravado com um c\u00F3digo de identifica\u00E7\u00E3o padr\u00E3o.
   **/
  @ApiModelProperty(value = "Deve ser preenchido com o C\u00F3digo de identifica\u00E7\u00E3o do Promotor que realizou o Grade. Quando n\u00E3o informado, ser\u00E1 gravado com um c\u00F3digo de identifica\u00E7\u00E3o padr\u00E3o.")
  public Long getIdPromotor() {
    return idPromotor;
  }
  public void setIdPromotor(Long idPromotor) {
    this.idPromotor = idPromotor;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlterarProdutoRequest {\n");
    
    sb.append("  idProduto: ").append(idProduto).append("\n");
    sb.append("  idOrigemComercial: ").append(idOrigemComercial).append("\n");
    sb.append("  idEstabelecimento: ").append(idEstabelecimento).append("\n");
    sb.append("  idPromotor: ").append(idPromotor).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
